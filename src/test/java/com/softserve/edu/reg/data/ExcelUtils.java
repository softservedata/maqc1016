package com.softserve.edu.reg.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils implements IExternalData {
	private final String FILE_NOT_READ = " File %s could not be read";
	private final String FILE_NOT_ACCESIBLE = " File %s could not be Accesible";
	private final String FILE_NOT_CLOSE = " File %s could not be closed";

	public List<List<String>> getAllCells(String absoluteFilePath) {
		List<List<String>> allRows = new ArrayList<List<String>>();
		InputStream inputStream = null;
		DataFormatter formatter = new DataFormatter();
		// For *.xls files
		// HSSFWorkbook workBook;
		// For *.xlsx files
		// XSSFWorkbook workBook = null;
		XSSFWorkbook workBook = null;
		Sheet sheet = null;
		try {
			// System.out.println("filename=" + filename);
			inputStream = new FileInputStream(absoluteFilePath);
			// workBook = new HSSFWorkbook(inputStream);
			workBook = new XSSFWorkbook(inputStream);
			// sheet = (new XSSFWorkbook(inputStream)).getSheetAt(0);
			sheet = workBook.getSheetAt(0);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(String.format(FILE_NOT_READ, absoluteFilePath));
			// throw new GeneralCustomException(String.format(FILE_NOT_READ,
			// absoluteFilePath));
		} catch (IOException e) {
			throw new RuntimeException(String.format(FILE_NOT_ACCESIBLE, absoluteFilePath));
			// throw new
			// GeneralCustomException(String.format(FILE_NOT_ACCESIBLE,
			// absoluteFilePath));
		}
		// Sheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rowsIterator = sheet.iterator();
		while (rowsIterator.hasNext()) {
			Row row = rowsIterator.next();
			Iterator<Cell> cellsIterator = row.iterator();
			List<String> allCells = new ArrayList<String>();
			while (cellsIterator.hasNext()) {
				// String cell = cellsIterator.next().getStringCellValue();
				String cell = formatter.formatCellValue(cellsIterator.next());
				// allCells.add(cellsIterator.next().getStringCellValue());
				allCells.add(cell);
			}
			allRows.add(allCells);
		}
		if (workBook != null) {
			try {
				workBook.close();
			} catch (IOException e) {
				throw new RuntimeException(String.format(FILE_NOT_CLOSE, absoluteFilePath), e);
			}
		}
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
				throw new RuntimeException(String.format(FILE_NOT_CLOSE, absoluteFilePath), e);
				// throw new
				// GeneralCustomException(String.format(FILE_NOT_CLOSE,
				// absoluteFilePath), e);
			}
		}
		return allRows;
	}

}

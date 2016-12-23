package com.softserve.edu.reg.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CSVUtils implements IExternalData {
	private final String PROPERTIES_EXCEPTION_FOUND = "File %s could not be found";
	private final String PROPERTIES_EXCEPTION_READ = "File %s could not be read";
	private final String PROPERTIES_EXCEPTION_CLOSE = "File %s could not be closed";
	private final String CSV_SPLIT_BY = ";";

	public List<List<String>> getAllCells(String absoluteFilePath) {
		List<List<String>> allCells = new ArrayList<List<String>>();
		String row;
		// List<String> row;
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(absoluteFilePath));
			while ((row = bufferedReader.readLine()) != null) {
				allCells.add(Arrays.asList(row.split(CSV_SPLIT_BY)));
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(String.format(PROPERTIES_EXCEPTION_FOUND, absoluteFilePath), e);
		} catch (IOException e) {
			throw new RuntimeException(String.format(PROPERTIES_EXCEPTION_READ, absoluteFilePath), e);
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new RuntimeException(String.format(PROPERTIES_EXCEPTION_CLOSE, absoluteFilePath), e);
				}
			}
		}
		return allCells;
	}

}

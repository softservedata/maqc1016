package com.softserve.edu.reg.data;

import java.util.List;

public interface IExternalData {

	List<List<String>> getAllCells(String absoluteFilePath);

}

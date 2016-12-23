package com.softserve.edu.reg.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtils implements IExternalData {
	private final String SQL_EXCEPTION_FOUND = "SQL Exception found";
	//
	// TODO This is hardcode. Must be refactor
//	private String username = "root";
//	private String password = "root";
//	private String url = "jdbc:mysql://localhost:1100/users";
	private String username = "109db";
	private String password = "109db";
	private String url = "jdbc:jtds:sqlserver://CLASS86/NewUsers;instance=SQLEXPRESS2;";

	public List<List<String>> getAllCells(String absoluteFilePath) {
		List<List<String>> allCells = new ArrayList<List<String>>();
		List<String> rowCells = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int columnCount = 0;
		//
		try {
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(SQL_EXCEPTION_FOUND, e);
		}
		// TODO Delete messages
		if (con != null) {
			System.out.println("+++Connection Successful! \n");
		} else {
			System.out.println("+++Connection fail \n");
			System.exit(0);
		}
		try {
			st = con.createStatement();
			rs = st.executeQuery("select Firstname, Lastname, Email, Login, Password, Community from Users;");
			columnCount = rs.getMetaData().getColumnCount();
			//
			while (rs.next()) {
				rowCells = new ArrayList<String>();
				for (int i = 1; i <= columnCount; i++) {
					rowCells.add(rs.getString(i));
					System.out.print("+++\t" + rs.getString(i) + "\t");
				}
				allCells.add(rowCells);
				System.out.println();
			}
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(SQL_EXCEPTION_FOUND, e);
		}
		return allCells;
	}

}
package com.softserve.edu.reg.data;

import java.util.ArrayList;
import java.util.List;

public final class UserUtils {
	private String filename;
	private IExternalData externalData;

	public UserUtils() {
		filename = "/newUsers.csv";
		externalData = new CSVUtils();
	}

	public UserUtils(String filename, IExternalData externalData) {
		this.filename = filename;
		this.externalData = externalData;
	}

	public List<IUser> getAllUsers() {
		System.out.println("+++ Path to file: "
				+ this.getClass().getResource(filename).getPath());
		return getAllUsers(this.getClass().getResource(filename).getPath().substring(1));
	}

	public List<IUser> getAllUsers(String absoluteFilePath) {
		List<IUser> users = new ArrayList<IUser>();
		for (List<String> row : externalData.getAllCells(absoluteFilePath)) {
			if (row.get(5).toLowerCase().contains("community") || row.get(3).toLowerCase().contains("login")) {
				continue;
			}
			users.add(User.get()
					.setFirstname(row.get(0))
					.setLastname(row.get(1))
					.setEmail(row.get(2))
					.setLogin(row.get(3))
					.setPassword(row.get(4))
					.setCommunity(row.get(5))
					.build());
		}
		return users;
	}

}

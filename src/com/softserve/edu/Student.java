package com.softserve.edu;

public class Student implements Comparable<Student> {
	public int id;
	public String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student tmp) {
		//return id-tmp.id;
		return name.compareTo(tmp.name);
	}
}

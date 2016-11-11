package com.softserve.edu;

import java.util.Arrays;

public class ApplStud {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(52645, "Smith");
		students[1] = new Student(98765, "Jones");
		students[2] = new Student(1354, "Johnson");
		//
		System.out.println("unsorted");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].id + "\t" + students[i].name);
		}
		Arrays.sort(students);
		System.out.println("sorted");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].id + "\t" + students[i].name);
		}
	}
}

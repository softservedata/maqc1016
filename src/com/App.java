package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		String[] sa = { "one", "two", "three", "four" };
		List<String> sList = Arrays.asList(sa); // make a List
		//
		List<String> sList2 = new ArrayList<>();
		for (String s : sa) {
			sList2.add(s);
		}
		//
		System.out.println("size " + sList.size());
		System.out.println("sList= " + sList);
		//
		sa[1] = "five"; // change array
		sList.set(3, "six"); // change List
		//
		System.out.println("Array:");
		for (String s : sa) {
			System.out.print(s + " ");
		}
		System.out.println("\nsList= " + sList);
		//sList.add("nine");
		sList2.add("nine");
		System.out.println("\nsList2= " + sList2);
	}
}

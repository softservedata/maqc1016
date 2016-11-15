package com.softserve.test;

public class Appl {

	public void work(int i) { // Overload
		i = i + 1;
		System.out.println("work done, i=" + i);
	}

	public void work(StringBuilder sb) { // Overload
		sb.append(" work added");
		System.out.println("work done, sb=" + sb);
	}

	public static void main(String[] args) {


	}
}

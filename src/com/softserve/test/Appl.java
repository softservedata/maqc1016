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

	public void work(String str) { // Overload
		str = str + " work added by Danylo";
		System.out.println("work done, str=" + str);
	}

	public static void main(String[] args) {
		Appl appl = new Appl();
		//
//		int i = 1;
//		appl.work(i);
//		System.out.println("main i=" + i);
		//
//		StringBuilder sb = new StringBuilder("123");
//		appl.work(sb);
//		System.out.println("main sb=" + sb);
		//
		 String str = new String("123");
		 appl.work(str);
		 System.out.println("main str=" + str);

	}
}

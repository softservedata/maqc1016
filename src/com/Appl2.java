package com;

import java.util.ArrayList;
import java.util.List;

public class Appl2 {
	public static void main(String[] args) {

		List<Integer> iL = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			iL.add(i);
		}
		System.out.println("iL=" + iL);
		//
		Object[] oa = iL.toArray(); // create an Object array
		//
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2);
		//
		oa[1] = new Integer(22);
		ia2[1] = 12;
		//
		for (int i = 0; i < ia2.length; i++) {
			System.out.println("ia2= " + ia2[i] + "  oa: " + oa[i]);
		}
		System.out.println("iL=" + iL);
	}
}

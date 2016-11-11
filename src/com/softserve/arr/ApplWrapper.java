package com.softserve.arr;

public class ApplWrapper {
	public static void main(String[] args) {
		String text = "Hello World";
		WrapperBox box = new WrapperBox();
		box.set(text);
		//Integer i = (Integer) box.get();  // ERROR
		System.out.println("done");
	}
}

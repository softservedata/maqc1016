package com.softserve.train;

public class Appl {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("1 + 1 = " + calc.add(1, 1));
		System.out.println("10 / 5 = " + calc.div(10, 5));
		//
		int i = 0;
		double d = 0;
		try {
			d = 1 / 0.;
			i = 1 / 0;
			System.out.println("i=" + i);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException found");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException found");
		}
		System.out.println("END i=" + i + "   d=" + d);
	}
}

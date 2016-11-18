package com.softserve.train;

import org.testng.annotations.Test;

public class TestNGTest2 {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		System.out.println("@Test(expectedExceptions = ArithmeticException.class)");
		int i = 1 / 0;
	}
	
}

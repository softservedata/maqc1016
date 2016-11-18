package com.softserve.train;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalcTest {

	@BeforeClass
	//public static void setUpBeforeClass() throws Exception { // static for JUnit
	public void setUpBeforeClass() throws Exception { 
		System.out.println("@BeforeClass");
	}

	@AfterClass
	//public static void tearDownAfterClass() throws Exception { // static for JUnit
	public void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	//@Before // for JUnit
	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	//@After // for JUnit
	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test
	public void testAdd1() {
		System.out.println("@Test testAdd1()");
		Calc calc = new Calc();
		double expected = 10;
		double actual = calc.add(5, 5);
		Assert.assertEquals(expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testAdd2() {
		System.out.println("@Test testAdd2()");
		Calc calc = new Calc();
		double expected = 10;
		double actual = calc.add(6, 4);
		Assert.assertEquals(expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		System.out.println("@Test testDiv()");
		//int i = 1 / 0;
		Calc calc = new Calc();
		double expected = 2.5;
		double actual = calc.div(10, 4);
		Assert.assertEquals(expected, actual, 0.001);
		// fail("Not yet implemented");
	}

}

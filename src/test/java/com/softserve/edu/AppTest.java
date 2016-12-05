package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testApp() {
		System.out.println("\nsurefire.reports.directory = "
				+ System.getProperty("surefire.reports.directory"));
		System.out.println("\nselenium-version = "
				+ System.getProperty("selenium-version"));
		Assert.assertTrue(true);
	}

}

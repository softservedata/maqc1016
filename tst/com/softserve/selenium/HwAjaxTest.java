package com.softserve.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HwAjaxTest {
	
	private void takeScreen(WebDriver driver, String filename) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(filename));
	}
	@Test
	public void testLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"./lib/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		WebDriver driver = new ChromeDriver(options);
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com/xml/ajax_intro.asp");
		takeScreen(driver,"./pics/HwAjaxTest/before.png");
		driver.findElement(By.xpath("//div[@id='demo']/button")).click();
		driver.findElement(By.xpath("//div[@id='demo']/p"));
		takeScreen(driver,"./pics/HwAjaxTest/after.png");
		String expected = new String("AJAX\n" 
				+ "AJAX is not a programming language.\n"
				+ "AJAX is a technique for accesing web servers from a web page.\n"
				+ "AJAX stands for Asyncronous JavaScript And XML.");
		// Check
		Assert.assertEquals(driver.findElement(By
				.id("demo")).getText(), expected);
		System.out.println(driver.findElement(By.id("demo")).getText());
		Thread.sleep(2000);
		driver.quit();

	}
}

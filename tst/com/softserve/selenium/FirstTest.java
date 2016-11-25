package com.softserve.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void testFirst() throws Exception {
		//WebDriver driver = new FirefoxDriver();
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		driver.get("https://www.google.com.ua/");
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.clear();
		search.sendKeys("selenium download");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.linkText("Downloads - Selenium")).click();
		//
		WebElement actual = driver.findElement(By.xpath("//div[@id='mainContent']/p[2]"));
		String expected = "The Selenium Server is needed in order to run Remote Selenium WebDriver. Selenium 3.X is no longer capable of running Selenium RC directly, rather it does it through emulation and the WebDriverBackedSelenium interface.";
		Assert.assertEquals(actual.getText(), expected);
		//
		Thread.sleep(2000);
		driver.quit();
	}

}

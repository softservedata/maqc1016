package com.softserve.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HwLoginTest {
	
	@Test
	public void testLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://registrator.herokuapp.com/login/");
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("test");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("qwerty");
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		System.out.println("Page title is: " + driver.getTitle());
		// Check
		Assert.assertEquals(driver.findElement(By
				.xpath("//button[@class='btn btn-primary btn-sm']")).getText(), "test");
		//
		// Return to previous state
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm.dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/logout')]")).click();
		//
		driver.quit();
	}
}
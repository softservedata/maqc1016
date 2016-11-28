package com.softserve.edu.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void checkAdminLogin() throws Exception {
		// Precondition
		//System.setProperty("webdriver.gecko.driver",
		//		"./lib/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		driver.get("http://registrator.herokuapp.com/login");
		Thread.sleep(2000);
		// Test Steps
		//
		/*- Code Smell
		// Variant 1
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		login.clear();
		login.sendKeys("hahaha");
		Thread.sleep(2000);
		//
		driver.navigate().refresh();
		login.sendKeys("test"); // ERROR !!!
		*/
		//
		// Variant 2
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("hahaha");
		Thread.sleep(2000);
		//
		driver.navigate().refresh();
		driver.findElement(By.id("login")).sendKeys("test"); // No Error
		//
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("qwerty");
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		//
		// Check
		Assert.assertEquals(driver.findElement(By
				.xpath("//button[@class='btn btn-primary btn-sm']")).getText(), "test");
		//
		// Return to previous state
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm.dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/logout')]")).click();
		//
		Thread.sleep(2000);
		driver.quit();
	}

}

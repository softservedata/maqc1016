package com.softserve.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HwLoginTestng {
	
	@Test
	public void testLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vromank/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://registrator.herokuapp.com/login/");
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("test");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("qwerty");
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.textToBe(By.xpath("//div[@class='btn-group']/button[1]"), "test"));
		driver.quit();
	}
}
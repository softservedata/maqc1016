package com.softserve.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example {
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new FirefoxDriver();
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		//
		System.out.println("Page title is: " + driver.getTitle());
		// Thread.sleep(500);
		// driver.findElements(By.partialLinkText("Cheese"));
		//
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 5)).until(ExpectedConditions.titleContains("heese"));
		//
		System.out.println("Page title is: " + driver.getTitle());
		// Close the browser
		//driver.findElements(By.partialLinkText("1heese"));
		List<WebElement> links = driver.findElements(By.partialLinkText("1heese"));
		System.out.println("count of links = " + links.size());
		//
		((JavascriptExecutor)driver).executeScript("alert('Ha-Ha-Ha')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.quit();
	}
}

package com.softserve.edu.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AjaxTest {

	@Test
	public void checkW3C() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/xml/ajax_intro.asp");
		Thread.sleep(1000);
		//
		// find WebElement.
		WebElement ajaxChange = (new WebDriverWait(driver, 10)).until(
				 ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#demo h2"))
				);
		Assert.assertEquals(ajaxChange.getText(), "Let AJAX change this text");
		//
		Thread.sleep(1000);
		// find WebElement and Click.
		(new WebDriverWait(driver, 10)).until(
				 ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#demo button"))
				).click();
		// Wait until an element is no longer attached to the DOM.
		(new WebDriverWait(driver, 10)).until(
				 ExpectedConditions.stalenessOf(ajaxChange)
				);
		// Check
		Thread.sleep(1000);
		Assert.assertEquals((new WebDriverWait(driver, 10)).until(
				 ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#demo h1"))
				).getText(), "AJAX");
		driver.quit();
	}
}

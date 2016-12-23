package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class AppActions {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World!");
		//
		System.setProperty("webdriver.chrome.driver",
				AppActions.class.getResource("/lib/chromedriver.exe").getPath().substring(1));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		//
		WebElement seleniumIDE = driver.findElement(By.name("selenium_ide"));
		// WebElement seleniumIDE =driver.findElement(By.partialLinkText("plugin
		// tutorial page"));
		// WebElement seleniumIDE =driver.findElement(By.partialLinkText("see
		// the wiki page"));
		//
		new Actions(driver).moveToElement(seleniumIDE).perform();
		// seleniumIDE.sendKeys(new String());
		// new Actions(driver).sendKeys(Keys.ENTER);
		// new Actions(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		//
		driver.get("http://www.google.com.ua");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("cheese" + Keys.ENTER + Keys.TAB + Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
	}

}

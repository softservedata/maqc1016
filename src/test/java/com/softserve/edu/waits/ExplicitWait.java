package com.softserve.edu.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		//WebElement element = driver.findElement(By.name("q")); // Implicit
		WebElement element = (new WebDriverWait(driver, 10)).until(
				 ExpectedConditions.visibilityOfElementLocated(By.name("q"))
				);
		element.sendKeys("Cheese!");
		element.submit();
		//
		// driver.findElement(By.partialLinkText("Cheese - Wikipedia")).click();
		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		// Wait
		// Thread.sleep(1000);
		// driver.findElement(By.partialLinkText("Cheese - Wikipedia"));
		//
		(new WebDriverWait(driver, 10)).until(
				 ExpectedConditions.titleContains("heese!")
				);
//		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//			@Override
//			public Boolean apply(WebDriver d) {
//				System.out.println("Running apply ...");
//				return d.getTitle().toLowerCase().startsWith("cheese!");
//			}
//		});
		// Should see: "cheese! - Google Search"
		System.out.println("Page title is: " + driver.getTitle());
		// Close the browser
		driver.quit();
	}

}

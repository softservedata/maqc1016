package com.softserve.edu;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Browsers {

	// @Test // 2.53.1
	public void testFirefox1() throws Exception {
		WebDriver driver = new FirefoxDriver();
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		Thread.sleep(2000);
		driver.quit();
	}

	//@Test // 3.0.1
	public void testFirefox12() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
		// "C:\Users\yharasym.TRAINING\workspace\maqc1016\lib\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 //
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
		 WebElement element = driver.findElement(By.name("q"));
		 element.sendKeys("Cheese!");
		 element.submit();
		 Thread.sleep(2000);
		 driver.quit();
	}

	//@Test
    public void testFirefox2() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
        ProfilesIni profileIni = new ProfilesIni();
        FirefoxProfile profile = profileIni.getProfile("default");
        profile.setAcceptUntrustedCertificates(true);
        profile.setPreference("app.update.enabled", false);
        WebDriver driver = new FirefoxDriver(profile);
        //
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        Thread.sleep(2000);
        //driver.quit();
    }
    
    @Test
  	public void testFirefox3() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
  		FirefoxProfile profile = new FirefoxProfile();
  		File file = new File("./lib/firebug-2.0.18-fx.xpi");
  		profile.addExtension(file);
  		profile.setAcceptUntrustedCertificates(true);
  		profile.setPreference("app.update.enabled", false);
  		profile.setPreference("extensions.firebug.currentVersion","2.0.18");
  		WebDriver driver = new FirefoxDriver(profile);
  		//
  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  		driver.get("http://www.google.com");
  		WebElement element = driver.findElement(By.name("q"));
  		element.sendKeys("Cheese!");
  		element.submit();
  		Thread.sleep(2000);
  		//driver.quit();
  	}
}

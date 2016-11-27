package com.softserve.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by forgedone on 27.11.2016.
 */
public class Example1 {

    @Test
    public void test1() throws InterruptedException {

        String pattern = new String("(https?):\\/\\/.*?(youtube\\.com).*");

        System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        //driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);

        driver.get("https://google.com");
        WebElement searchBar = driver.findElement(By.id("lst-ib"));
        searchBar.click();
        searchBar.sendKeys("Youtube");
        searchBar.submit();

        System.out.println("Current URL: " + driver.getCurrentUrl());

        WebElement firstLink = driver.findElement(By.cssSelector("h3.r>a"));
        firstLink.click();

        //find element = page is loaded
        driver.findElement(By.id("masthead-search-term"));

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(driver.getCurrentUrl());

        Assert.assertTrue(matcher.matches());

        System.out.println("Current URL: " + driver.getCurrentUrl());





        //use only for teching
        Thread.sleep(5000);
        driver.quit();
    }
}

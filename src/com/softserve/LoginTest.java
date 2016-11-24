package com.softserve;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dshevch on 24.11.2016.
 */
public class LoginTest {
    public static void runtest(){

        System.setProperty("webdriver.chrome.driver", "src/com/softserve/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://registrator.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('login').setAttribute('value', 'test')");
        js.executeScript("document.getElementById('password').setAttribute('value', 'qwerty')");
        js.executeScript("document.getElementsByClassName('btn btn-primary')[0].click()");

    }
}

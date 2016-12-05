package com.softserve.edu.reg.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.reg.data.IUser;
import com.softserve.edu.reg.data.User;
import com.softserve.edu.reg.pages.AdminHomePage;
import com.softserve.edu.reg.pages.LoginPage;

public class LoginTest {

	@DataProvider//(parallel = true)
	public Object[][] validUsers() {
		return new Object[][] { 
			{ new User("test", "qwerty") },
			{ new User("admin1", "admin1") }
			};
		}
	
	@Test(dataProvider = "validUsers")
	public void checkAdminLogin(IUser admin) throws Exception {
		// Precondition
		System.out.println("+++PATH = " 
				+ this.getClass().getResource("/lib/chromedriver.exe").getPath().substring(1));
		System.setProperty("webdriver.chrome.driver",
				this.getClass().getResource("/lib/chromedriver.exe").getPath().substring(1));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://registrator.herokuapp.com/login");
		Thread.sleep(2000);
		//
		// Test steps.
		LoginPage loginPage = new LoginPage(driver);
		AdminHomePage adminHomePage = loginPage.successAdminLogin(admin);
		Thread.sleep(2000);
		driver.quit();
	}

}

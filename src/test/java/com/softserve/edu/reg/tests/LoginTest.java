package com.softserve.edu.reg.tests;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.reg.apps.ApplicationSources;
import com.softserve.edu.reg.apps.ApplicationSourcesRepository;
import com.softserve.edu.reg.data.IUser;
import com.softserve.edu.reg.data.UserRepository;
import com.softserve.edu.reg.pages.AdminHomePage;
import com.softserve.edu.reg.pages.Application;
import com.softserve.edu.reg.pages.HomePage;
import com.softserve.edu.reg.pages.LoginPage;

public class LoginTest {
	public static final Logger logger = LoggerFactory.getLogger(LoginTest.class);

	@AfterClass
	public void afterClass() {
		logger.info("@AfterClass Start");
		System.out.println("@AfterClass");
		Application.remove();
		logger.info("@AfterClass Done");
	}

	@AfterMethod
	public void afterMethod() throws IOException {
		logger.info("@AfterMethod Start");
		System.out.println("@AfterMethod");
		Application.get().logout();
		//Application.remove();
		logger.info("@AfterMethod Done");
	}

	
	@DataProvider//(parallel = true)
	public Object[][] validAdmin() {
		logger.info("@DataProvider validAdmin() Start");
		return new Object[][] { 
//			{ new User("test", "qwerty") },
//			{ new User("admin1", "admin1") }
//			{ ApplicationSourcesRepository.getFirefox5002Training(),
//					UserRepository.get().admin() },
			{ ApplicationSourcesRepository.getChromeTraining(),
					UserRepository.get().admin() },
			{ ApplicationSourcesRepository.getChromeTraining(),
						UserRepository.get().adminTest() },
			};
		}
	
	//@Test(dataProvider = "validAdmin")
	public void checkAdminLogin(ApplicationSources applicationSources,
			IUser admin) throws Exception {
		logger.info("@Test checkAdminLogin(...) Start");
		// Precondition
//		System.out.println("+++PATH = " 
//				+ this.getClass().getResource("/lib/chromedriver.exe").getPath().substring(1));
//		System.setProperty("webdriver.chrome.driver",
//				this.getClass().getResource("/lib/chromedriver.exe").getPath().substring(1));
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		//driver.get("http://registrator.herokuapp.com/login");
//		driver.get("http://java.training.local:8080/registrator/login");
//		Thread.sleep(2000);
		//
		// Test steps.
		//LoginPage loginPage = new LoginPage(driver);
		LoginPage loginPage = Application.get(applicationSources).load();
		//LoginPage loginPage = Application.get().load();
		Thread.sleep(2000);
		//
		AdminHomePage adminHomePage = loginPage.successAdminLogin(admin);
		Thread.sleep(2000);
		//
		// Check
		Assert.assertEquals(adminHomePage.getLoginAccountText(),
				admin.getLogin());
		Thread.sleep(2000);
		//
		// Return to previous state
		adminHomePage.clickLogout();
		// driver.quit();
		//Application.get().quit();
		logger.info("@Test checkAdminLogin(...) Done");
	}

	@DataProvider //(parallel = true)
	public Object[][] coownerLogin() {
		logger.info("@DataProvider coownerLogin(...) Start");
		return new Object[][] {
			//{ ApplicationSourcesRepository.getChromeHeroku(), UserRepository.getAdmin() },
			{ ApplicationSourcesRepository.getChromeTraining(),
				UserRepository.get().admin() },
			{ ApplicationSourcesRepository.getChromeTraining(),
					UserRepository.get().adminTest() },
			{ ApplicationSourcesRepository.getChromeTraining(),
						UserRepository.get().registrator() },
			{ ApplicationSourcesRepository.getChromeTraining(),
							UserRepository.get().coowner() },
		};
	}
	
	@Test(dataProvider = "coownerLogin")
	public void checkCoownerLogin(ApplicationSources applicationSources,
			IUser user) throws Exception {
		logger.info("@Test checkCoownerLogin(...) Start User= " + user.getLogin());
		// Precondition
		LoginPage loginPage = Application.get(applicationSources).load();
		//
		// Steps
		HomePage homePage = loginPage.successUserLogin(user);
		//
		// Check
		Assert.assertEquals(homePage.getLoginAccountText(),
				user.getLogin());
		//
		// Return to previous state
		Thread.sleep(2000);
		homePage.clickLogout();
		//Thread.sleep(2000);
		logger.info("@Test checkCoownerLogin(...) Done");
	}
		
}

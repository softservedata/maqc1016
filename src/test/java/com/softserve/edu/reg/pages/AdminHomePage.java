package com.softserve.edu.reg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.softserve.edu.reg.data.IUser;

public class AdminHomePage {
	
	// Locators
	//
	private static final String LOGGED_USER_BUTTON_XPATH = "//button[@class='btn btn-primary btn-sm']";
    private static final String LOGGED_USER_DROPDOWN_BUTTON_CSSSELECTOR =".btn.btn-primary.btn-sm.dropdown-toggle";
    private static final String CHANGE_PASSWORD_CSSSELECTOR ="a.change-password";
    private static final String RESET_PASSWORD_CSSSELECTOR ="a.reset_password";
    private static final String LOGOUT_XPATH ="//a[contains(@href,'/logout')]";
    private static final String HOME_CSSSELECTOR ="a.glyphicon-home";
    private static final String USERS_CSSSELECTOR ="a.dropdown-toggle";
    private static final String GET_ACTIVE_USERS_XPATH ="//a[contains(@href,'/administrator/users/get-all-users')]";
    private static final String GET_INACTIVE_USERS_XPATH =
    		"//a[contains(@href,'/administrator/users/get-all-users?statusType=inactive')] ";
    private static final String GET_NOTCONFIRMED_USERS_XPATH =
    		"//a[contains(@href,'/administrator/users/get-all-users?statusType=notconfirmed')]";
    private static final String GET_BLOCKED_USERS_XPATH =
    		"//a[contains(@href,'/administrator/users/get-all-users?statusType=block')]";
    private static final String SETTINGS_XPATH = "//a[contains(@href,'/administrator/settings')]";    
    private static final String COMMUNITIES_XPATH = "//a[contains(@href,'/administrator/communities')]";    
    private static final String MANUAL_REGISTRATION_XPATH = "//a[contains(@href,'/manualregistration')]";
    private static final String UNLOCK_USERS_CSSSELECTOR = "a.unlockUsers]";
    
	// Fields
	private WebDriver driver;

    //Constructor
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// PageObject
	// get Data

		public WebElement getLoggedUser() {
			return driver.findElement(By.xpath(LOGGED_USER_BUTTON_XPATH));
		}

		public WebElement getLoggedUserDropdown() {
			return driver.findElement(By.cssSelector(LOGGED_USER_DROPDOWN_BUTTON_CSSSELECTOR));
		}

		public WebElement getChangePassword() {
			return driver.findElement(By.cssSelector(CHANGE_PASSWORD_CSSSELECTOR));
		}

		public WebElement getResetPasword() {
			return driver.findElement(By.cssSelector(RESET_PASSWORD_CSSSELECTOR));
		}

		public WebElement getLogout() {
			return driver.findElement(By.xpath(LOGOUT_XPATH));
		}

		public WebElement getHome() {
			return driver.findElement(By.cssSelector(HOME_CSSSELECTOR));
		}
		
		public WebElement getUsers() {
			return driver.findElement(By.cssSelector(USERS_CSSSELECTOR));
		}

		public WebElement getActiveUsers() {
			return driver.findElement(By.xpath(GET_ACTIVE_USERS_XPATH));
		}

		public WebElement getInactiveUsers() {
			return driver.findElement(By.xpath(GET_INACTIVE_USERS_XPATH));
		}

		public WebElement getNotConfirmedUsers() {
			return driver.findElement(By.xpath(GET_NOTCONFIRMED_USERS_XPATH));
		}

		public WebElement getBlockedUsers() {
			return driver.findElement(By.xpath(GET_BLOCKED_USERS_XPATH));
		}

		public WebElement getSettings() {
			return driver.findElement(By.xpath(SETTINGS_XPATH));
		}
		
		public WebElement getCommunities() {
			return driver.findElement(By.xpath(COMMUNITIES_XPATH));
		}
		
		public WebElement getManualRegistration() {
			return driver.findElement(By.xpath(MANUAL_REGISTRATION_XPATH));
		}
		
		public WebElement getUnlockUsers() {
			return driver.findElement(By.cssSelector(UNLOCK_USERS_CSSSELECTOR));
		}
		
		// Functional
		
		public String getLoggedUserText() {
			return getLoggedUser().getText();
		}

		// set Data

		public void clickLoggedUserDropdown() {
			getLoggedUserDropdown().click();
		}

		public void clickChangePassword() {
			getChangePassword().click();
		}

		public void clickResetPassword() {
			getResetPasword().click();
		}
		
		public void clickLogout() {
			getLogout().click();
		}
		
		public AdminHomePage clickHome() {
			getHome().click();
			return new AdminHomePage(driver);
		}
		
		public void clickUsers() {
			getUsers().click();
		}
		
		public void clickActiveUsers() {
			getActiveUsers().click();
		}
		
		public void clickInactiveUsers() {
			getInactiveUsers().click();
		}
		
		public void clickNotConfirmedUsers() {
			getNotConfirmedUsers().click();
		}

		public void clickBlockedUsers() {
			getBlockedUsers().click();
		}
		
		//TODO Develop SettingsPage class
//		public SettingsPage clickSettings() {
//			getSettings().click();
//			return new SettingsPage(driver);
//		}
		
		// TODO Develop CommunitiesPage class
//		public CommunitiesPage clickCommunities() {
//			getCommunities().click();
//			return new CommunitiesPage(driver);
//		}

		// TODO Develop ManualRegistrationPage class
//		public ManualRegistrationPage clickManualRegistration() {
//			getManualRegistration().click();
//			return new ManualRegistrationPage(driver);
//		}

		public void clickUnlockUsers() {
			getUnlockUsers().click();
		}
		
	    // Business Logic

		// TODO Develop ChangePasswordPage
//	    public ChangePasswordPage ChangePassword() {
//	    	clickLoggedUserDropdown();
//	    	clickChangePassword();
//		}

		public void ResetPassword() {
	    	clickLoggedUserDropdown();
	    	clickResetPassword();
		}

		public LoginPage Logout() {
	    	clickLoggedUserDropdown();
	    	clickLogout();
	    	return new LoginPage(driver);
		}
		
		// TODO Develop ActiveUsersPage class 
//		public ActiveUsersPage ShowActiveUsersPage() {
//			clickUsers();
//			clickActiveUsers();
//			return new ActiveUsersPage(driver);
//		}

		// TODO Develop InactiveUsersPage class 
//		public InactiveUsersPage ShowInactiveUsersPage() {
//			clickUsers();
//			clickInactiveUsers();
//			return new inactiveUsersPage(driver);
//		}
		
		// TODO Develop NotConfirmedUsersPage class 
//		public NotConfirmedUsersPage ShowNotConformedUsersPage() {
//			clickUsers();
//			clickNotConfirmedUsers();
//			return new NotConfirmedUsersPage(driver);
//		}
		
		// TODO Develop BlockedUsersPage class 
//		public BlockedUsersPage ShowBlockedUsersPage() {
//			clickUsers();
//			clickBlockedUsers();
//			return new BlockedUsersPage(driver);
//		}
		
		
}
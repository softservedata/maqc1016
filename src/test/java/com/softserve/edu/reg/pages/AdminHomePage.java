package com.softserve.edu.reg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminHomePage extends ACommonPage {

	private class CoownersOptions {

		// Fields

		// private WebDriver driver;
		private WebElement active;
		private WebElement inactive;
		private WebElement nonConfirmed;
		private WebElement blocked;

		// public CoownersOptions(WebDriver driver) {
		public CoownersOptions() {
			// this.driver = driver;
			this.active = driver.findElement(By.xpath("//ul/li[1]/a[contains(@href,'/users/get-all-users')]"));
			this.inactive = driver
					.findElement(By.xpath("//a[contains(@href,'/users/get-all-users?statusType=inactive')]"));
			this.nonConfirmed = driver
					.findElement(By.xpath("//a[contains(@href,'/users/get-all-users?statusType=notcomfirmed')]"));
			this.blocked = driver
					.findElement(By.xpath("//a[contains(@href,'/users/get-all-users?statusType=block')]"));
		}

		public WebElement getActiveElement() {
			return this.active;
		}

		public WebElement getInactiveElement() {
			return this.inactive;
		}

		public WebElement getNonConfirmedElement() {
			return this.nonConfirmed;
		}

		public WebElement getBlockedElement() {
			return this.blocked;
		}

	}

	// Fields

	private WebElement home;
	private WebElement users;
	private WebElement settings;
	private WebElement communities;
	private WebElement newUser;
	private WebElement unblockAll;
	private CoownersOptions coownersOptions;

	public AdminHomePage(WebDriver driver) {
		super(driver);
		this.home = driver.findElement(By.cssSelector("a.glyphicon.glyphicon-home"));
		this.users = driver.findElement(By.xpath("//li[@class='dropdown']/a"));
		this.settings = driver.findElement(By.xpath("//a[contains(@href,'/settings')]"));
		this.communities = driver.findElement(By.xpath("//a[contains(@href,'/communities/show-all-communities')]"));
		this.newUser = driver.findElement(By.xpath("//a[contains(@href,'/manualregistration')]"));
		this.unblockAll = driver.findElement(By.id("unlockUsers"));
	}

	// PageObject

	// get Data

	public WebElement getHome() {
		return this.home;
	}

	public WebElement getUsers() {
		return this.users;
	}

	public WebElement getSettings() {
		return this.settings;
	}

	public WebElement getCommunities() {
		return this.communities;
	}

	public WebElement getNewUser() {
		return this.newUser;
	}

	public WebElement getUnblockAll() {
		return this.unblockAll;
	}

	// Functional

	public String getHomeText() {
		return getHome().getText();
	}

	public String getUsersText() {
		return getUsers().getText();
	}

	public String getSettingsText() {
		return getSettings().getText();
	}

	public String getCommunitiesText() {
		return getCommunities().getText();
	}

	public String getNewUserText() {
		return getNewUser().getText();
	}

	public String getUnblockAllText() {
		return getUnblockAll().getText();
	}

	// get inner Data

	public WebElement getActive() {
		clickUsers();
		return this.coownersOptions.getActiveElement();
	}

	public WebElement getInactive() {
		clickUsers();
		return this.coownersOptions.getInactiveElement();
	}

	public WebElement getNonConfirmed() {
		clickUsers();
		return this.coownersOptions.getNonConfirmedElement();
	}

	public WebElement getBlocked() {
		clickUsers();
		return this.coownersOptions.getBlockedElement();
	}

	// set Data

	public void clickHome() {
		getHome().click();
	}

	public void clickUsers() {
		clickLoginAccount();
		getUsers().click();
		//coownersOptions = new CoownersOptions(driver);
		coownersOptions = new CoownersOptions();
	}

	public void clickSettings() {
		getSettings().click();
	}

	public void clickCommunities() {
		getCommunities().click();
	}

	public void clickNewUser() {
		getNewUser().click();
	}

	public void clickUnblockAll() {
		getUnblockAll().click();
	}

	// set inner Data

	public void clickActive() {
		getActive().click();
	}

	public void clickInactive() {
		getInactive().click();
	}

	public void clickNonConfirmed() {
		getNonConfirmed().click();
	}

	public void clickBlocked() {
		getBlocked().click();
	}

	// Business Logic

	public AdminHomePage changeLanguage(ChangeLanguageFields language) {
		setChangeLanguage(language);
		// Return a new page object representing the destination.
		return new AdminHomePage(driver);
	}

	public LoginPage logout() {
		clickLogout();
		// Return a new page object representing the destination.
		return new LoginPage(driver);
	}

//	public RegisteredUsersHomePage gotoRegisteredUsers() {
//		clickNewUser();
//		return new RegisteredUsersHomePage(driver);
//	}

}

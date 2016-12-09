package com.softserve.edu.reg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.softserve.edu.reg.data.IUser;

public class LogPage {
	//
	public static final String SRC_ATTRIBUTE = "src";
	public static final String NAME_IMAGE = "ukraine_logo2.gif";

	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

	// Fields

	private WebDriver driver;
	//
	@FindBy(css = "div.col-md-7.col-xs-12")
	private WebElement titleMessage;
	//
	@FindBy(xpath = "//label[contains(@for,'inputEmail')]")
	private WebElement loginLabel;
	//
	//@CacheLookup
	@FindBy(id = "login")
	private WebElement loginInput;
	//
	@FindBy(xpath = "//label[contains(@for,'inputPassword')]")
	private WebElement passwordLabel;
	//
	@FindBy(id = "password")
	private WebElement passwordInput;
	//
	@FindBy(css = "button.btn.btn-primary")
	private WebElement signin;
	//
	@FindBy(css = "img.login_logo.col-md-8.col-xs-12")
	private WebElement logo;

	public LogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // 1st item
	}

	// PageObject

	// get Data

	public WebElement getTitleMessage() {
		return this.titleMessage;
	}

	public WebElement getLoginLabel() {
		return this.loginLabel;
	}

	public WebElement getLoginInput() {
		return this.loginInput;
	}

	public WebElement getPasswordLabel() {
		return this.passwordLabel;
	}

	public WebElement getPasswordInput() {
		return this.passwordInput;
	}

	public WebElement getSignin() {
		return this.signin;
	}

	public WebElement getLogo() {
		return this.logo;
	}

	// Functional

	public String getLoginLabelText() {
		return getLoginLabel().getText().trim();
	}

	public String getLoginInputText() {
		return getLoginInput().getText();
	}

	public String getPasswordLabelText() {
		return getPasswordLabel().getText().trim();
	}

	public String getPasswordInputText() {
		return getPasswordInput().getText();
	}

	public String getSignintText() {
		return getSignin().getText().trim();
	}

	public String getLogoAttributeText(String attribute) {
		return getLogo().getAttribute(attribute).trim();
	}

	public String getLogoAttributeSrcText() {
		return getLogoAttributeText(SRC_ATTRIBUTE);
	}

	// set Data

	public void setLoginInput(String login) {
		getLoginInput().sendKeys(login);
	}

	public void setLoginInputClear(String login) {
		clearLoginInput();
		setLoginInput(login);
	}

	public void setPasswordInput(String password) {
		getPasswordInput().sendKeys(password);
	}

	public void setPasswordInputClear(String password) {
		clearPasswordInput();
		setPasswordInput(password);
	}

	public void clearLoginInput() {
		getLoginInput().clear();
	}

	public void clearPasswordInput() {
		getPasswordInput().clear();
	}

	public void clickLogin() {
		getLoginInput().click();
	}

	public void clickPassword() {
		getPasswordInput().click();
	}

	public void clickSignin() {
		getSignin().click();
	}

	// Business Logic

	// TODO Develop User class
	private void setLoginData(IUser user) {
		// private void setLoginData(String login, String password) {
		setLoginInputClear(user.getLogin());
		setPasswordInputClear(user.getPassword());
		// setLoginInputClear(login);
		// setPasswordInputClear(password);
		clickSignin();
	}

	// TODO Develop User class
	public LogPage unsuccessfulLogin(IUser invalidUser) {
		// public LoginValidatorPage unsuccessfulLogin(String login, String
		// password) {
		setLoginData(invalidUser);
		// setLoginData(login, password);
		return new LogPage(driver); // return this;
	}

}
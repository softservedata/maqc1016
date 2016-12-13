package com.softserve.edu.reg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public abstract class ATopPage {

	public static enum ChangeLanguageFields {
		UKRAINIAN("українська"),
		RUSSIAN("русский"),
		ENGLISH("english");
		//
		private String field;

		private ChangeLanguageFields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return field;
		}
	}

	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

	// Fields

	protected WebDriver driver;
	//
	private WebElement titleMessage;
	private Select changeLanguage;

	protected ATopPage(WebDriver driver) {
		this.driver = driver;
		this.titleMessage = driver.findElement(By
				.cssSelector("div.col-md-7.col-xs-12"));
		this.changeLanguage = new Select(driver.findElement(By.id("changeLanguage")));
	}

	// PageObject

	// get Data

	public Select getChangeLanguage() {
		return this.changeLanguage;
	}

	public WebElement getTitleMessage() {
		return this.titleMessage;
	}

	public WebElement getChangeLanguageSelected() {
		return getChangeLanguage().getFirstSelectedOption();
	}

	// Functional

	public String getChangeLanguageSelectedText() {
		return getChangeLanguageSelected().getText().trim();
	}

	public String getTitleMessageText() {
		return getTitleMessage().getText();
	}

	public ChangeLanguageFields getSelectedLanguage() {
		ChangeLanguageFields currentLanguage = ChangeLanguageFields.UKRAINIAN;
    	for (ChangeLanguageFields language : ChangeLanguageFields.values()) {
    		if (language.toString().contains(getChangeLanguageSelectedText())) {
    			currentLanguage = language;
    			break;
    		}
    	}
		return currentLanguage;
	}

	// set Data

	//public void setChangeLanguage(String language) {  // Code Smell
	public void setChangeLanguage(ChangeLanguageFields language) {
		getChangeLanguage().selectByVisibleText(language.toString());
	}

}

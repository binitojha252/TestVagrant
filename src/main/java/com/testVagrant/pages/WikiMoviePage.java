package com.testVagrant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testVagrant.base.TestBase;
import com.testVagrant.utils.Utilities;

public class WikiMoviePage extends TestBase {
	
Utilities util = new Utilities();
	
	// Page factory
	
	@FindBy(xpath = "//*[contains(text(),'Release date')]/../..//li")
	WebElement wReleaseDate;
	@FindBy(xpath = "//*[contains(text(),'Country')]/../td")
	WebElement wCountry;
	
	//Initializing Page Objects..
		 public WikiMoviePage() {
			 PageFactory.initElements(driver, this);
			
		}
		 
		 public String getReleaseDate() {
			 util.scrollToElement(wReleaseDate);
			 return util.getText(wReleaseDate);
		 }
		 
		 public String getCountryName() {
			 util.scrollToElement(wCountry);
			 return util.getText(wCountry);
		 }

}

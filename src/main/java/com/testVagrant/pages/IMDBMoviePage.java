package com.testVagrant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testVagrant.base.TestBase;
import com.testVagrant.utils.Utilities;

public class IMDBMoviePage extends TestBase {
	
	Utilities util = new Utilities();
	
	// Page factory
	
	@FindBy(xpath = "//a[contains(text(),'Release date')]/..//li/a")
	WebElement IMDBReleaseDate;
	@FindBy(xpath = "//li[@data-testid='title-details-origin']/div")
	WebElement IMDBCountry;
	
	//Initializing Page Objects..
		 public IMDBMoviePage() {
			 PageFactory.initElements(driver, this);
			
		}
		 
		 public String getReleaseDate() {
			 util.scrollToElement(IMDBReleaseDate);
			 return util.getText(IMDBReleaseDate);
		 }
		 
		 public String getCountryName() {
			 util.scrollToElement(IMDBCountry);
			 return util.getText(IMDBCountry);
		 }

}

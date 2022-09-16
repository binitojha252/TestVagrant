package com.testVagrant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testVagrant.base.TestBase;
import com.testVagrant.utils.Utilities;

public class WikiHomePage extends TestBase {
	Utilities util = new Utilities();
	
	// Page factory
	
	@FindBy(xpath = "//input[@name='search']")
	WebElement wSearchBox;
	@FindBy(xpath = "//input[@id='searchButton']")
	WebElement wSearchButton;
	
	//Initializing Page Objects..
		 public WikiHomePage() {
			 PageFactory.initElements(driver, this);
			
		}
		 
		 //Actions
		 public void movieNameSearch(String mName) {
			 
			 try {
				util.clearAndSetValues(wSearchBox, mName);
				util.clickOnElement(wSearchButton);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }

}

package com.testVagrant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testVagrant.base.TestBase;
import com.testVagrant.utils.Utilities;

public class IMDBHomePage extends TestBase {
	
	Utilities util = new Utilities();
	
	// Page factory
	
	@FindBy(xpath = "//input[@id = 'suggestion-search']")
	WebElement IMDBSearchBox;
	@FindBy(xpath = "//button[@id= 'suggestion-search-button']")
	WebElement IMDBSearchButton;
	
	//Initializing Page Objects..
		 public IMDBHomePage() {
			 PageFactory.initElements(driver, this);
			
		}
		 
		 //Actions
		 public void movieNameSearch(String mName) {
			 
			 try {
				util.clearAndSetValues(IMDBSearchBox, mName);
				util.clickOnElement(IMDBSearchButton);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }

}

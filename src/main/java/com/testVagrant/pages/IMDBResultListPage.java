package com.testVagrant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testVagrant.base.TestBase;
import com.testVagrant.utils.Utilities;

public class IMDBResultListPage extends TestBase {
	
	Utilities util = new Utilities();
	
	// Page factory
	
	@FindBy(xpath = "//table//a[contains(text(),'Pushpa: The Rise')]")
	WebElement pushpaItem;

	
	//Initializing Page Objects..
		 public IMDBResultListPage() {
			 PageFactory.initElements(driver, this);
			
		}
		 
		 //Actions
		 public void clickOnMovieName() {
			 
			 try {
				util.clickOnElement(pushpaItem);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }

}

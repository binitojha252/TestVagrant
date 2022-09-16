package com.testVagrant.utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testVagrant.base.TestBase;

public class Utilities extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 40);
	
	
	public void highlightElement(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
					"color: black; border: 2px solid red;");
		} catch (Exception e) {

		}
	}
	
	public void clearAndSetValues(WebElement element, String StringToBeEntered) throws Exception {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			highlightElement(element);
			element.clear();
			element.sendKeys(StringToBeEntered);
			waitForElement(3);
		} catch (Exception e) {
			System.out.println("Unable to click on element"+ element);
		}

		
	}
	
	public static  void waitForElement(int time) throws Exception {
		Thread.sleep(time * 600);
	}
	
	
	public void clickOnElement(WebElement element) {
		try {
		
			WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(element));
			highlightElement(waitElement);
			waitElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void scrollToElement(WebElement element)  {
		
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			waitForElement(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getText(WebElement element) {

		String text = null;
		try {
			highlightElement(element);
			text = element.getText();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return text;

	}
	
	public void loadURL(String url) {
		driver.get(url);
		
	}


}

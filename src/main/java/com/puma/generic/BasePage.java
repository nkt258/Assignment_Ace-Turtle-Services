package com.puma.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage

{
	public WebDriver driver;
	//verify the title
	public void verifyTitle(WebDriver driver,String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleIs(eTitle));
		//Reporter.log("Title is matching.");
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching:Actual title is "+driver.getTitle());
		}
	}
	
	public void verifyElement(WebDriver driver,WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			//Reporter.log("The element is visible", true);
		}
		catch (Exception e) {
			Reporter.log("Element still not visible", true);
		}
	}
	public void VerifyElementIsClickable(WebDriver driver,WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			//Reporter.log("The element is clickable", true);
			element.click();
			Thread.sleep(5000);
		}
		catch (Exception e) {
			Reporter.log("Element is still not clickable", true);
		}
	
	}
}

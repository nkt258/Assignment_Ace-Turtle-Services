package com.puma.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
   public  WebDriver driver;
   @BeforeMethod
   public void preCondition()
   {
	   System.setProperty(gecko_key,gecko_value);
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.get(URL);
	 }
	
	 @AfterMethod
	 public void postCondition()
	 {
		 driver.quit();
	
	 }
   
}

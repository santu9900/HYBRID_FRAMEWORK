package com.demowebshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_Constants{
	public WebDriver driver;
@BeforeMethod
public void openapp()
{ 
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(URL);
	
}

@AfterMethod
public void closeapp()
{
	driver.close();
}




}


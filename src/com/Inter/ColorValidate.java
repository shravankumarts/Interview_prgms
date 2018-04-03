package com.Inter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ColorValidate 
{
	public WebDriver driver;
	
	@Test
	public void color()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shravan\\Desktop\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

	
	
	
}

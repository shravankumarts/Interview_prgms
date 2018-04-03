package com.Inter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Title 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shravan\\Desktop\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}
}

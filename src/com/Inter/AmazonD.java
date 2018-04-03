package com.Inter;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonD 
{
	public static void main(String[] args)  throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Orange Anji\\Documents\\EGDownloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wallets",Keys.ENTER);
		Thread.sleep(6000);
		String patName;
		for(int i=4;i<6;i++)
		{	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='result_"+i+"']/div/div[2]/div/a/img")));
			 driver.findElement(By.xpath("//*[@id='result_"+i+"']/div/div[2]/div/a/img")).click();
			 Thread.sleep(5000);
			 Set<String> windows = driver.getWindowHandles();
			 Iterator<String> itr = windows.iterator();
			 patName = itr.next();
			 String chldName = itr.next();
			 driver.switchTo().window(chldName);
			 driver.findElement(By.id("add-to-cart-button")).click();
			 driver.close();
			 driver.switchTo().window(patName);
		}
		driver.navigate().refresh();
		driver.findElement(By.id("nav-cart-count")).click();
		if(driver.findElement(By.id("nav-cart-count")).getText().equalsIgnoreCase(String.valueOf(2)))
		{
			System.out.println("itemes are exist");
			System.out.println("Total No of times are present is ="+driver.findElement(By.xpath("//*[@id='activeCartViewForm']/div[3]/p/span")).getText());
		}
		else
		{
			System.out.println("items are not exist");
			System.out.println("No of times are present is ="+driver.findElement(By.xpath("//*[@id='activeCartViewForm']/div[3]/p/span")).getText());
		}
		
	}
}

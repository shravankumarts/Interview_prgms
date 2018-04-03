package com.Inter;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon
{
	public static void main(String[] args)  throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orange Anji\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wallets",Keys.ENTER);
		Thread.sleep(6000);
		String patName;
		for(int i=20;i<21;i++)
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
	}
}

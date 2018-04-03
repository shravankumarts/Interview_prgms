package com.Inter;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ShootingStrategy;

public class Ashot {
	
	
	

		public WebDriver driver;

		@Test
		public void seleniubabupage() throws IOException, InterruptedException {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "C:\\Users\\shravan\\Desktop\\selenium\\geckodriver.exe");

			driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.get("https://seleniumbabu.blogspot.in/");

			Thread.sleep(1000);

			// Here 100 is a scrollTimeOut in milliseconds, For every 100 ms the
			// screen will be scrolled and captured
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategy.viewportPasting(100)).takeScreenshot(driver);

			// To save the screenshot in desired location
			ImageIO.write(screenshot.getImage(), "PNG",
					new File(System.getProperty("user.dir") + "\\screenshots\\fullpagescrn.png"));

			driver.quit();
		}
	}


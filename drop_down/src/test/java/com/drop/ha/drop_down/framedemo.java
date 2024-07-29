package com.drop.ha.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class framedemo {

	@Test
	public void ga () throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Chrome_Driver\\chromedriver.exe");
		 ChromeOptions he = new ChromeOptions();
		 he.addArguments ("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://docs.oracle.com/javase/7/docs/api/");
		 driver.manage().window().maximize();
		 
		// Actions acb = new Actions(driver);
		 driver.switchTo().frame("classFrame");
		 driver.findElement(By.xpath("/html/body/div[1]/ul/li[6]")).click();
		
		//((JavascriptExecutor)driver).executeScript("scroll(0,700");  //for scrolling
		 Thread.sleep(7000);
		 driver.close();
	}
}

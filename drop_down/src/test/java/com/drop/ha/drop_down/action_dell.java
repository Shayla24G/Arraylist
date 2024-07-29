package com.drop.ha.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action_dell {

	@Test
	public void action () throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Chrome_Driver\\chromedriver.exe");
		 ChromeOptions he = new ChromeOptions();
		 he.addArguments ("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.dell.com/en-us");
		 driver.manage().window().maximize();
		 
		 Actions acb = new Actions(driver);
		 acb.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
		 driver.findElement(By.linkText("Dell Rewards")).click();
		 Thread.sleep(3000);
		 
		 ((JavascriptExecutor)driver).executeScript("scroll(0,700)"); //for scroll down, executeScript is a method
		 Thread.sleep(3000);
		 driver.close();
		 
	}
}

package com.drop.ha.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class demo_drpdwn {
	
   
   @Test 
   public void dd () throws Exception {
	     System.setProperty("webdriver.chrome.driver","C:\\Chrome_Driver\\chromedriver.exe");
		 ChromeOptions he = new ChromeOptions();
		 he.addArguments ("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 
		 Select obj = new Select(driver.findElement(By.id("gh-cat")));
		//obj.selectByValue("293");
		 //obj.selectByVisibleText("Health & Beauty");
		 obj.selectByIndex(2);    
		 Thread.sleep(9000);
		 driver.close();
   }
}

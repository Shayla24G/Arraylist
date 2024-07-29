package com.drop.ha.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class demo2 {

	@Test
	
	public void he () throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
		EdgeOptions opp = new EdgeOptions ();
		opp.addArguments("--remote-allow-origins=*");
		 
	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 
		Select obj = new Select(driver.findElement(By.id("gh-cat")));
		obj.selectByValue("293");
		Thread.sleep(5000);
		driver.close();
	}
}

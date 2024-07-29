package com.Pains.sa.SL_pain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class second_TestNG {
	
	@Test
	
	public void  tea () {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		 ChromeOptions he = new  ChromeOptions ();
		 he.addArguments ("--remote-allow-origins-*");
		 WebDriver driver = new ChromeDriver();
		 driver.get("");
		 driver.manage().window().maximize();
	}
}

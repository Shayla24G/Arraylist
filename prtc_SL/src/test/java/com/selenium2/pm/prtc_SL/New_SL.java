package com.selenium2.pm.prtc_SL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

;

public class New_SL {

	public static void main(String[] args) {
		

	}
	public static void he () {
		 System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
		 ChromeOptions he = new ChromeOptions();
		 he.addArguments ("--remote-allow-origins-*");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
	}
}

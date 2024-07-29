package com.Pains.sa.SL_pain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log_in2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Log_in2.him();
	}
	public static void him () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		ChromeOptions he = new 	ChromeOptions();
		he.addArguments("--remote-allow-origins--*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("BD Chittagong");
		driver.findElement(By.id("loginpassword")).sendKeys("happy");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
	}

}

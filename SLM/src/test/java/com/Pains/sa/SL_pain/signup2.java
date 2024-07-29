package com.Pains.sa.SL_pain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class signup2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		signup2.she();
	}
 public static void she () throws Exception {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
	 ChromeOptions he = new  ChromeOptions ();
	 he.addArguments ("--remote-allow-origins-*");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.demoblaze.com/");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 driver.findElement(By.linkText("Sign up")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("sign-username")).sendKeys("BD Chittagong");
	 driver.findElement(By.id("sign-password")).sendKeys("happy");
	 driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 Thread.sleep(6000);
	 driver.close();
 }
}

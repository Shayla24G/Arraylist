package com.drop.ha.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_verify {

	@Test
	
	public void  user  () throws Exception {// i cant put tc name, method name should alwyas tc name
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome_Driver\\chromedriver.exe");
		ChromeOptions the= new  ChromeOptions(); //COs one of the class given by selenium
		the.addArguments ("--remote-allow-origins=*"); //selenium give that for security clearence
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");//get method is responsible to open our browser //open app
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click(); //click login
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("Shayla Binte Alam"); //enter username
		driver.findElement(By.id("loginpassword")).sendKeys("1234"); // enter pass
		driver.findElement(By.xpath("//button[text()='Log in']")).click(); // click log in
		Thread.sleep(4000);
		
		boolean he = driver.findElement(By.xpath("//a[text()='Welcome Shayla Binte Alam']")).isDisplayed(); // he is variable namne
		//Thread.sleep(7000);
		
		Assert.assertTrue(he); //Verify user login successfully
		
		Thread.sleep(7000);
		
		driver.close();
	}
}

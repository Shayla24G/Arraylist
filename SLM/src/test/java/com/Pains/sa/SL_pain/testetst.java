package com.Pains.sa.SL_pain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class testetst {
	@Test //no main method tstNG running our code

	public void tom() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		ChromeOptions the= new  ChromeOptions(); //COs one of the class given by selenium
		the.addArguments ("--remote-allow-origins-*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");//get method is responsible to open our browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); //is deletecookies a method?
		
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000); //wait time
		driver.findElement(By.id("sign-username")).sendKeys("Shayla Binte Alam");
		driver.findElement(By.id("sign-password")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); //accept means ok; //for accepting pop up we need to write this code
		
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
		
		
		

}

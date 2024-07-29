package com.Pains.sa.SL_pain;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Trouble_SL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Trouble_SL obj = new Trouble_SL();
		obj.tom();
	}
 public void tom () throws Exception {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
	 ChromeOptions he = new  ChromeOptions ();
	 he.addArguments ("--remote-allow-origins-*");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.demoblaze.com/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.linkText("Contact")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("recipient-email")).sendKeys("shayla@mail.com");
	 driver.findElement(By.id("recipient-name")).sendKeys("Shyala");
	 driver.findElement(By.id("message-text")).sendKeys("Hey,how you doing");
	 Thread.sleep(5000);
	 driver.close();
	
	 
	 
 }
}

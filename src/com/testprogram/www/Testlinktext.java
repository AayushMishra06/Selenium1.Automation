package com.testprogram.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testlinktext {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("7869993996");
//		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("aayush@26");
//		Thread.sleep(3000);
//		
//		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver1.findElement(By.cssSelector("input[id= 'email']")).sendKeys("7869993996");
		driver1.findElement(By.cssSelector("input[id='pass']")).sendKeys("aayush@26");
		Thread.sleep(3000);
		driver1.findElement(By.cssSelector("button[name='login']")).click();
		
		

	}

}

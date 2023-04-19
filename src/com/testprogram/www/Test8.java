package com.testprogram.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("7869993996");
		
		driver.findElement(By.name("pass")).sendKeys("aayush@26");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	    String title= driver.getTitle();
	    System.out.println(title);
	    String url = driver.getCurrentUrl();
	    System.out.print(url);
	    
	    Thread.sleep(3000);
		  driver.close();
		
		
	}

}

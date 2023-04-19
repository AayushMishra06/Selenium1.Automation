package com.testprogram.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("identify_email")).sendKeys("sfsdgsfs");
		driver.findElement(By.name("pass")).sendKeys("sfsdgsfs");
		driver.findElement(By.name("login")).click();

	}

}

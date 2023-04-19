package com.testprogram.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testpartiallinktext {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("7869993996");
		driver.findElement(By.id("password")).sendKeys("7869993996");
		driver.findElement(By.linkText("Login")).click();
		
		
	}

}

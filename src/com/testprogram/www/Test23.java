package com.testprogram.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.amazon.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
		
		

	}

}

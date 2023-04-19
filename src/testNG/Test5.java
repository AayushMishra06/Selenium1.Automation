package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public class Testcase1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By)
	}


}

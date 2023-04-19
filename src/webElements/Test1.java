package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.myntra.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search =driver.findElement(By.xpath("//input[@class='desktop-searchBar'] "));
		
		  search.sendKeys("Shose");
		  
		  driver.findElement(By.xpath("(//span[contains(@class ,'myntraweb-sprite')])[4]")).submit();
		  
		
	    
	}
}

package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_vtiger {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.vtiger.com/vtigercrm/index.php  ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref = driver.findElement(By.id("username"));
		WebElement ref1 = driver.findElement(By.id("password"));
		ref.clear();
		ref1.clear();
		
		
		
		
	}

}

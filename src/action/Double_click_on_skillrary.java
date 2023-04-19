package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_on_skillrary {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement ele = driver.findElement(By.id("course"));
		Actions s =new Actions(driver);
		s.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text() ='Selenium Training']")).click();
		WebElement ele2 = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		Actions s1 =new Actions(driver);
		s1.doubleClick().perform();
		
		
		
		
	}

}

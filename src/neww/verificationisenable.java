package neww;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationisenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginbtn= driver.findElement(By.id("gh-btn"));
		if (loginbtn.isEnabled())
		{
			System.out.println("Pass:element is enabled");
		}
		else 
		{
			System.out.println("fail: element is not enabled");
		}
		driver.close();

	}

}
//gh-btn
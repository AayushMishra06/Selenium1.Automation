package locatorxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("pass: home page is visibale");
		}
		else
		{
			System.out.println("fail: home page is not visibale");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		
		
		
	}	

}

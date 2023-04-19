package switch_to_frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//img[@class='thumb lazy'])[2]")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//i[@class='fa fa-heart-o']")).click();
		
		
		
		
	}
}

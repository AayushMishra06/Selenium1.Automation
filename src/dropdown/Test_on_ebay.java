package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_on_ebay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ebay.com/ ");
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByVisibleText("Cell Phones & Accessories");
		Thread.sleep(3000);
		s.selectByValue("293");
		
		Thread.sleep(3000);
		driver.close();

		
		
	}

}

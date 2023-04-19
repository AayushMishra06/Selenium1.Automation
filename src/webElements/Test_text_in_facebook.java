package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_text_in_facebook {
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement els = driver.findElement(By.xpath("//h2[contains(@class,'_8eso')] "));
	    System.out.println(els.getText());
	      
	    driver.close();
		
	}

}

package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_On_Search_TextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));
	    Actions s = new Actions(driver);
	    s.contextClick(ele).perform();
	    
		
		

	}
                                                                                             
}
//twotabsearchtextbox
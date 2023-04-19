package practicecode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupFuntion {
	public static void main(String[] args) {
		

	
		WebDriver driver = new chromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='makeFlex']")).click();
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']")).click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[10]")).click();
		
		
	}	

}

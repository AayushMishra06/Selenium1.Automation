package practicecode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step:1 typecasting 
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step:2 access the method and store i RAM
		
        File ram = ts.getScreenshotAs(OutputType.FILE);
        
		//step:3 specify the loaction
		File dest = new File ("./photo/amazon.png");
	    
				
	    //Step:4 copy paste from Ram to dest location
		FileUtils.copyFile(ram, dest);
		driver.close();
	}

}

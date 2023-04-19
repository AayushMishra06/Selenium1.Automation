package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestCase01 {
	public WebDriver driver;
	
    @BeforeMethod
    public void openApp() {
    	driver = new ChromeDriver;
    	driver
    	
    }
	

}

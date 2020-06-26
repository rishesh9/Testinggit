package TestBase;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseclass {
	public static WebDriver driver; 
	
		

	public static void initialization() {
     
	
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\ChromeDriver.exe");
			
			driver=new ChromeDriver();
			
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
	}
	
}



package week5.day3;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseDynamicAssigment {
	
public ChromeDriver driver;
	
	
	
	@BeforeMethod
	public void preCondition( ) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--user-data-dir=C:\\SeleniumProfile");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
	@AfterMethod
	public void postCondition() {
	driver.close();

	}
	
}	

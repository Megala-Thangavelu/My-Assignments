package base;



import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	public static ChromeDriver driver;
	
	/*@BeforeMethod
	public void precondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/");

	}
  
	@AfterMethod
	public void postCondition() {
		driver.close();

	}*/
	

}

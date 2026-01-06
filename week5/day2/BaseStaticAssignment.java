package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseStaticAssignment {
	public ChromeDriver driver;
	
	
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void preCondition(String url,String uname,String pwd) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--user-data-dir=C:\\SeleniumProfile");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("Login")).click();

}
	@AfterMethod
	public void postCondition() {
	driver.close();

	}
}

package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions(); // Chrome will be getting special features
		options.addArguments("--guest");   //open Chrome as guest mode
		ChromeDriver driver=new ChromeDriver(options); //Instantiate the chromedriver
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Load the URL
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");//Locating the username element and passing the input
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //Locating the password element and passing the input
		driver.findElement(By.className("decorativeSubmit")).click(); //Locating the login button and clicking on it
		driver.findElement(By.linkText("CRM/SFA")).click(); //Locating the link CRM/SFA link and clicking on it
		
		driver.findElement(By.linkText("Leads")).click(); // Locating the Lead tab and clicking on it
		driver.findElement(By.linkText("Find Leads")).click();//Clicking the find lead
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();//clicking on phone tab
		
	    driver.findElement(By.xpath("(//input[@id='ext-gen270'])[1]")).sendKeys("9999999999");//providing the input
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//clicking find lead tab
	    
	    
	    driver.findElement(By.linkText("10832")).click();//fetching the first Lead ID
	    driver.findElement(By.linkText("Delete")).click();//deleting it
	    driver.findElement(By.linkText("Find Leads")).click();//Again click find Lead
	    driver.findElement(By.xpath("//span[text()='Name and ID']")).click();//selecting the ID element
	    driver.findElement(By.xpath("(//input[@id='ext-gen246'])[1]")).click();//proving ID
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//on clicking the find lead button there will be nothing to display
	    driver.close();//Closing the driver
	}
	

}

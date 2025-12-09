package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();// Chrome will be getting special features
		option.addArguments("--guest"); //open Chrome as guest mode
		ChromeDriver driver=new ChromeDriver(option); //by passing object as arguments it will start in special feature like guest mode
		driver.manage().window().maximize();  //to maximize window to get view of all elements
		driver.get("http://leaftaps.com/opentaps/"); // load the URL
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); //Locating the username element and passing the input
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //Locating the password element and passing the input
		driver.findElement(By.className("decorativeSubmit")).click(); //Locating the login button and clicking on it
		driver.findElement(By.linkText("CRM/SFA")).click(); //Locating the link CRM/SFA link and clicking on it
		
		driver.findElement(By.linkText("Accounts")).click();// Locating the Account tab and clicking on it
		driver.findElement(By.linkText("Create Account")).click(); // Locating  the create account tab and clicking on it
		driver.findElement(By.id("accountName")).sendKeys("Mega"); // Locating the Account name element and passing the input
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");// Locating the description element and passing the input
		driver.findElement(By.id("numberEmployees")).sendKeys("20");// Locating the Number of employees element and passing the input
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");//Locating the site name element and passing the input
		driver.findElement(By.className("smallSubmit")).click();//Locating the creae account button and clicking on it
		
		String title = driver.getTitle();//get the page title and storing it in variable
		System.out.println(title); //printing the title 
		driver.close();//closing the driver
		
		
		
		
		
	}

}

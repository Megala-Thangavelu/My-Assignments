package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

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
		driver.findElement(By.id("accountName")).sendKeys("MegalaYathv"); // Locating the Account name element and passing the input
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");// Locating the description element and passing the input
	    WebElement element = driver.findElement(By.name("industryEnumId"));//Finding the webelement and assiging to variable and creating object and 
	    //passing as argument and using select method we are selecting the dropdown and same for other 4 elements
		Select options=new Select(element);
		options.selectByIndex(3);
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select options1=new Select(element2);
		options1.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select option2=new Select(element3);
		option2.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select option3=new Select(element4);
		option3.selectByIndex(6);
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option4=new Select(element5);
		option4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();//Clicking the create account button
		WebElement element6 = driver.findElement(By.xpath("//span[contains(text(),'MegalaYathv')]"));//fetching and storing in webelement
		String text = element6.getText(); //getting the account name
		System.out.println(text);//printing it
	
		driver.close();//closing the driver
		

	}

}

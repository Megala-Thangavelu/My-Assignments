package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions(); // Chrome will be getting special features
		options.addArguments("--guest");   //open Chrome as guest mode
		ChromeDriver driver=new ChromeDriver(options); //Instantiate the chromedriver
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");//Load the URL
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");//Locating the username element and passing the input
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //Locating the password element and passing the input
		driver.findElement(By.className("decorativeSubmit")).click(); //Locating the login button and clicking on it
		driver.findElement(By.linkText("CRM/SFA")).click(); //Locating the link CRM/SFA link and clicking on it
		
		driver.findElement(By.linkText("Leads")).click(); // Locating the Lead tab and clicking on it
		driver.findElement(By.linkText("Create Lead")).click(); // Locating  the create lead element and clicking on it
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");//Providing company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Yathvik");//Providing first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");//Providing last name
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("meg");//Providing firstname local
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing"); //Providing department name
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("learningselenium");//Providing description
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testleaf@gmail.com");//Providing email
	    WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));//assigning state webelement to variable
	    Select option=new Select(element);//creating object for Select class and passing the webelement as argument
	    option.selectByVisibleText("New York");//Using one of select class method dropdown is handled
	    driver.findElement(By.className("smallSubmit")).click();//clicking the create lead button
	    driver.findElement(By.linkText("Edit")).click(); //Clicking the edit link
	    WebElement element2 = driver.findElement(By.id("updateLeadForm_description"));//assigning state webelement to variable
	    element2.clear();//clearing the element text
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("edited");//Give the new input 
	  
	    driver.findElement(By.xpath(" (//input[@name='submitButton'])[1]")).click();//Clicking the update button
	    String title = driver.getTitle();//fetching the title
	    System.out.println(title);//printing the title 
	    driver.close();//closing the driver
	
	
	
	}

	
	
	
	
}

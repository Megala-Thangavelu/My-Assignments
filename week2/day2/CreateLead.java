package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeOptions options =new ChromeOptions(); // Chrome will be getting special features
		options.addArguments("--guest");   //open Chrome as guest mode
		
		ChromeDriver driver=new ChromeDriver(options); //by passing object as arguments it will start in special feature like guest mode
	
		
		driver.manage().window().maximize(); //to maximize window to get view of all elements
		driver.get("http://leaftaps.com/opentaps/"); // load the URL
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");//Locating the username element and passing the input
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //Locating the password element and passing the input
		driver.findElement(By.className("decorativeSubmit")).click(); //Locating the login button and clicking on it
		driver.findElement(By.linkText("CRM/SFA")).click(); //Locating the link CRM/SFA link and clicking on it
		
		driver.findElement(By.linkText("Leads")).click(); // Locating the Lead tab and clicking on it
		driver.findElement(By.linkText("Create Lead")).click(); // Locating  the create lead element and clicking on it
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Megala"); // Locating the First name element and passing the input
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavelu"); //Locating the last name element and passing the input
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");//Locating the company name element and passing the input
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");//Locating the title element and passing the input
		driver.findElement(By.name("submitButton")).click();//Locating the create lead button and clicking on it
		
		Thread.sleep(2000); //to freeze for 2 seconds to load the next page
		String title = driver.getTitle();//get the page title and storing it in variable
		
		System.out.println(title);//printing the page title
		
		driver.close();//closing the browser
		
		
	
	}

}

package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();

		// Add argument to open Chrome in Guest Mode
		option.addArguments("--guest"); 
		

		// Instantiate the Chrome browser with the specified options
		ChromeDriver driver = new ChromeDriver(option);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Implicit wait for all the element to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Locating the Username and sending the Input
		driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
	
		//Locating the Password element and sending the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Locating the Login button and clicking on it
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on the CRM/SFA link
		driver.findElement(By.id("label")).click();
		
		//Waiting for the page to get refresh
		Thread.sleep(2000);
		
		//Locating the Contact link and clicking on it
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Clicking on the Merge Contact and clicking on it
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Locating the From contact Widget and clicking on it
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		//Fetching the Number of Windows available
		Set<String> windows = driver.getWindowHandles();
		
		//Change the Set to List to accept the duplicate values
		List<String> windowName=new ArrayList<String>(windows);
		
		//Switching the driver control to child Window
		driver.switchTo().window(windowName.get(1));
		
		//Clicking on the first resulting contact and clicking on it
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Waiting for the page refresh
		Thread.sleep(2000);
		
		//Switching the control to Parent Window to view the reflected input
	    driver.switchTo().window(windowName.get(0));
		
		//Locating the To Contact widget and clicking on it
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		
		//Waiting for the page refresh
		Thread.sleep(2000);
		
		//Fetching the Number of Windows available for second time
		Set<String> window2 = driver.getWindowHandles();
				
		//Change the Set to List to accept the duplicate values
		List<String> windowName2=new ArrayList<String>(window2);
				
				
		//Switching the driver control to child Window for second time
		driver.switchTo().window(windowName2.get(1));
		
	
		//Clicking on the second resulting contact and clicking on it
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		//Waiting for the page refresh
		Thread.sleep(2000);
		
		//Switching the control to Parent Window second time to view the reflected input
		driver.switchTo().window(windowName2.get(0));
		
		//Locating the Merge Contact button and clicking on it
		driver.findElement(By.className("buttonDangerous")).click();
		
		//Locating the alert and storing it in local variable
		Alert alert = driver.switchTo().alert();
		
		//Accepting the alert
		alert.accept();
		
		//Fetching the page tile
		String title = driver.getTitle();
		
		//Printing the tile console
		System.out.println(title);
		
		}

}

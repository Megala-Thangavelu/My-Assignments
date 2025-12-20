package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the ChromeOption
		ChromeOptions option=new ChromeOptions();
		
		//Adding arguments as guest
		option.addArguments("--guest");
		
		//Instantiate the ChromeDriver and also passing the argument
		ChromeDriver driver=new ChromeDriver(option);
		
		//Maximize the Browser Window
		driver.manage().window().maximize();
		
		//Implicit wait for every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Loading the URL
		driver.get("https://www.pvrcinemas.com/");
		
		//wait for the page to get refreshed
		Thread.sleep(2000);
		
		//Locating the element to find chennai and click on it
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		
		//Locating the element cinema and clicking on it
	    driver.findElement(By.className("cinemas-inactive")).click();
	    
	    //Selecting the cinema location and clicking on it
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		//Selecting the date and clicking on it
		driver.findElement(By.className("p-dropdown-item")).click();
		
		//Wait for element to load
		Thread.sleep(2000);
		
		//Selecting the date and clicking on it
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
		
		//Selecting the movie and clicking on it
		driver.findElement(By.xpath("(//span[text()='SAAYAVANAM'])[2]")).click();
		
		//Selecting the timing and clicking on it
	    driver.findElement(By.xpath("//span[text()='10:45 PM']")).click();
	    
	    //Locating the element book and clicking on it
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
		//Clicking on accept in the notification
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//Wait for the page to refresh
		Thread.sleep(3000);
		
		//Accepting the terms and condition
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[text()='Accept']")).click();
		
		//Selecting the seat and clicking on it
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[5]")).click();
		
		//Locating the Seat Info element and storing in local variable 
		WebElement element = driver.findElement(By.className("seat-info"));
		
		//Fetching the details and storing it in local variable
		String text = element.getText();
		
		//Printing the Seat Info in console
		System.out.println(text);
		
		//Locating the Grand amount element and storing it in local variable
		WebElement element2 = driver.findElement(By.className("grand-amount"));
		
		//Fetching the Grand total and storing it in local variable
		String text2 = element2.getText();
		
		//Printing the information in the console
		System.out.println(text2);
		
		//Locating the proceed button and clicking on that
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Locating the cancel and clicking on it
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//Wait for the page to get refreshed
		Thread.sleep(3000);
		
		//Fetching the title of the page
		String title = driver.getTitle();
		
		//Printing it in console
		System.out.println(title);
	
		//Closing the browser
		driver.close();
		
		
	}

}

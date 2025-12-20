package week3.day4;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.amazon.in/");
		
		//Maximize the Browser Window
		driver.manage().window().maximize();
		
		//Implicit wait for every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Locating the search box and sending the input 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys");
	    
		//Selecting from the suggestions after providing the input
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		
		//Storing element to get the text to be displayed
		WebElement element = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']/preceding-sibling::span"));
		
		//Storing it in local variable 
		String text = element.getText();
		
		//Printing the total number of results
		System.out.println(text + " "+ "bags for boys");
		
		//Wait time to get refreshed to load the Brand items
		Thread.sleep(2000);
		
		//Selecting the checkbox of Safari brand
		driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='Safari']")).click();
		
		//Wait time to get the page refreshed 
		Thread.sleep(3000);
		
		//Selecting the checkbox of American Tourister brand
		driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='American Tourister']")).click();
		
		//Wait time to get the page refreshed 
		Thread.sleep(3000);
		
		//Locating the the Sort By element
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		
		//Locating and selecting the New Arrivals of filtered result
		driver.findElement(By.xpath("(//li[@class='a-dropdown-item a-declarative'])[5]")).click();
		
		//Fetching the Webelements of Name of bag and storing it in local variable
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='a-row']/following-sibling::a"));
		
		//To get the result of bagName we are Instantiating Set
		Set<String> bagName=new TreeSet<String>();
		
		//Iterating through each element to get the text of bag name
		for (int i = 0; i < elements.size(); i++) 
		{    
		    //Fetching text and assigning to local variable
			String text2 = elements.get(i).getText();
			
			//Adding elements to Set
			bagName.add(text2);
		}
		//wait time to display the Set
		Thread.sleep(2000);
		
		//Printing in console
		System.out.println(bagName);
		
		//Wait time for locating elements to get the price
		Thread.sleep(2000);
		
		//locating and web elements and storing it to local variable
		List<WebElement> elements2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//Instantiating the Set to display the price list
		Set<Integer> price=new TreeSet<Integer>();
		
		//Iterating through each element
		for (int i = 0; i < elements2.size(); i++) 
		{
			//Fetching the text and assigning it to local variable
			String text3 = elements2.get(i).getText();
			
			//Replacing all comma with blank space
			String replaceAll = text3.replaceAll(",", "");
			
			//Converting the string into Integer
			int list = Integer.parseInt(replaceAll);
			
			//Adding the list to Set
			price.add(list);
		}
		//Printing the price list in console
		System.out.println(price);
		
		//Wait time to refresh the page
		Thread.sleep(2000);
		
		//Fetching the Title and storing it in local variable
		String title = driver.getTitle();	
		
		//Printing the Title in Console
		System.out.println(title);	
		
		//Closing the browser
		driver.close();
		}
		}
		
	

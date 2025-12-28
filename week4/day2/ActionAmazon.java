package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionAmazon
{

	public static void main(String[] args) throws InterruptedException, IOException {
		        //Instantiate the chrome driver
				ChromeDriver driver=new ChromeDriver();
				
				//Loading the URL
				driver.get("https://www.amazon.in/");
				
				//Maximize the Browser Window
				driver.manage().window().maximize();
				
				//Implicit wait for every element
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
				//Locating the search box and providing the input 
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
				
				//Fetching the first listed price
				WebElement element = driver.findElement(By.className("a-price-whole"));
				
				//Getting the text from the element and storing it in local variable
				String price= element.getText();
				
				//Printing the first listed price in console
				System.out.println("Price of first product is"+ " "+price);
				
				//Wait for the refresh
				Thread.sleep(2000);
				
				//Locating the rating element and storing 
				WebElement element2 = driver.findElement(By.xpath("//div[@class='a-row a-size-small']/span"));
				
				//Fetching the text from the rating element and storing it in variable
				String rating = element2.getText();
				
				//Print the rating in console
				System.out.println(rating);
				
				//Locating the first list link text and clicking on it
				driver.findElement(By.xpath("//div[@class='a-row']/following-sibling::a")).click();
				
				//Fetching the window addresses
				Set<String> windowHandles = driver.getWindowHandles();
				
				//Converting it into List to allow duplicates
				List<String> window=new ArrayList<String>(windowHandles);
				
				//Switching the driver control to child Window
				driver.switchTo().window(window.get(1));
				
				//Wait for the page refresh
				Thread.sleep(2000);
				
				//Need to get screenshot in file format
				File source = driver.getScreenshotAs(OutputType.FILE);
				
				//Providing the target location and file type
				File target=new File("./data/productpage.png");
				
				//Copy the file from source to targeted file
				FileUtils.copyFile(source, target);
				
				//Locating the Add to cart button and passing as webelement variable
				WebElement element4 = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-cart']/following-sibling::input)[2]"));
				
				//Instantiate the Actions 
				Actions addTo=new Actions(driver);
				
				//Scrolling to element and clicking on it
				addTo.scrollToElement(element4).click(element4).perform();
				
				//Wait for page refresh
				Thread.sleep(2000);
				
				//Locating the cart subtotal price 
				WebElement element3 = driver.findElement(By.className("a-price-whole"));
				
				//Fetching the price and storing it in variable
				String price2 = element3.getText();
			
				//Printing the price in console
				System.out.println("Price in cart Subtotal is"+" "+price2);
			
				
				//Comparing the price1 with price2
				if(price.equals(price2)) 
				{
					//Printing in console if condition satisfied
					System.out.println("Verified the price and it is equal");
				}
				else
				{
					//Printing if it doesn't match
					System.out.println("Verified the price and it is not equal");
				}
				
				//CLose the driver
				//driver.close();
				

	}

}

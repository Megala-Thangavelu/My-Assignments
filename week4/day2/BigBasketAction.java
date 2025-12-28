package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BigBasketAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		       //Instantiate the chrome driver
				ChromeDriver driver=new ChromeDriver();
				
				//Loading the URL
				driver.get("https://www.bigbasket.com/");
				
				//Maximize the Browser Window
				driver.manage().window().maximize();
				
				//Implicit wait for every element
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Click on shop by category element
				driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
			
				
				//Locate the Foodgrains element and need to mousehover so storing it in variable
				WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Foodgrains')])[2]"));
				
				//Switching the driver control to action
				Actions act=new Actions(driver);
				
				
				//Wait for the element to load
				Thread.sleep(2000);
				
				
				//Move to Foodgrains element 
				act.moveToElement(element).perform();
				
				
				//Need to mousehover Rice products so storing element in variable
				WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Rice')]"));
				
				//switching the driver control 
				Actions act2=new Actions(driver);
				
				//Wait for the element to load
				Thread.sleep(2000);
				
				//Move to that element
				act2.moveToElement(element2).perform();
				
				//Need to select Boiled and steam rice so storing it in variable
				driver.findElement(By.xpath("//a[contains(text(),'Boiled')]")).click();
				
			
				//Locating the BB Royal element and storing it in variable
				WebElement element4 = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
				
				//switching the driver control 
				Actions act3=new Actions(driver);
				
				//Wait for the element to load
				Thread.sleep(2000);
				
				//Move to that element and click on it
				act3.moveToElement(element4).click().perform();
				
			    //Locating the Boiled rice element and storing it in variable
				WebElement element5 = driver.findElement(By.xpath("//label[text()='Ponni Boiled Rice']"));
				
				//Wait for the element to load
				Thread.sleep(2000);
				
				//switching the driver control 
				Actions act4=new Actions(driver);
				
				//Move to that element and click on it
				act4.moveToElement(element5).click().perform();
				
				//Wait for the element to load
				Thread.sleep(2000);
				
				//Locating the 5 Kg and storing it in variable
				driver.findElement(By.xpath("//label[contains(text(),'5 kg')]")).click();
				
				//Wait for the element to load
				Thread.sleep(2000);
				
				//Locating the First listed price and storing it in variable
				WebElement element6 = driver.findElement(By.xpath("//div[@class='Label-sc-15v1nk5-0 sc-hwdzOV jnBJRV jxwClL']"));
				
				//Fetching the price and storing it in variable
				String text = element6.getText();
				
				//Printing the price and storing it in variable
				System.out.println("Price of the Bag" +"" + text);
				
				//Wait for refresh
				Thread.sleep(2000);
				
				//Locating the Add to cart element and storing it in local variable
				driver.findElement(By.xpath("//button[text()='Add']")).click();
				
				//Fetching the successful message and storing it in variable
				String text2=driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
				
				//Wait for refresh
				Thread.sleep(2000);
				
				//Printing the message in console
				System.out.println(text2);
				
				//Getting the screenshot of current page and providing the output type as file
				File source = driver.getScreenshotAs(OutputType.FILE);
				
				//Providing the destination location
				File target=new File("./data/sample.png");
				
				//Copying from source to destination
				FileUtils.copyFile(source, target);
				
				//Closing the window
				driver.quit();

	}

}

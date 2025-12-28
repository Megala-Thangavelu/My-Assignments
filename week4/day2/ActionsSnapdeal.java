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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Instantiate the chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.snapdeal.com/");
		
		//Maximize the Browser Window
		driver.manage().window().maximize();
		
		//Implicit wait for every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Locating the Men's fashion element and storing it in  variable 
		WebElement element = driver.findElement(By.xpath("//div[@id='tab-category-0']/div"));
		
		//Wait for page refresh
		Thread.sleep(2000);
		
		//Changing the driver focus to action class
		Actions act=new Actions(driver);
		
		//driver will move to Mens Fashion element
		act.moveToElement(element).perform();
		
		//Locating the sports shoe under Mens fashion and clicking on it
		driver.findElement(By.xpath("//div[text()='Sports Shoes']")).click();
		
		//Need to get count of Sports shoe so storing it in variable
		WebElement element2 = driver.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div"));

		//Getting the count and storing it in variable
		String count = element2.getText();
		
		//Printing the count of shoes in console
		System.out.println("Count of Shoes"+" "+count);
		
		//Locating the training shoes and clicking on it
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//Locating the Sort by element and clicking on it
		driver.findElement(By.className("sort-label")).click();
		
		//Selecting the low to high price filter
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		
		//Clearing the default value available in to price
		driver.findElement(By.name("toVal")).clear();
		
		//Locating the to price input box and storing it in variable
		WebElement element3 = driver.findElement(By.xpath("(//div[@class='price-text-box'])[2]"));
		
		//Changing the driver focus to action class
		Actions act2=new Actions(driver);
		
		//Scroll to that input box and click on it and provide the input value 
		act2.scrollToElement(element3).click(element3).sendKeys("1000").perform();
		
		//Locating the Go button and clicking on it
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		
		//Wait for page refresh
		Thread.sleep(2000);
		
		//Locating the colour filter and storing it in variable
		WebElement element4 = driver.findElement(By.xpath("//a[contains(text(),'White')]"));
		
		//Switching driver control to action
		Actions act3=new Actions(driver);
		
		//Scroll to that element and click on it
		act3.scrollToElement(element4).click(element4).perform();
		
		//Wait for page refresh
		Thread.sleep(2000);
		
		//Locating the applied filter and saving it in variable
		String text = driver.findElement(By.xpath("//div[@class='filters']")).getText();
		
		//Printing and verifying the price and discounted price in console
		System.out.println("Verifying the filtered price and color"+" "+text);
		
		//Locating the first filtered element and storing it in variable
		WebElement element5 = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		
		//Explicit wait for the element to visible
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//wait until element quick view is visible and click on it
		w.until(ExpectedConditions.visibilityOf(element5)).click();
		
		//Locating the cost and discount percentage element and storing it in variable
		WebElement element6 = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']"));
		
		//Fetching the text and store it in variable
		String text2 = element6.getText();
		
		//printing the cost and discount percentage in console
		System.out.println("Cost and Discounted price is"+" "+text2);
		
		//Take screenshot and store it source variable 
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    
	    //Providing the target location and format
	    File target=new File("./data/Sample1.png");
	    
	    //Copy the screenshot from source to target 
	    FileUtils.copyFile(source, target);
	    
	    //wait for page refresh
	    Thread.sleep(3000);
	    
	    //Closing the current window
	    driver.findElement(By.xpath("//div[contains(@class,'close')]")).click();
	    
	    
	    //close all the window
	    driver.quit();
	}

}

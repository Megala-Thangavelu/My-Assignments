package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
        //Chrome will be gettting special features
		ChromeOptions options = new ChromeOptions();
		
		//Will disable all notifications
		options.addArguments("--disable-notifications");
		
		//Instantiate the Chrome Driver with Options
		ChromeDriver driver = new ChromeDriver(options);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.tatacliq.com/");
		
		//Implicit wait for element to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Locating the Brand element and storing it in webelement
		WebElement element = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));

		//Switch the driver control 
		Actions brand = new Actions(driver);
        
		//Move to brand element 
		brand.moveToElement(element).perform();
        
		//Locating the watches and storing in WebElement
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Watches')]"));
        
		//Switching the driver control
		Actions watch = new Actions(driver);
        
		//Move to Watches & Accessories element 
		watch.moveToElement(element2).perform();
        
		//Locating the first option from featured brand
		WebElement element3 = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']"));
        
		//Switching the driver control
		Actions casio = new Actions(driver);
        
		//Move to Casio element and click on it
		casio.moveToElement(element3).click().perform();
        
		//Locate the SortBy element and storing it in webelement
		WebElement element4 = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
         
		//Using Select class for dropdown
		Select sortby = new Select(element4);
        
		//Choosing the new Arrival by visible text 
		sortby.selectByVisibleText("New Arrivals");
        
		//Locating the Women from category filter and clicking on it
		driver.findElement(By.xpath("//div[text()='Women']")).click();

		//Wait for page refresh
		Thread.sleep(2000);

		//Locating the price list of all elements and storing it in List
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));

		//To collect and display the price list 
		List<Integer> price = new ArrayList<Integer>();
 
		//Iterating through loop to fetch the price of each element
		for (int i = 0; i < elements.size(); i++) {

			//Get the String from each element and store it in variable
			String text = elements.get(i).getText();

			//Replacing the symbol with empty space
			String replaced = text.replaceAll("₹", "");

			//Changing the String to Integer
			int list = Integer.parseInt(replaced);

			//Adding the list of price to List
			price.add(list);
		}
		//To display the list in console
		System.out.println("PriceList" + " " + price);

		//Wait for refresh
		Thread.sleep(3000);

		//Locating the first element
		WebElement element5 = driver.findElement(By.xpath("//h3[text()='Casio']"));

		//Clicking on the element
		driver.executeScript("arguments[0].click();", element5);

		//Getting the number of Windows and storing it in Set
		Set<String> windows = driver.getWindowHandles();

		//Declaring the List 
		List<String> windowList = new ArrayList<String>(windows);

		//Switching to Child Window
		driver.switchTo().window(windowList.get(1));

		//Wait for refresh
		Thread.sleep(2000);

		//Locating the price in child window and storing it in WebElement
		WebElement element6 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));

		//Get the text and store it in variable
		String text = element6.getText();

		//Replace all with only numbers
		String replaceA = text.replaceAll("[^0-9]", "");

		//Converting the string into int
		int priceComparsion = Integer.parseInt(replaceA);

		//Comapring price(0) and price from child window
		if (price.get(0) == priceComparsion) {
			
			//Printing if both are same
			System.out.println("Compared and found both prices are equal");
		} else {
			//Printing if they doesnt match
			System.out.println("Compared and found both prices are not equal");
		}

		//Locating the Add to Bag element 
		WebElement element7 = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));

		//Wait for refresh
		Thread.sleep(2000);
		
		//Switching the driver control
		Actions add = new Actions(driver);

		//Move to Add to cart element and click on it
		add.moveToElement(element7).click().perform();

		//Locate the Cart count and get the number
		String text2 = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();

		//Print it in console
		System.out.println(text2);

		//Locating the Cart and clicking on it
		driver.findElement(By.className("DesktopHeader__myBagShow")).click();

		//Wait for refresh
		Thread.sleep(2000);

		//Giving the output type for Source
		File source = driver.getScreenshotAs(OutputType.FILE);

		//Providing the destination location
		File target = new File("./data/sample1.png");

		//Copying Screenshot from the Source to destination
		FileUtils.copyFile(source, target);
		
		//closing the window
		driver.quit();
		

	}

}

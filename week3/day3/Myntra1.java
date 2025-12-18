package week3.day3;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the driver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.myntra.com/");
		
		//Giving Implicit web for all elements to wait until it loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Sending input in search bar and clicking enter using keyboard action
        driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
        
        Thread.sleep(2000);
        //Clicking on the Men radio button
        driver.findElement(By.xpath("//ul[@class='gender-list']//label")).click();
        
        Thread.sleep(2000);
        //Clicking on laptop bag checkbox
        driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
        
        Thread.sleep(2000);
        //Locating and getting the count of items loaded after applying filter and storing it to local variable 
        String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
        
        //Printing the count of items loaded
        System.out.println("Bags"+ text);
        
        //Collecting elements and assigning it to local variable 
        List<WebElement> brands = driver.findElements(By.className("product-brand"));
        
        //Get the list of brand name and storing it in uniqueBrand
        Set<String> uniqueBrand=new TreeSet<String>();
        
        //Iterating to get text of each element
        for (WebElement brandlist : brands) 
        {
        	//adding the text to Set
        	uniqueBrand.add(brandlist.getText()) ;
        	
        	}
        //Printing the brand name in Set
        System.out.println(uniqueBrand);
        
        //Collecting the product elements and assigning to List of WebElement
        List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h4[@class='product-product']"));
        
        //To List the name have created listOfBags
        Set<String> listOfBags=new TreeSet<String>();
        
        //Iterating to get text of each bag name
        for (WebElement nameOfBag : elements2) 
        {
        	//Fetching the text and assigning it to Set
        	listOfBags.add(nameOfBag.getText());
		}
        //Printing the list of bag name in console
        System.out.println(listOfBags);
        
	}

}

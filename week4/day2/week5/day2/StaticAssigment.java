package week5.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class StaticAssigment extends BaseStaticAssignment {
	
	@Test
	public void staticAssigment() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		Actions act = new Actions(driver);

		act.moveToElement(element).click().perform();

		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[@class='slds-truncate']/span"));

		driver.executeScript("arguments[0].click();", element2);

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");

		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		WebElement element3 = driver.findElement(By.xpath("//span[text()='--None--']"));

		
		
        Actions act2 = new Actions(driver);
        Thread.sleep(2000);
		act2.scrollToElement(element3).perform();
		driver.executeScript("arguments[0].click();", element3);
		Thread.sleep(2000);
		
		//(//span[@class='slds-media__figure slds-listbox__option-icon'])[2]
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Active']"));
		
		driver.executeScript("arguments[0].click();", element4);
		

		
		 driver.findElement(By.xpath("(//ul[@class='slds-button-group-row']/li)[3]")).click(); 
		 WebElement element5 = driver.findElement(By.xpath("//div[@class='slds-hyphenate']"));
		 String text = element5.getText(); 
		 System.out.println(text);
		
		 

	}
}

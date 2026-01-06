package week5.day3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicAssignement extends BaseDynamicAssigment {
	
	@DataProvider(name="getValue")
	public String[][] fetchData(){
		String[][] data=new String[1][4];
		data[0][0]="https://login.salesforce.com";
		data[0][1]="t.megaladevi104@agentforce.com";
		data[0][2]="Yathvikmeg@22";
		data[0][3]="Saleforce Automation by Meg";
		return data;
		}
		
    @Test(dataProvider="getValue")
	public void sales(String url,String uname,String pwd,String title) throws InterruptedException {
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		Actions act = new Actions(driver);

		act.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[@class='slds-truncate']/span"));

		driver.executeScript("arguments[0].click();", element2);
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(title);
		
		driver.findElement(By.xpath("(//ul[@class='slds-button-group-row']/li)[3]")).click(); 
		
		 WebElement element5 = driver.findElement(By.xpath("//div[@class='slds-hyphenate']"));
		 Thread.sleep(2000);
		 String text = element5.getText(); 
		 System.out.println(text);
		
		
		
}
}
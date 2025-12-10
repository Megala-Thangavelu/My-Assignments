package week2.day3;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//instantiate the chrome driver
		driver.manage().window().maximize(); //Maximize the window
		driver.get("https://en-gb.facebook.com");//Load URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Wait till 20 seconds before throwing exception
		driver.findElement(By.linkText("Create new account")).click();//Click on create new account button
		driver.findElement(By.name("firstname")).sendKeys("Yath"); //Locating and sending the firstname
		driver.findElement(By.name("lastname")).sendKeys("S");//Locating and sending lastname
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("8765678908");//Locating and sending phone number
	
		driver.findElement(By.name("reg_passwd__")).sendKeys("meg@22");//Locating and sending input for password
		WebElement element = driver.findElement(By.id("day"));//assigning webelement to variable
		Select options=new Select(element);//creating object for Select class and passing the webelement as argument
		options.selectByIndex(5);//Using one of select class method dropdown is handled
		WebElement element2 = driver.findElement(By.id("month"));//assigning webelement to variable
		Select option2=new Select(element2);//creating object for Select class and passing the webelement as argument
		option2.selectByVisibleText("Mar");//Using one of select class method dropdown is handled
		WebElement element3 = driver.findElement(By.id("year"));//assigning webelement to variable
		Select option3=new Select(element3);//creating object for Select class and passing the webelement as argument
		option3.selectByValue("2022");//Using one of select class method dropdown is handled
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();//clicking the gender radio button		
		driver.close();//closing the driver
	}

	
	
}

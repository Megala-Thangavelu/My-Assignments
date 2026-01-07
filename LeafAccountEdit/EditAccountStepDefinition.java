package stepDefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountStepDefinition extends BaseClass{
	
	
	@When("Click on Find Accounts")
	public void click_on_find_accounts() {
	    driver.findElement(By.linkText("Find Accounts")).click();
	    
	}

	@When("Enter the Account Name {string}")
	public void enter_the_account_name_a_name(String aName) {
	   driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(aName);
	   
	}

	@When("Click on Find Button")
	public void click_on_find_button() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	@Then("Click on First Account ID")
	public void click_on_first_account_id() throws InterruptedException {
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}


	@When("Click on Edit Button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@When("Enter the Description {string}")
	public void enter_the_description(String des) {
	   driver.findElement(By.name("description")).sendKeys(des);
	}

	@Then("Click on Save Button")
	public void click_on_save_button() throws InterruptedException {
	    driver.findElement(By.className("smallSubmit")).click();
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
	    String text = element.getText();
	    System.out.println("AccountEdited: "+text);
	
	}

}

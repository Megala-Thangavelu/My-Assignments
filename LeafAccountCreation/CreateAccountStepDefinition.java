package stepdef;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition extends BaseClass{
	@Given("Click on Account")
	public void click_on_account() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	@When("click on Create Account")
	public void click_on_create_account() {
	    driver.findElement(By.linkText("Create Account")).click();
	}

	@When("Enter the Account Name {string}")
	public void enter_the_account_name(String aName) {
	    driver.findElement(By.id("accountName")).sendKeys(aName);
	}

	@When("Enter the Phone Number {string}")
	public void enter_the_phone_number(String pNum) {
	    driver.findElement(By.id("primaryPhoneNumber")).sendKeys(pNum);
	}

	@When("Enter To Name {string}")
	public void enter_to_name(String toName) {
	    driver.findElement(By.id("generalToName")).sendKeys(toName);
	}

	@Then("Click on Create Button")
	public void click_on_create_button() {
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	    System.out.println("AccountCreated: "+text);
	}



}

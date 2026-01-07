package stepdefinit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccountStepDefinition extends BaseClass {
	@When("Click the Find Accounts tab")
	public void click_the_find_accounts_tab() {
		 driver.findElement(By.linkText("Find Accounts")).click();
	}
	@When("Enter the Account Name {string}")
	public void enter_the_account_name(String findName) {
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(findName);
	}
	@When("Click on Find Button")
	public void click_on_find_button() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	@When("Click on First Account ID")
	public void click_on_first_account_id() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Click on Deactivate Account")
	public void click_on_deactivate_account() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.linkText("Deactivate Account")).click();
	}
	@Then("Click on OK Button")
	public void click_on_ok_button() throws InterruptedException {
		Thread.sleep(2000);
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	  WebElement element = driver.findElement(By.xpath("//span[@class='subSectionWarning']"));
	  String text = element.getText();
	  System.out.println(text);
	
	}
	

}

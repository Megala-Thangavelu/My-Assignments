package stepDefintion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDynamicParameter {
	public ChromeDriver driver;
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }
	
	@Given("Load the URL {string}")
	public void load_the_url(String url) {
		driver.get(url);
	    
	}
	
	@Given("Enter the Username {string}")
	public void enter_the_username(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter the Passowrd {string}")
	public void enter_the_passowrd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@Given("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	@When("Click on toggle button")
	public void click_on_toggle_button() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@When("Click on View All")
	public void click_on_view_all() {
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
	}
	@When("Click on Sales")
	public void click_on_sales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		
		Thread.sleep(2000);
	    WebElement element = driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']/span[text()='Accounts']"));
	    driver.executeScript("arguments[0].click();", element);
	}
	@When("Click on New Button")
	public void click_on_new_button() {
	   driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@Then("Enter the Account Name {string}")
	public void enter_the_account_name(String name) {
	   driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	@Then("Click on Ownership in public")
	public void click_on_ownership_in_public() {
	   WebElement element2 = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
	   driver.executeScript("arguments[0].click();", element2);
	   driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@Then("Click save and verify the Account Name")
	public void click_save_and_verify_the_account_name() {
	   driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	   String text = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content slds-align-middle']")).getText();
	   System.out.println(text);
	}


}

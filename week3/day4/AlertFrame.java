package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		String text2 = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(text2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		String text3 = driver.findElement(By.xpath("//p[text()='You pressed Cancel!']")).getText();
		System.out.println(text3);

	}

}

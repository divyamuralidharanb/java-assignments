package week3.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChange {
	//Explicit Wait for Text Change
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();

		//Wait until text becomes Click Me! and click on it
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if( wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("btn"), "Click ME!"))) {
			driver.findElement(By.id("btn")).click();
		}
		else {
			System.out.println("Element cannot be located");
		}
		
		//Verify if the alert thrown is as expected
		System.out.println(driver.switchTo().alert().getText());
		if(driver.switchTo().alert().getText().contentEquals("Click ME!")) {
			System.out.println("The alert is as expected");
		}
		driver.switchTo().alert().accept();
	}

}

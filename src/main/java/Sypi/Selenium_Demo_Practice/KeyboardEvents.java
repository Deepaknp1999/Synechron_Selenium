package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			
			
			
			WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			
			Actions act = new Actions(driver);
			
			Actions series= act.moveToElement(username).keyDown(username, Keys.SHIFT).sendKeys("Hello");
			
			series.build().perform();
		
	
}
}


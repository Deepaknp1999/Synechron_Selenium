package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollElement {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			
			
			
			WebElement seller = driver.findElement(By.xpath("//*[@id=\"site-footer\"]/div/span/a[2]"));
			
			Actions act = new Actions(driver);
			act.scrollToElement(seller).perform();
			seller.click();
	
}
}

package Sypi.Selenium_Demo_Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			
			
			
			WebElement seller = driver.findElement(By.xpath("//*[@id=\"menu-item-18\"]/a"));
			
			Actions act = new Actions(driver);
			act.doubleClick(seller).perform();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"menu-item-21\"]/a"));
            act.contextClick().perform();
            Thread.sleep(5000);
	
}
}

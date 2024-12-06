package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
			
			Select sel= new Select(dropdown);
			sel.selectByIndex(1);
			Thread.sleep(3000);
			
			sel.selectByValue("option2");
			Thread.sleep(3000);
			sel.selectByVisibleText("Option3");
			Thread.sleep(3000);
			
			}
}

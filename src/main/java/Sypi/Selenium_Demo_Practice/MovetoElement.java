package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			WebElement hover = driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
			
			WebElement top = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]"));
			
			Actions act= new Actions(driver);
			act.doubleClick(hover).perform();
			
			act.moveToElement(top).perform();
			act.click(top).perform();
			
			driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
			
		
			}
}



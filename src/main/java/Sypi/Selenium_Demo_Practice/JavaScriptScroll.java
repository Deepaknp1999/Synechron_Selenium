package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			
			
			
			//WebElement seller = driver.findElement(By.xpath("//*[@id=\"site-footer\"]/div/span/a[2]"));
			
			JavascriptExecutor Js=(JavascriptExecutor)driver;
			
			Js.executeScript("window.scrollyBy(0, 600)", "");
			Thread.sleep(5000);
			Js.executeScript("window.scrollyBy(-300, 0)", "");
			
			//Js.executeScript("window.scrollyBy(900,0)", "");
			//Js.executeScript("window.scrollyBy(-700, o)", "");
			
	
}
}

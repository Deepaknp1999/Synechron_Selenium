package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.navigate().to("https://www.selenium.dev/");
			Thread.sleep(3000);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			

}

}

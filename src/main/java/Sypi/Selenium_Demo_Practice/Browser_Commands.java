package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Commands {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://www.selenium.dev/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String PageSource= driver.getPageSource();
			System.out.println(PageSource);
			
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			
			driver.close();
			
			
			
			
		    /*WebElement Pwd = driver.findElement(By.id("password"));
			Pwd.sendKeys("Password123");
			Thread.sleep(3000);
			
			WebElement Submit = driver.findElement(By.id("submit"));
			Submit.click();
			Thread.sleep(3000);
			
			
			driver.quit();*/
			

}
}

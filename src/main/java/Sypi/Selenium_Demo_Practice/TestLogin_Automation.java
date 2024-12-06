package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin_Automation {

	public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		
		
	    WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("Password123");
		Thread.sleep(3000);
		
		WebElement Submit = driver.findElement(By.id("submit"));
		Submit.click();
		Thread.sleep(3000);
		
		WebElement Homepage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"));
	
		
	if(Homepage.isDisplayed()) {
		System.out.println("Home Page is displayed");
	}
	else {
		System.out.println("HomePage is not displayed");
	}
		
		//driver.quit();
		

	}

}

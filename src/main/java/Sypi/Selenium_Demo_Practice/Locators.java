package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AcMMx-dXVEkQbXeO0-krOBmJJk7KWsQgoG7JAqHkCBSZKSvbMom1irEbJLi9oNIzH_J7gP18snWN4A&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1459841268%3A1733118196774760&ddm=1");
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		username.sendKeys("deepaknpatil121@gmail.com");
		
		
		WebElement Next = driver.findElement(By.id("identifierNext"));
		Next.click();
		Thread.sleep(3000);
		
	    //WebElement Pwd = driver.findElement(By.name("//*[@name=\"Passwd\"]"));
		//Pwd.sendKeys("1234Test");
		//Thread.sleep(3000);
		
		driver.quit();
		
	}

}

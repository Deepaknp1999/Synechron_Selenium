package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_Downloads {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://the-internet.herokuapp.com/upload");
			driver.manage().window().maximize();
			
			WebElement upload = driver.findElement(By.id("file-upload"));

			upload.sendKeys("C://Users//kiosk_user//Pictures//Screenshot 2024-12-02 134432.png");
			
			WebElement uplosubmit = driver.findElement(By.id("file-submit"));
			uplosubmit.click();
			
			WebElement uplosubmit1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
			
			if(uplosubmit1.isDisplayed()) {
				System.out.println("File Uploaded");
			}
			else {
				System.out.println("File not uploaded");
			}
	
}
}

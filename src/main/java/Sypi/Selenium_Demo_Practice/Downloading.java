package Sypi.Selenium_Demo_Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloading {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://the-internet.herokuapp.com/download");
			driver.manage().window().maximize();
			
			WebElement download = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[14]"));
			download.click();
	
			File f = new File("C://Users//kiosk_user//Downloads//bb.txt");
		
			
			if(f.exists()) {
				System.out.println("File exists");
			}
			else {
				System.out.println("File does not exists");
			}
	
}


}

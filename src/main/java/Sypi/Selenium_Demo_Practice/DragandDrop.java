package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			driver.manage().window().maximize();
			
			
			
			WebElement source = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
			
			WebElement dest = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(source, dest).perform();
	
}

}

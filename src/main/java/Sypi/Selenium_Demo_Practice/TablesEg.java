package Sypi.Selenium_Demo_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesEg {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://the-internet.herokuapp.com/tables");
			driver.manage().window().maximize();
			
			List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"table1\"]"));
			int rowsize =row.size();
			System.out.println(rowsize);
			
			List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"table1\"]"));
			int column =col.size();
			System.out.println(column);
			
}
}

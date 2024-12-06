package Sypi.Selenium_Demo_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://www.selenium.dev/");
			driver.manage().window().maximize();
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			int size = links.size();
			
		System.out.println(size);
		
		for (WebElement link : links) {
			
			System.out.println(link.getText());
}
}

}

package Sypi.Selenium_Demo_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEg {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://the-internet.herokuapp.com/windows");
			Thread.sleep(3000);
			
			String Parentwindow = driver.getWindowHandle();
			System.out.println(Parentwindow);
			
			WebElement clickhere = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
			clickhere.click();
			
			Set<String> allwindows = driver.getWindowHandles();
			System.out.println(allwindows);
			
			Iterator<String> itr= allwindows.iterator();
			while(itr.hasNext()) {
				String childwindow = itr.next();
				if(!Parentwindow.equals(childwindow) ) {
					driver.switchTo().window(childwindow);
			String text = driver.findElement(By.xpath("/html/body/div/h3")).getText();
			System.out.println(text);
			//driver.close();
			
			driver.switchTo().defaultContent();
				}
			}
	}

}

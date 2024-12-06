package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerEg {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://jqueryui.com/datepicker/");
			
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			driver.switchTo().frame(frame);
			
			WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		    frame1.click();
			
		    WebElement calendar = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a"));
		    calendar.click();
			Thread.sleep(3000);
			
			String s=calendar.getText();
			
			
			System.out.println(s);
			
	}
}

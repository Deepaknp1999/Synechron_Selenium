package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg {
	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			
			WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
			alert1.click();
			
			Alert alt= driver.switchTo().alert();
			alt.accept();
			Thread.sleep(3000);
			
           
			
			WebElement alert1popup = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
			alert1popup.click();
			
			Alert alt1= driver.switchTo().alert();
			alt1.accept();
			Thread.sleep(3000);
			
            alert1popup.click();
			
			alt.dismiss();
			Thread.sleep(4300);
			
			WebElement prompt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
			prompt.click();
			
			Alert alt2= driver.switchTo().alert();
			alt2.sendKeys("220");
			Thread.sleep(3000);
			
            alt2.accept();
			}
}

package Sypi.Selenium_Demo_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			WebElement Radio1 = driver.findElement(By.xpath("//input[@name='radioButton'][1]"));
			if(Radio1.isEnabled()) {
				Radio1.click();	
			}
			
			
			
		    //WebElement Checkbox = driver.findElement(By.id("checkbox"));
		    //Checkbox.click();
		    
		    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		    
		    int size =checkboxes.size();
		    System.out.println(size);
		    
		    for(int i =0; i<=size; i++)
		    {
		    	checkboxes.get(i).click();
		    }
		
			
			//driver.quit();
			
}
}

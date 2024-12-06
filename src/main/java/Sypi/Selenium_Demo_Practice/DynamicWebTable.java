package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://ui.cogmento.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("deepaknpatil121@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Dnpm1999@");
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
			
			//driver.switchTo().frame("manipel");
			
			//driver.navigate().to("https://ui.cogmento.com/contacts");
			
			driver.findElement(By.xpath("(//span[contains(text(),'Contacts')])")).click();
			
			String before_xpath = "//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[";		
			String after_xpath= "]/td[2]";
			
			for(int i=1; i<=4; i++) {
				String name= driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
				System.out.println(name);
				
				if(name.contains("Peter John")) {
					driver.findElement(By.xpath("//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[+i+]/td[2]")).click();
					
				}
			}
				
}
}



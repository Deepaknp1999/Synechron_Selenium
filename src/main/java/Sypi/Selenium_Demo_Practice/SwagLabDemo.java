package Sypi.Selenium_Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
			user.sendKeys("standard_user");
			
			WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			pwd.sendKeys("secret_sauce");
			
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
			loginbutton.click();
			

			WebElement product1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
			String Productname = product1.getText();
			
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
			addtocart.click();
			
			WebElement carticon = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
			carticon.click();
			
			WebElement productnamevalidation= driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
			String productnamevali = productnamevalidation.getText();
			
			if(Productname.equals(productnamevali)) {
				System.out.println("Product name is matching");
			}
			
		

			WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
			checkout.click();
			

			WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
			firstname.sendKeys("Deepak");
			
			WebElement lastname = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
			lastname.sendKeys("Patil");
			
			WebElement zip = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
			zip.sendKeys("30005");
			
			WebElement cont = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
			cont.click();
			
			WebElement finish = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
			finish.click();
			
			WebElement Confmessage= driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
			String Confmessage1= Confmessage.getText();
			String message ="Thank you for your order!";
			
			if(Confmessage1.equalsIgnoreCase(message)) {
			System.out.println("Order Confirmation Done");
			}
			/*
			 * WebElement Backhome =
			 * driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
			 * Backhome.click();
			 */			
			System.out.println("Automated one product");
	
}
}

package com.softalliance.qa.Selenium_gwen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterNewUser {
	
	@Test
	public static void newUser() throws InterruptedException {
		
		//Initiating the Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		//driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("09024884308");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[@id='business_name']")).sendKeys("TestNew Company");
		driver.findElement(By.xpath("//input[@id='business_address']")).sendKeys("5 Ikotun, Lagos");
		driver.findElement(By.xpath("//input[@id='business_email']")).sendKeys("paul@mailinator.com");
		driver.findElement(By.xpath("//input[@id='business_phone']")).sendKeys("09024898752");
		driver.findElement(By.xpath("//input[@id='business_currency']")).click();
		
//		//click on the Nigerian Currency
//		WebElement reqCurrency = driver.findElement(By.xpath("//div[contains(text(),'Nigerian naira (₦)')]"));
//				
//		//Scroll to the required currency and then click
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",reqCurrency);
//		
//		reqCurrency.click();
		
		/*
		 * Now we go to the CONTACT INFORMATION
		 * where we enter the contact of the Store owner
		 */
		
		driver.findElement(By.xpath("//input[@id='contact_first_name']")).sendKeys("Pee");
		driver.findElement(By.xpath("//input[@id='contact_last_name']")).sendKeys("Surest");
		driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys("paul@mailinator.com");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("09024885255");
		driver.findElement(By.xpath("//input[@id='contact_password']")).sendKeys("22222");
		driver.findElement(By.xpath("//input[@id='contact_confirm_password']")).sendKeys("22222");
		driver.findElement(By.xpath("//div[contains(text(),'Register')]")).click();
		
	}
	

}

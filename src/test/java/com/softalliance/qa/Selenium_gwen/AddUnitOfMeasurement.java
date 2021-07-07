package com.softalliance.qa.Selenium_gwen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjModel.DashboardPage;
import pageObjModel.LoginPage;
import pageObjModel.UnitOfMeasurement;

public class AddUnitOfMeasurement extends UtilsKashiar {
	String Exception="nothing";
	static String name = null;
	static String code = null;
	@Test
	public void kashiar() throws InterruptedException {
		// initiating webdriver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		// instantiating object of Login class
    	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		//input phonenumber
		login.getPhoneNumber().sendKeys("");
		//pin
		login.getPinCode().sendKeys("45");
		//click login
		login.clickButton().click();		Thread.sleep(3000);
		
		// instantiating object of Dashboard class
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		//click on setup menu
		dashboard.getSetup().click();
		//Click on unit of Measurement submenu
		dashboard.getUnitsOfMeasurement().click();
		
		UnitOfMeasurement unitofmeasurement = PageFactory.initElements(driver, UnitOfMeasurement.class);
		// clicking on add measurement button
		unitofmeasurement.getAddMeasurement().click();
		name = getString(5);
		code = getString(2);
		// enter name
		unitofmeasurement.getName().sendKeys(name);
		// enter code
		unitofmeasurement.getCode().sendKeys(code); Thread.sleep(2000);
		// click on save
		unitofmeasurement.getSave().click();
		Thread.sleep(6000);
		
		// checking existing list to find if measuremnet is added
		while (Exception.equalsIgnoreCase("nothing") ) {

			Thread.sleep(2000);
			List<WebElement> myList=driver.findElements(By.tagName("td"));
			//			System.out.println(myList.size());
			for (WebElement webElement : myList) {
				String tds = webElement.getText();
				if(tds.equalsIgnoreCase(name)||tds.equalsIgnoreCase(code)) 
				{
					Exception = "error dey";
					System.out.println(tds);
				} else {

				}
			}// clicking next until it sees the unit we just created
			unitofmeasurement.getNextUOM().click();
		}	
	}



}

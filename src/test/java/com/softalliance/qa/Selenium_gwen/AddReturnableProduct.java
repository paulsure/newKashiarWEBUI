package com.softalliance.qa.Selenium_gwen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjModel.DashboardPage;
import pageObjModel.LoginPage;
import pageObjModel.ReturnableProduct;
import pageObjModel.UnitOfMeasurement;

public class AddReturnableProduct extends UtilsKashiar {
	String test = "nothing";
//	static String name = null;
//	static String code = null;
	WebDriver driver = null;

	@SuppressWarnings("unused")
	@Test
	public void kashiar() throws InterruptedException {
		// initiating webdriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\iankoh.SOFTALLIANCE\\Documents\\sellenium drivers\\gecko driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://iecr.softalliance.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		// instantiating object of Login class
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		// input phonenumber
		
		login.getPhoneNumber().sendKeys("09024884308");
		// pin
		login.getPinCode().sendKeys("12345");
		// click login
		login.clickButton().click();
		Thread.sleep(2000);

		// instantiating object of Dashboard class
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		//click on setup menu
		dashboard.getSetup().click();
		//Click on Returnable Packages submenu
		dashboard.getReturnablePackages().click();
		Thread.sleep(2000);


		// instantiating object of ReturnableProduct class
		ReturnableProduct returnableProduct = PageFactory.initElements(driver, ReturnableProduct.class);
		// click on add product button
//		WebElement eleme = 	returnableProduct.getAddProduct();
				//driver.findElement(By.xpath("//button[@id='registerButton']"));
//		jse.executeScript("arguments[0].click()", eleme);
		Thread.sleep(3000);
		returnableProduct.getAddProduct().click();
		// Click on add icon

		// checking if there products to convert to returnable products
		if (true) {
			//click add icon
			WebElement addicon = returnableProduct.getAddicon();
			jse.executeScript("arguments[0].click()", addicon);
			// get product name
			String productName = returnableProduct.getnameField().getText();
			Thread.sleep(2000);
			// toggle is returnable button
			returnableProduct.getIsreturnabletoggle().click();
			// click on update product button
			returnableProduct.getUpdateProduct().click();			
			// checking for success toast
			System.out.println(returnableProduct.getSuccessToast().getText());
			Thread.sleep(2000);
			returnableProduct.getClosePage().click();

			// checking existing list to find if measuremnet is added
			while (test.equalsIgnoreCase("nothing") ) {
				Thread.sleep(2000);
				List<WebElement> myList = driver.findElements(By.tagName("td"));
				 System.out.println(myList.size());
				 System.out.println(myList);
				for (WebElement webElement : myList) {
					String tds = webElement.getText();
					if (tds.equalsIgnoreCase(productName)) {
						test = "error dey";
						System.out.println(tds);
					} else {

					}
				} // clicking next until it sees the product we just created
				returnableProduct.getNextRP().click();
			}
		}else {
			System.out.println("No products were found.\nAll existing products are returnable");
		}


	}

}

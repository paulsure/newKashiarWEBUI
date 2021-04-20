package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage {
	final WebDriver driver;

	//Constructor, as every page needs a Webdriver to find elements
	public DashboardPage(WebDriver driver){
		this.driver=driver;
	}
	//Locating Setup menu
	@FindBy(xpath = "//div[contains(text(),'Setup')]")
	private	WebElement setup;	
	public WebElement getSetup() {
		return setup;
	}

	//Locating Units of Measurement (Setup submenu)
	@FindBy(xpath = "//div[contains(text(),'Units of Measurement')]")
	private WebElement unitsOfMeasurement;	
	public WebElement getUnitsOfMeasurement() {
		return unitsOfMeasurement;
	}

	//Locating Units of Measurement (Setup submenu)
	@FindBy(xpath = "//div[contains(text(),'Returnable packages')]")
	private WebElement returnablePackages;	
	public WebElement getReturnablePackages() {
		return returnablePackages;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
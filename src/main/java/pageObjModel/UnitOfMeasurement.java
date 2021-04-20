package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitOfMeasurement {

	final WebDriver driver;

	//Constructor, as every page needs a Webdriver to find elements
	public UnitOfMeasurement(WebDriver driver){
		this.driver=driver;
	}
	// add measuremrnt button
	@FindBy(xpath = "//div[@data-app= 'true']/div[4]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]"
			+ "/div[1]/div[1]/div[2]/button[1]")
	private	WebElement addMeasurement;
	
	public WebElement getAddMeasurement() {
		return addMeasurement;
	}

	// name button
	@FindBy(xpath = "//input[@name = 'name']")
	private	WebElement name;
	
	public WebElement getName() {
		return name;
	}
	
	// code button
	@FindBy(xpath = "//input[@name = 'code']")
	private	WebElement code;
	
	public WebElement getCode() {
		return code;
	}
	
	// save button
	@FindBy(xpath = "//div[contains(text(),'Save')]")
	private	WebElement Save;
	
	public WebElement getSave() {
		return Save;
	}
	
	// next page button
	@FindBy(xpath = "//i[contains(text(),'chevron_right')]")
	private	WebElement Next;
	
	public WebElement getNextUOM() {
		return Next;
	}

	public WebDriver getDriver() {
		return driver;
	}


}

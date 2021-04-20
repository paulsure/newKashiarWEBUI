package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnableProduct {

	final WebDriver driver;

	//Constructor, as every page needs a Webdriver to find elements
	public ReturnableProduct(WebDriver driver){
		this.driver=driver;
	}
	// add product button
	@FindBy(xpath = "//div[@id='app']/div[@id='app']/div[5]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]")
	private	WebElement addProduct;

	public WebElement getAddProduct() {
		return addProduct;
	}

	// add icon button
	@FindBy(xpath = "//div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/button[1]/div[1]/i[1]")
	private	WebElement addicon;

	public WebElement getAddicon() {
		return addicon;
	}

	// returnable toggle button
	@FindBy(xpath = "//div[@id='app']/div[@id='app']/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private	WebElement isreturnabletoggle;

	public WebElement getIsreturnabletoggle() {
		return isreturnabletoggle;
	}

	// edit name field
	@FindBy(xpath = "//div[@id='app']/div[@id='app']/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private	WebElement nameField;

	public WebElement getnameField() {
		return nameField;
	}

	// next page button
	@FindBy(xpath = "//i[contains(text(),'chevron_right')]")
	private	WebElement Next;

	public WebElement getNext() {
		return Next;
	}

	// update product button
	@FindBy(xpath = "//div[contains(text(),'Update product')]")
	private	WebElement updateProduct;

	public WebElement getUpdateProduct() {
		return updateProduct;
	}

	// close button
	@FindBy(xpath = "//div[@id='app']/div[@id='app']/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]/div[1]")
	private	WebElement close;

	public WebElement getcloseAddProd() {
		return close;
	}

	// success toast message
	@FindBy(xpath = "//span[contains(text(),'Operation was successful')]")
	private	WebElement successToast;

	public WebElement getSuccessToast() {
		return successToast;
	}

	// Close page button
	@FindBy(xpath = "//div[@id='app']/div[@id='app']/div[3]/div[1]/nav[1]/div[1]/button[1]/div[1]")
	private	WebElement closePage;

	public WebElement getClosePage() {
		return closePage;
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app']/div[5]/div[1]/main[1]/div[1]/div[1]/div[2]"
			+ "/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[2]/div[1]/i[1]")
	private	WebElement next;

	public WebElement getNextRP() {
		return next;
	}

	public WebDriver getDriver() {
		return driver;
	}
	

}

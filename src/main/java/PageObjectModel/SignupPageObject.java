package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {

	public WebDriver driver; // This driver don't have scope

	private By FirstName = By.xpath("//input[@name='UserFirstName']");
	private By LastName = By.xpath("//input[@name='UserLastName']");
	private By JobTitle = By.xpath("//input[@name='UserTitle']");
	private By clickonNext = By.xpath("//span[contains(text(),'Next')]");
	private By SelectEmployee = By.xpath("//select[@name='CompanyEmployees']");
	private By SelectCompany = By.xpath("//input[@name='CompanyName']");
	private By SelectCountry = By.xpath("//select[@name='CompanyCountry']");
	private By clickNext = By.xpath("//span[contains(text(),'Next')]");
	private By enterphone = By.xpath("//input[@name='UserPhone']");

	public SignupPageObject(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement enterFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement enterLastName() {
		return driver.findElement(LastName);
	}

	public WebElement enterJobTitle() {
		return driver.findElement(JobTitle);
	}

	public WebElement clickonNext() {
		return driver.findElement(clickonNext);
	}

	public WebElement SelectEmployee() {
		return driver.findElement(SelectEmployee);
	}

	public WebElement enterCompany() {

		return driver.findElement(SelectCompany);
	}

	public WebElement SelectCountry() {
		return driver.findElement(SelectCountry);
	}

	public WebElement ClickNext() {
		return driver.findElement(clickNext);
	}
	public WebElement EnterPhoneNo() {
		return driver.findElement(enterphone);
	}

	
}

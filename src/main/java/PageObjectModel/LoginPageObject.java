package PageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver; //This driver don't have scope
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@name='Login']");
	private By TryforFree=By.xpath("//a[@id='signup_link']");
	
	public LoginPageObject(WebDriver driver) {
		
		this.driver=driver;
		
	}

	public WebElement EnterUsername(){
		
		return driver.findElement(username);
		
	}
	
public WebElement EnterPassword(){
		
		return driver.findElement(password);
		
	}
public WebElement ClickOnLogin(){
	
	return driver.findElement(login);
	
}
public WebElement ClickOnTryforFree(){
	
	return driver.findElement(TryforFree);
	
}



}

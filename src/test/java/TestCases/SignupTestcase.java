package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.BaseClass;
import Resources.Constants;
import Resources.commonMethods;

public class SignupTestcase extends BaseClass {

	@Test

	public void VerifySignup() throws IOException, InterruptedException {
//change is done
		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.ClickOnTryforFree().click();

		SignupPageObject spo = new SignupPageObject(driver);

		Thread.sleep(5000);
		spo.enterFirstName().sendKeys(Constants.FirstName);
		spo.enterLastName().sendKeys(Constants.LastName);
		spo.enterJobTitle().sendKeys(Constants.JobTitle);
		spo.clickonNext().click();

		commonMethods.selectDropdown(spo.SelectEmployee(), 2);

		commonMethods.selectDropdown(spo.SelectCountry(), 4);

		/*
		 * WebElement a = spo.SelectEmployee();
		 * spo.enterCompany().sendKeys(Constants.SelectCompany); Select s = new
		 * Select(a); s.selectByIndex(1);
		 */

		/*
		 * WebElement a1 = spo.SelectCountry(); Select s1 = new Select(a1);
		 * s1.selectByIndex(5); spo.ClickNext().click();
		 * spo.EnterPhoneNo().sendKeys(Constants.enterphone);
		 */

		/*
		 * WebElement b = spo.SelectCountry(); Select c = new Select(b);
		 * c.selectByVisibleText("India");
		 */

	}
}
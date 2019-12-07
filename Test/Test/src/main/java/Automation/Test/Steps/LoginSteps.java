package Automation.Test.Steps;

import org.openqa.selenium.WebDriver;

import Automation.Test.PageObject.LoginObjects;

public class LoginSteps extends Common{
	LoginObjects loginObjects = new LoginObjects();
	
	public void clickLogin(WebDriver driver) {
		loginObjects.loginBtn(driver).click();
	}
}

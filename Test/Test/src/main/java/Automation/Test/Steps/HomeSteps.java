package Automation.Test.Steps;

import org.openqa.selenium.WebDriver;

public class HomeSteps {

	public boolean verifyUrl(WebDriver driver, String expectUrl) {
		return driver.getCurrentUrl().equals(expectUrl);
	}
}

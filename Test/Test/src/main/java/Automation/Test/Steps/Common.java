package Automation.Test.Steps;

import org.openqa.selenium.WebElement;

public class Common {
	public void sendKeyToElement(WebElement element, String key) {
		System.out.println("Send key to element");
		element.clear();
		element.sendKeys(key);
	}
}

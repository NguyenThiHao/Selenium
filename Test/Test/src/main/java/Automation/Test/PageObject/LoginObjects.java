package Automation.Test.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {
	public WebElement nameInput(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='uid']"));
	}
	
	public WebElement passInput(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='btnLogin']"));
	}
	
}

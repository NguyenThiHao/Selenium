package Automation.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Automation.Test.PageObject.LoginObjects;
import Automation.Test.Steps.HomeSteps;
import Automation.Test.Steps.LoginSteps;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Demo {
	LoginObjects loginObject = new LoginObjects();
	LoginSteps loginSteps = new LoginSteps();
	HomeSteps homeSteps = new HomeSteps();
	
	static String  url = "http://www.demo.guru99.com/V4/index.php";
	String username = "mngr236794";
	String pass = "pApyjug";
	String homeUrl = "http://www.demo.guru99.com/V4/manager/Managerhomepage.php123";
	
	public static WebDriver driver;
	@Before
	public void setup() {
		System.out.println("SETUP");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
//		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception{
		System.out.println("TEST");
		
		loginSteps.sendKeyToElement(loginObject.nameInput(driver), username);
		loginSteps.sendKeyToElement(loginObject.passInput(driver), pass);
		loginSteps.clickLogin(driver);
		
		Assert.assertTrue(homeSteps.verifyUrl(driver, homeUrl));
	}
	
	@After
	public void tearDown() {
		System.out.println("TEARDOWN");
		driver.quit();
	}
}

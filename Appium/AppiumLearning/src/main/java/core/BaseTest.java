package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeTest
	public void beforeSuite() {
		driver = new CreateAndroidDriver().getAndroidDriver();
		wait = new WebDriverWait(driver, 30);
	}
}

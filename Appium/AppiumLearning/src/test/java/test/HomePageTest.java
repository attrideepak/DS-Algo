package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import activities.HomePageActivity;
import core.BaseTest;
import core.CommonActions;
import core.CreateAndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjects.HomePage;

public class HomePageTest extends BaseTest {
	private AppiumDriver localAppiumDriver;
	HomePage homePage;
	public WebDriver driver;
	
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		//localAppiumDriver = (AppiumDriver) super.driver;
		driver = new CreateAndroidDriver().getAndroidDriver();
		homePage = new HomePage(localAppiumDriver);
		
	}
	
	@Test
	public void homeTest() {
		homePage.clickMenuButton();
	}
	
}

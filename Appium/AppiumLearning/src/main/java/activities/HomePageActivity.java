package activities;

import io.appium.java_client.AppiumDriver;
import pageobjects.HomePage;

public class HomePageActivity {

	//AppiumDriver localAppiumDriver;
    HomePage homePage;
    
    public HomePageActivity(AppiumDriver driver) {
        homePage = new HomePage(driver);
    }
    
    public void clickMenu() {
	homePage.clickMenuButton();	
	}
}

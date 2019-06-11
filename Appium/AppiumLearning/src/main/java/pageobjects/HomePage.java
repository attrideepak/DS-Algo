package pageobjects;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.CommonActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {	
	private AppiumDriver localAppiumDriver;
	CommonActions commonActions;
	
	public HomePage(AppiumDriver driver) {
		commonActions = new CommonActions(localAppiumDriver);
		localAppiumDriver = driver;
		PageFactory.initElements(localAppiumDriver,this);
	}
	
	@AndroidFindBy(id = "com.zoomcar.debug:id/text_start_date_time")
    private WebElement startTimeTextBox;

    @AndroidFindBy(id = "com.zoomcar.debug:id/text_end_date_time")
    private WebElement endTimeTextBox;

    @AndroidFindBy(id = "com.zoomcar.debug:id/button_find_cars")
    private WebElement findCarsButton;

    @AndroidFindBy(id = "com.zoomcar.debug:id/text_vehicle_type")
    private List<WebElement> vehicleTypeTab;
    
    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement menuButton;
    
    public void clickMenuButton() {
       // commonActions.clickElement(menuButton);
    	menuButton.click();
    }
}

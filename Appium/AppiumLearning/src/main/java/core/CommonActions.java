package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class CommonActions {
	public AppiumDriver localAppiumDriver;

    public CommonActions(AppiumDriver localAppiumDriver) {
        this.localAppiumDriver = localAppiumDriver;
    }

    public void clickElement(WebElement myElement) {
       // waitForElementToBeClickable(myElement);
        try {
            myElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(WebElement myElement) {
        WebDriverWait wait = new WebDriverWait(localAppiumDriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(myElement));
    }

}

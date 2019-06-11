package core;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;





public class CreateAndroidDriver {
	    public WebDriver driver = null;
	    AppiumDriver appiumDriver;
	    AppiumServerManager appiumServerManager = new AppiumServerManager();
	    private static Logger logger = Logger.getLogger(CreateAndroidDriver.class);
	    
	   
	    public AppiumDriver getAndroidDriver() {	
	    logger.info("Creating android driver");	
		String path = System.getProperty("user.dir") + "/src/main/resources/app-debug.apk";
	    File apk = new File(path);
	    
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		capabilities.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		//capabilities.setCapability("platformVersion", value);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("appActivity", "com.zoomcar.activity.SplashActivity");
		capabilities.setCapability("appPackage","com.zoomcar.debug");
	
		
		
		try {
		URL url = appiumServerManager.startAppiumServer();
		appiumDriver = new AndroidDriver(url, capabilities);	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	}
		appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return appiumDriver;
	    }
	 
   
}

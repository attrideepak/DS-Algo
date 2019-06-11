package core;

import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServerManager {
	AppiumDriverLocalService service;
	AppiumServiceBuilder builder;
	//URL url;
	
	public URL startAppiumServer() {
		URL url;
		builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingAnyFreePort();
		builder.withStartUpTimeOut(20000, TimeUnit.MILLISECONDS);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
		builder.withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER, "200" + new Random().nextInt(50));
		
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
        url = service.getUrl();
		return url;
	}

}

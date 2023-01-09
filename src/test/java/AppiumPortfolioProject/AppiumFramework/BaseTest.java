package AppiumPortfolioProject.AppiumFramework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	public void ConfigureAppium() throws MalformedURLException {
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\lordr\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 2 API 25");
		options.setApp("C:\\Users\\lordr\\AppiumWorkspace\\AppiumFramework\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}
	
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}

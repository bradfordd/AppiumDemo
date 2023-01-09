
package AppiumPortfolioProject.AppiumFramework;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.io.*;
import java.net.*;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.android.options.*;
import io.appium.java_client.service.local.*;

public class AppiumBasics extends BaseTest{ 
	
	@Test
	public void WifiSettingsName() throws MalformedURLException {
		try {
			AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\lordr\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
			service.start();
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Pixel 2 API 25");
			options.setApp("C:\\Users\\lordr\\AppiumWorkspace\\AppiumFramework\\src\\test\\java\\resources\\ApiDemos-debug.apk");
			
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			driver.quit();
			service.stop();
		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
	}
}
 
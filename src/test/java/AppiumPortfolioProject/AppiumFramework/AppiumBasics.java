
package AppiumPortfolioProject.AppiumFramework;

import org.openqa.selenium.By;
import org.testng.Assert;
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
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
			driver.findElement(By.id("android:id/checkbox")).click();
			driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
			String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
			Assert.assertEquals(alertTitle, "WiFi settings");
			driver.findElement(By.id("android:id/edit")).sendKeys("Bradford Wifi");
			driver.findElement(By.id("android:id/button1")).click();

		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
	}
}
 
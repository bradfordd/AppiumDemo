
package AppiumPortfolioProject.AppiumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.google.common.collect.ImmutableMap;

import java.io.*;
import java.net.*;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.*;
import io.appium.java_client.service.local.*;

public class MiscAppium extends BaseTest{ 
	
	@Test
	public void Miscellaneous() throws MalformedURLException {
		try {
			//adb shell dumpsys window | find "mCurrentFocus" 
			 Activity activity = new Activity("com.example.android.apis", "com.example.android.apis.preference.PreferenceDependencies");
			 driver.startActivity(activity);
			 driver.findElement(By.id("android:id/checkbox")).click();
			 DeviceRotation landScape = new DeviceRotation(0, 0, 90);
			 driver.rotate(landScape);
			 driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
			 String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
			 Assert.assertEquals(alertTitle, "WiFi settings");
			 
			 driver.setClipboardText("Bradford Wifi");
			 driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
			 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			 driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 driver.pressKey(new KeyEvent(AndroidKey.HOME));
		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	 
	
	
}
 
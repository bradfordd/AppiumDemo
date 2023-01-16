
package AppiumPortfolioProject.AppiumFramework;

import org.openqa.selenium.By;
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
import io.appium.java_client.android.options.*;
import io.appium.java_client.service.local.*;

public class LongPress extends BaseTest{ 
	
	@Test
	public void LongPressGesture() throws MalformedURLException {
		try {
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
			driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
			WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
			longPressAction(ele);
//			((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
//					ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
//							"duration",2000));
			String menuText = driver.findElement(By.id("android:id/title")).getText();
			Assert.assertEquals(menuText, "Sample menu");
			Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	 
	
	
}
 
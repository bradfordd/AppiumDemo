
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

public class ScrollDemo extends BaseTest{ 
	
	@Test
	public void ScrollDemoTest() throws MalformedURLException {
		try {
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			
			//where to scroll is known prior
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
			
			scrollToEndAction();
			Thread.sleep(2000);
		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	 
	
	
}
 
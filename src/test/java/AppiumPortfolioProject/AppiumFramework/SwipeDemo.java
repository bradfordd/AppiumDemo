
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

public class SwipeDemo extends BaseTest{ 
	
	@Test
	public void SwipeDemoTest() throws MalformedURLException {
		try {
			 driver.findElement(AppiumBy.accessibilityId("Views")).click();
			 driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
			 driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
			 WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
			 Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "true");
			 //Swipe
			 
			 swipeAction(firstImage, "left");
				/*
				 * ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
				 * ImmutableMap.of( "elementId", ((RemoteWebElement)firstImage).getId(),
				 * "direction", "left", "percent", 0.75 ));
				 */
			 	/*
				  ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
				  ImmutableMap.of( "left", 100, "top", 100, "width", 200, "height", 200,
				  "direction", "left", "percent", 0.75 ));
				 */
			 Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "false");
		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	 
	
	
}
 
package AppiumPortfolioProject.AppiumFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ECommerce_tc_1 extends EcommerceBaseTest {
	@Test
	public void FillForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Shetty");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cambodia\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Cambodia']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
	}
}

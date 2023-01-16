package AppiumPortfolioProject.AppiumFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDialogsDemo extends BaseTest{

	@Test
	public void OkCancelDialogsDemoTest() throws MalformedURLException {
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK Cancel dialog with a message\"]")).click();
			WebElement alertText = driver.findElement(By.id("android:id/title_template"));
			//WebElement alertOptions = driver.findElement(By.xpath("(//android.widget.LinearLayout)[1]"));
			Assert.assertEquals(true, alertText.isDisplayed());
			Assert.assertEquals(true, alertText.isDisplayed());
			driver.findElement(By.id("android:id/button1")).click();
		} catch(Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@Test
	public void OkCancelLongMessageDemoTest() throws MalformedURLException {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK Cancel dialog with a long message\"]")).click();
		WebElement alertText = driver.findElement(By.id("android:id/title_template"));
		WebElement alertOptions = driver.findElement(By.xpath("(//android.widget.LinearLayout)[1]"));
		Assert.assertEquals(true, alertText.isDisplayed());
		Assert.assertEquals(true, alertOptions.isDisplayed());
		driver.findElement(By.id("android:id/button1")).click();
	}
	@Test
	public void OkCancelVeryLongMessageDemoTest() throws MalformedURLException {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK Cancel dialog with ultra long message\"]")).click();
		driver.findElement(By.xpath("//android:id/button3")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"List dialog\"]")).click()
	}
	
}

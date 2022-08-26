package adeoluogungbesan;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;

public class appiumBasics extends BaseTest {
	
	
	
	
	@Test
	public void wifiSettings() throws MalformedURLException, InterruptedException {
		//-xpath, id, accessilityid, classname, androiduiautomator
//@tagName[@attribute-'value']= xpath
		// driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))"); 

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click()",
		 * driver.findElement(By.xpath("(//android.widget.LinearLayout)[2]")));
		 */
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("adeWifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();		
		
		
		
		
		
	}

}

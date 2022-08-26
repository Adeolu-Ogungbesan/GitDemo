package adeoluogungbesan;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;

public class LongPressTest extends BaseTest {

	
	
	@Test
	public void longPress() {
		 //tagName[@attribute-'value']
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Custom Adapter']")).click();
		//driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPress(ele);
		/*
		 * ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
		 * ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(), "duration",
		 * 2000));
		 */
		String sampleMenu = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(sampleMenu, "Sample menu");
		driver.findElement(By.id("android:id/title")).click();
						 
		
		/*
		 * driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		 * "elementId", ((RemoteWebElement) element).getId()
		 */
	}
}

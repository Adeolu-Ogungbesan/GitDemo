package AssignmentFolder;

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

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;

public class singleChoiceListDemo extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Map']")).isSelected();
		String Map = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Map']")).getText();
		Assert.assertEquals(Map, "Map");
		String satellite = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Satellite']")).getText();
		Assert.assertEquals(satellite, "Satellite");
		String trafic = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Traffic']")).getText();
		Assert.assertEquals(trafic, "Traffic");
		String stretview = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Street view']")).getText();
	Assert.assertEquals(stretview, "Street view");
	driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Street view']")).click();	
	driver.findElement(By.id("android:id/button2")).isDisplayed();
	driver.findElement(By.id("android:id/button1")).click();
	
		Thread.sleep(2000);
}
}
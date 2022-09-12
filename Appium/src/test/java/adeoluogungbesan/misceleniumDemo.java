package adeoluogungbesan;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class misceleniumDemo extends BaseTest {

	
	
	@Test
	public void Miscelenium() throws InterruptedException {
		//adb shell dumpsys window | grep -E 'mCurrentFocus'
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.AllProductsActivity");
		driver.startActivity(activity);
		
		//driver.findElement(By.id("android:id/checkbox")).click();
		//To rotate the device
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(ScreenOrientation.LANDSCAPE);		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		//To set and get text on the clipboard
		driver.setClipboardText("adeWifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}

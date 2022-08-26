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

public class voiceMailDemo extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("Send Call to VoiceMail")).click();
	driver.findElement(By.id("android:id/icon")).isDisplayed();
	String voiceMail = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(voiceMail, "Send Call to VoiceMail");
	
		Thread.sleep(2000);
}
}
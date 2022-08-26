package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class textEntryBoxDemo extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
	String text = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(text, "Text Entry dialog");
	driver.findElement(By.id("android:id/icon")).isDisplayed();
	String name = driver.findElement(AppiumBy.accessibilityId("Name:")).getText();
	Assert.assertEquals(name, "Name:");
	driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("adeolu");
	String password = driver.findElement(AppiumBy.accessibilityId("Password:")).getText();
	Assert.assertEquals(password, "Password:");
	driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("password");
	driver.findElement(By.id("android:id/button2")).isEnabled();
	driver.findElement(By.id("android:id/button1")).click();
	
	
	
		Thread.sleep(2000);
}
}
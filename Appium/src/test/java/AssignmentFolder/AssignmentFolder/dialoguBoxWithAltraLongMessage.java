package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class dialoguBoxWithAltraLongMessage extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		String headerTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(headerTitle, "Header title");
		driver.findElement(By.id("android:id/button2")).click();
		Thread.sleep(2000);
}
}
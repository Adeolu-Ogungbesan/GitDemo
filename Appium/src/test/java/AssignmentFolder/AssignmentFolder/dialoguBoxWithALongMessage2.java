package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class dialoguBoxWithALongMessage2 extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	String headerTittle = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(headerTittle, "Header title");
	driver.findElement(By.id("android:id/button3")).click();
		Thread.sleep(2000);
}
}
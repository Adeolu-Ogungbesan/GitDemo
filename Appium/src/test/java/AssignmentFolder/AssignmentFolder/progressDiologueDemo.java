package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class progressDiologueDemo extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(By.id("io.appium.android.apis:id/progress_button")).click();
		driver.findElement(By.id("io.appium.android.apis:id/checkbox_button")).isDisplayed();
		driver.findElement(By.id("io.appium.android.apis:id/text_entry_button")).click();
	
		Thread.sleep(2000);
}
}
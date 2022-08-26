package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class dialoguBoxWithAMessage extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		String dialogueBox = driver.findElement(By.id("android:id/alertTitle")).getText();
		//Assert.assertEquals(dialogueBox, "Lorem ipsum dolor sit aie consectetur adipiscing...");
		//driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("android:id/button2")).click();
		Thread.sleep(2000);
}
}
package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class listDialogue extends BaseTest {

	
	@Test
	public void swipeDemo() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
	String command2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Command two']")).getText();
	Assert.assertEquals(command2, "Command two");
	driver.findElement(By.xpath("//android.widget.TextView[@text='Command two']")).click();
	String commandText = driver.findElement(By.id("android:id/message")).getText();
	Assert.assertEquals(commandText, "You selected: 1 , Command two");
		Thread.sleep(2000);
}
}
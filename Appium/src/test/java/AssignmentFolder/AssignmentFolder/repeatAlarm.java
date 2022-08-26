package AssignmentFolder;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import adeoluogungbesan.BaseTest;
import io.appium.java_client.AppiumBy;

public class repeatAlarm extends BaseTest {

	
	@Test
	public void repeatAlarm() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
	driver.findElement(By.id("android:id/icon")).isDisplayed();
	String alarm = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(alarm, "Repeat alarm");
	String monday = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Monday']")).getText();
	Assert.assertEquals(monday, "Every Monday");
	String tue = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Tuesday']")).getText();
	Assert.assertEquals(tue, "Every Tuesday");
	String wed = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Wednesday']")).getText();
	Assert.assertEquals(wed, "Every Wednesday");
	String thur = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Thursday']")).getText();
	Assert.assertEquals(thur, "Every Thursday");
	String fri = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Friday']")).getText();
	Assert.assertEquals(fri, "Every Friday");
	String sat = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Saturday']")).getText();
	Assert.assertEquals(sat, "Every Saturday");
	String sun = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Sunday']")).getText();
	Assert.assertEquals(sun, "Every Sunday");
	driver.findElement(By.id("android:id/button2")).isDisplayed();
	driver.findElement(By.id("android:id/button2")).isEnabled();
	driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
}
}
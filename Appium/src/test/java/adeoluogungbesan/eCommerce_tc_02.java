package adeoluogungbesan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_02 extends BaseTest {
	@Test
	public void fillForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Adeolu Ogungbesan");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		System.err.println("The tatal number of product available is:"+productCount);
		for(int i = 0; i <productCount; i++ )
		{
		
			String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		if(productName.equalsIgnoreCase("Jordan 6 Rings")) 
		{
		 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		}
		
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		String displayNamed = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		Assert.assertEquals(displayNamed, "Jordan 6 Rings");
		Thread.sleep(2000);
	}
	

}

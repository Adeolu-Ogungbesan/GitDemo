package adeoluogungbesan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_3 extends BaseTest {
	@SuppressWarnings("unused")
	@Test
	public void fillForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Adeolu Ogungbesan");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
			 	
	 List<WebElement> productPrice = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	 int productCount = productPrice.size();
	 double totalSum = 0;
		for(int i=0; i<productCount; i++)
		{
			String amountString = productPrice.get(i).getText();
			double price =Double.parseDouble(amountString.substring(1));
			totalSum = totalSum + price;
			
			System.out.println("The total sum is :" + "$"+totalSum);
			
		}
		
	String displayPrice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	double formattedDisplayPrice = getFormatedSum(displayPrice);
	Assert.assertEquals(formattedDisplayPrice, totalSum);
	Thread.sleep(2000);
	WebElement TAndCBtn = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
	longPress(TAndCBtn);
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.xpath("//android.widget.CheckBox[@package='com.androidsample.generalstore']")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	Thread.sleep(8000);

	}
	
}

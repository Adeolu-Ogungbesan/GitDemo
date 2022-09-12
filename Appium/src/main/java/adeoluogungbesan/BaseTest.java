package adeoluogungbesan;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 public static AndroidDriver driver = null;
	static AppiumDriverLocalService servic = null;
	@BeforeClass
	public void CofigureDriver() throws MalformedURLException {
		//Start appium programatically I still neet to download latest android version in the emulator
				//AndroiDriver
				//Appium code -> Appium server-> mobile
		/*
		 * WebDriverManager wdm = WebDriverManager.chromedriver().browserVersion(39);
		 * wdm.setup(); String chromedriverPath = wdm.getDownloadedDriverPath();
		 */			 servic = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\hp\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
				servic.start();
				UiAutomator2Options options = new UiAutomator2Options();
				//options.setChromedriverExecutable(chromedriverPath);
				options.setDeviceName("Pixel 5 API 22");
				//options.setApp("C:\\Users\\hp\\eclipse-workspace\\Appium\\uTILS\\resources\\ApiDemos-debug.apk");
				options.setApp("C:\\Users\\hp\\git\\repository\\Appium\\uTILS\\resources\\General-Store.apk");
				
				 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
	}
	public void longPress(WebElement ele) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				 ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
						 "duration", 2000));
	}
		public void ScrollToEndAction() {
			boolean canScrollMore;
			do
			{
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 3.0
				));
			}while( canScrollMore);
			
			
		
		
	}
		public void SwipeAction(WebElement ele, String direction) {

			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
					"elementId", ((RemoteWebElement)ele).getId(),
				    "direction", "left",
				    "percent", 0.75
				));
			
			}
		public double getFormatedSum(String amount) {
			double price =Double.parseDouble(amount.substring(1));
			return price;
				
			
		}
	@AfterClass
				public void TearDown() throws InterruptedException {
					Thread.sleep(3000);
					driver.quit();
					
					
					servic.stop();
				}
		
	}



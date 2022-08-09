package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.StudentSigninPageObj;
import Pages.studentSignUppageObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SigninPageTest {

public WebDriver driver;
	
	/*
	 * public static WebDriver getDriver() { return driver; }
	 */
	
	

	@BeforeSuite 
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser successfully setup");
		driver.get("https://basedev.gradely.co/auth/login");
		System.out.println("Navigate to the site");

	}

	@Test
	public void signin() {
		StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);
		pageObj.EnterUserName("latop+24@live.com");
		System.out.println("User Name enter successfully");
		pageObj.EnterPassword("password");
		System.out.println("Password entered successfully");
		pageObj.ClickLoginBtn();
		System.out.println("Login successfully");
		//WebElement element = driver.findElement(By.cssSelector("#app > div:nth-child(1) > div.verification-dialog.gradely-container.px-0.px-sm-3.px-md-4.px-xl-4.mx-auto > div.row.mx-auto.w-100 > div > div > div.content-area > div.resend-link.color-ash.text-center.smooth-transition > div.mgt-7.smooth-transition > span:nth-child(3)")); 

		
		  WebDriverWait wait = new WebDriverWait(driver, 150); 
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#app > div:nth-child(1) > div.verification-dialog.gradely-container.px-0.px-sm-3.px-md-4.px-xl-4.mx-auto > div.row.mx-auto.w-100 > div > div > div.content-area > div.resend-link.color-ash.text-center.smooth-transition > div.mgt-7.smooth-transition > span:nth-child(3)"))); 
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", element);
			System.out.println("Clicked the verify later button");
			
	 
	}
	 //AfterTest
	 public void TearDown() { 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close(); 
		 driver.quit();
	  //System.out.println("Test completed");
	 }	 
}
/*}
 * 
 * 
 * 
 * }
 * 
// * }
 */
package Tests;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSecondPieSize;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.StudentOnboardingPage;
import Pages.StudentSigninPageObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentOnboardingWithSchoolTest {

	// driver = new ChromeDriver();
	WebDriver driver = null;
	
	  @BeforeSuite
	  public void setUp() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
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
	   
	 
	
	@Test
	public void studentOnboardingWithInviteSchool() throws InterruptedException {
		//.manage().wait();
		StudentOnboardingPage pageObj = new StudentOnboardingPage(driver);
		pageObj.clickUseWithSchool();
//		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(Duration.ofSeconds(30L))
//			       .pollingEvery(Duration.ofSeconds(2L))
//			       .ignoring(NoSuchElementException.class);
//	
//			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       WebElement path = driver.findElement(By.tagName("a"));
//			       
//			       if (path.isEnabled()) {
//			    	   System.out.println("Element is enabled");
//			       }
//		    	   return path;
//
//			     }
//			   });
//			 element.click();
//
		System.out.println("Click to use with school");
		 pageObj.enterClassCode("SMABO-2/PRY4");
		pageObj.clickToInviteYourSchool();
		System.out.println("Clicked the invite school button");
		pageObj.EnterSchName("Smart Boys");
		System.out.println("School name entered");
		pageObj.enterSchoolContactName("latop+32@live.com");
		System.err.println("Cantact emeil entered");
		pageObj.entrContactPhone("34526782192");
		pageObj.selectContactRole();
		pageObj.ClickSendInvitationBtn();
		System.out.println("School invited");

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
 System.out.println("Test completed");
}
}
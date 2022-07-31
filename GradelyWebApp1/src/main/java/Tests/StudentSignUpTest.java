package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.PagesDocument;

import Pages.studentSignUppageObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentSignUpTest {

	static WebDriver driver = null;
	public static String browserName = null;
public static void main(String[] args) {
	TestSetUp();
	SignUp();
	
}
@BeforeTest
	public static void TestSetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	@Test
	public static void SignUp() {
		driver.get("https://basedev.gradely.co/auth/signup-student");
		studentSignUppageObj signUpPageObj = new studentSignUppageObj(driver);
		signUpPageObj.FullNameTextBox("Ade John");
		signUpPageObj.ClassSelectionBox();
		signUpPageObj.PhoneNumberTextBox("25671453982");
		signUpPageObj.EmailAddressTextBox("latop+24@live.com");
		signUpPageObj.PasswordTextBox("password");
		signUpPageObj.GetStartedButton();
			}
	

	}
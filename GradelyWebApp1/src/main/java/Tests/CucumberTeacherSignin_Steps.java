package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.StudentSigninPageObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberTeacherSignin_Steps {
	WebDriver driver = null;
	
	
	
	@Given("I navigate to the site")
	public void i_navigate_to_the_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser successfully setup");
		driver.get("https://basedev.gradely.co/auth/login");
		System.out.println("Navigate to the site");
   
	}

	@Given("I enterred the username")
	public void i_enterred_the_username() {
		StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);
		pageObj.EnterUserName("latop+15@live.com");
		System.out.println("User Name enter successfully");
	}

	@Given("I entered the password")
	public void i_entered_the_password() {
		StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);

		pageObj.EnterPassword("password");
		System.out.println("Password entered successfully");
	
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);
		pageObj.ClickLoginBtn();
		System.out.println("Login successfully");
		
	}

}

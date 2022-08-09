package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.StudentSigninPageObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Cucumber_Steps {
	
	static WebDriver driver =null;


	
	@Given("I have navigated to the site")
	public  void  i_have_navigated_to_the_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		System.out.println("Browser successfully setup");
		driver.get("https://basedev.gradely.co/auth/login");
		System.out.println("Navigate to the site");

	}

	@Given("I entered my username")
	public void i_entered_my_username() {
		 StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);

		pageObj.EnterUserName("latop+24@live.com");
		System.out.println("User Name enter successfully");
	}

	@When("I entered my password")
	public void i_entered_my_password() {
		 StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);

		pageObj.EnterPassword("password");
		System.out.println("Password entered successfully");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		 StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);

		pageObj.ClickLoginBtn();
		System.out.println("Login successfully");
		
	}

	@Then("I should be able to sign in")
	public void i_should_be_able_to_sign_in() {
		 StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);
		pageObj.CheckVerifyDialogueBox();
			}
	@Given("I have login in")
	public void i_have_login_in() {
		 StudentSigninPageObj pageObj = new StudentSigninPageObj(driver);
			pageObj.CheckVerifyDialogueBox();
				}

	@Given("I clicked the verify later button")
	public void i_clicked_the_verify_later_button() {
		 WebDriverWait wait = new WebDriverWait(driver, 150); 
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#app > div:nth-child(1) > div.verification-dialog.gradely-container.px-0.px-sm-3.px-md-4.px-xl-4.mx-auto > div.row.mx-auto.w-100 > div > div > div.content-area > div.resend-link.color-ash.text-center.smooth-transition > div.mgt-7.smooth-transition > span:nth-child(3)"))); 
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", element);
			System.out.println("Clicked the verify later button");
	}

	@When("I select to use with my school")
	public void i_select_to_use_with_my_school() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enetered the class code")
	public void i_enetered_the_class_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to join the class")
	public void i_should_be_able_to_join_the_class() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}



package Pages;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lombok.var;
import net.bytebuddy.implementation.bind.annotation.This;

public class studentSignUppageObj {
	static WebDriver driver = null;
	public studentSignUppageObj(WebDriver driver) {
		this.driver = driver;
	}
	
	//public static WebElement element = null;
		By FullName_Textbox = By.id("fullname");
		By Class_SelectionBox = By.cssSelector("#app > div > div.auth-block > div > div > div.col-10.col-sm-9.col-md-10.col-xl-9.student-signup-wrapper > form > div:nth-child(2) > select");
		By PhoneNumber_Textbox = By.id("phone_number");
		By EmailAddress_TextBox = By.id("email");
		By Password_TextBox = By.id("password");
		By GetStarted_Botton = By.cssSelector("#app > div > div.auth-block > div > div > div.col-10.col-sm-9.col-md-10.col-xl-9.student-signup-wrapper > form > div:nth-child(6) > button");
		
		
		public void FullNameTextBox(String firstNamelastName) {
	driver.findElement(FullName_Textbox).sendKeys(firstNamelastName);	 
	 
	 }
	 	public void ClassSelectionBox() {
	 	WebElement element = driver.findElement(Class_SelectionBox);
	 	element.sendKeys(Keys.ARROW_DOWN);
	 	
	 		 	}
	 	public void PhoneNumberTextBox(String phoneNumber ) {
		 	driver.findElement(PhoneNumber_Textbox).sendKeys(phoneNumber);
	 		
	 	}
	 	public void EmailAddressTextBox(String emailAddress) {
	 	driver.findElement(EmailAddress_TextBox).sendKeys(emailAddress);	
	 	}
	 	public void PasswordTextBox(String password) {
	 		
	 		driver.findElement(Password_TextBox).sendKeys(password);
	 	}
	 	public void GetStartedButton() {
	 		WebElement element =driver.findElement(GetStarted_Botton);
	 		JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",element );
	 		}
	 	
			/*
			 * public static WebElement LogInNowLink(WebDriver driver) { element =
			 * driver.findElement(By.
			 * cssSelector("#app > div > div.auth-block > div > div > div.col-10.col-sm-9.col-md-10.col-xl-9.student-signup-wrapper > form > div:nth-child(6) > div:nth-child(1) > a"
			 * )){ return element; } public static WebElement TermsLinktext(WebDriver
			 * driver) {
			 * 
			 * element = driver.findElement(By.
			 * cssSelector("#app > div > div.auth-block > div > div > div.col-10.col-sm-9.col-md-10.col-xl-9.student-signup-wrapper > form > div:nth-child(6) > div:nth-child(3) > a:nth-child(1)"
			 * )); return element;
			 * 
			 * } public static WebElement PrivacyLinkButton(WebDriver driver) { element =
			 * driver.findElement(By.
			 * cssSelector("<a data-v-1d2ad251=\"\" href=\"https://gradely.co/privacy-policy\" target=\"_blank\" class=\"btn-link\" xpath=\"1\">Privacy Policies</a>"
			 * )); return element; }
			 */
}


	
	
	
	

	

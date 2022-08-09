package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentSigninPageObj {
	public static WebDriver driver;
	
	public StudentSigninPageObj(WebDriver driver) {
		this.driver = driver;
	//public static WebDriver getDriver() {
		//return driver;
	}
	By UserName_TextBox = By.cssSelector("#userinfo");
	By Password_TextBox = By.id("password");
	By Login_Button = By.cssSelector("#app > div > div > div.container.auth-wrapper > div.col-10.col-sm-9.col-md-6.col-lg-5.col-xl-4.form-wrapper > div.form-area > form > button");
	By ResetPassword_Link = By.cssSelector("#app > div > div > div.container.auth-wrapper > div.col-10.col-sm-9.col-md-6.col-lg-5.col-xl-4.form-wrapper > div.form-area > form > div:nth-child(3) > a");
	By SignUp_Link = By.cssSelector("#app > div > div > div.container.auth-wrapper > div.col-10.col-sm-9.col-md-6.col-lg-5.col-xl-4.form-wrapper > div.form-area > form > div:nth-child(3) > a");
	By VerifyLater_link = By.cssSelector("#app > div:nth-child(1) > div.verification-dialog.gradely-container.px-0.px-sm-3.px-md-4.px-xl-4.mx-auto > div.row.mx-auto.w-100 > div > div > div.content-area > div.resend-link.color-ash.text-center.smooth-transition > div.mgt-7.smooth-transition > span:nth-child(3)");
	By Verify_DialogueBox = By.cssSelector("#app > div:nth-child(1) > div.verification-dialog.gradely-container.px-0.px-sm-3.px-md-4.px-xl-4.mx-auto > div.row.mx-auto.w-100 > div > div > div.content-area");

public void EnterUserName(String text) {
	driver.findElement(UserName_TextBox).sendKeys(text);
	
}
public void EnterPassword(String password) {
	driver.findElement(Password_TextBox).sendKeys(password);
}
	public void ClickLoginBtn() {
		driver.findElement(Login_Button).click();
	}
	public void ClickPassworWordRest() {
		driver.findElement(ResetPassword_Link).click();
	}
	public void ClickSignUpLink() {
		driver.findElement(SignUp_Link).click();
	}
	public void ClickVerifyLater() {
		driver.findElement(VerifyLater_link);
	}
	public void CheckVerifyDialogueBox() {
		driver.findElement(Verify_DialogueBox).isDisplayed();
	}
}
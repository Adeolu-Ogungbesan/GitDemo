package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Tests.SigninPageTest;

public class StudentOnboardingPage {
	   
	
	/*public StudentOnboardingPage(WebDriver driver) {
		super();
	*/	// TODO Auto-generated constructor stub
	//}
	public WebDriver driver;

	public StudentOnboardingPage(WebDriver driver) {
		this.driver = driver;
	}
	
By UseWithoutSchool_button = By.cssSelector("#app > div:nth-child(1) > div > div.row.mx-auto.w-100 > div > div > div.content-area > div.btn-section.mgt-30 > a:nth-child(2)");
By UseWithSchool_button = By.cssSelector("#app > div:nth-child(1) > div > div.row.mx-auto.w-100 > div > div > div.content-area > div.btn-section.mgt-30 > a.btn.mgb-24{}");
By EnterClassCode_TextBox = By.id("userinfo");
By InviteYourSch_btn = By.cssSelector("#app > div.connect-school > div > div > div.col-12.col-sm-10.col-md-7.onboarding-wrapper.mx-auto > div > div > div.onboarding-form-wrapper.mgt-50.mx-auto > div.info-text.color-ash.text-center > a > span");
By EnterSchName_TxtBox = By.id("schoolName");
By EnterContactEmail_TxtBox = By.id("contactPerson");
By contactPhone_txtBox = By.id("contactEmail");
By RoleOfContact_drpBox = By.id("contactRole");
By sendInvitation_btn = By.cssSelector("#app > div.invite-school > div > div > div.col-12.col-sm-10.col-md-7.onboarding-wrapper.mx-auto > div > div > div.onboarding-form-wrapper.mgt-45.mx-auto");
public By clickUseWithoutSchool() {
	driver.findElement(UseWithoutSchool_button).click();
	return UseWithoutSchool_button;
}
public void clickUseWithSchool() {
	driver.findElement(UseWithSchool_button).click();
}
public void enterClassCode(String classCode) {
	driver.findElement(EnterClassCode_TextBox).sendKeys(classCode);
}
public void clickToInviteYourSchool() {
	driver.findElement(InviteYourSch_btn).click();
}
public void EnterSchName(String schoolName) {
	driver.findElement(EnterSchName_TxtBox).sendKeys(schoolName);
	
}
public void enterSchoolContactName(String contactEmail) {
	driver.findElement(EnterContactEmail_TxtBox).sendKeys(contactEmail);
	
}
public void entrContactPhone(String contactPhone) {
	driver.findElement(contactPhone_txtBox).sendKeys(contactPhone);

	
}
public void selectContactRole() {
	
	WebElement element =driver.findElement(RoleOfContact_drpBox);
	Select select = new Select(element);
	select.selectByIndex(1);
}
public void ClickSendInvitationBtn() {
	driver.findElement(sendInvitation_btn).click();
}
}
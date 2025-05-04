package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInOrCreateAccountPage {

	WebDriver driver;
	
	public SignInOrCreateAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email_login")
	WebElement input_email_ele;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_continute_ele;
	
	@FindBy(id="ap_password")
	WebElement input_password_ele;
	
	@FindBy(id="signInSubmit")
	WebElement btn_signIn;
	
    public void enterEmailAddress(String email) {
    	input_email_ele.sendKeys(email);
    }
    
    public void clickBtnContinue() {
    	btn_continute_ele.click();
    }
    
    public void enterPassword(String password) {
    	input_password_ele.sendKeys(password);
    }
    
    public void clickBtnSignIn() {
    	btn_signIn.click();
    }
}

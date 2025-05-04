package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	Actions ac;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		ac=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(partialLinkText="Account & Lists")
	WebElement link_account_lists;
	
	@FindBy(linkText="Sign in")
	WebElement link_signIn;
	
	public void moveToLinkAccountLists() {
		ac.moveToElement(link_account_lists).perform();
	}
	public void clickSignIn() {
		link_signIn.click();
		}

}

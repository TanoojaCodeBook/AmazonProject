package com.infy.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.SignInOrCreateAccountPage;

public class Testcase_001_LoginTest extends TestBase {
   
	
	LandingPage landingPage;
	SignInOrCreateAccountPage singInOrCreatePage;
	
	@Test(priority=1)
	public void loginWithValidCredentials() {
		landingPage=new LandingPage(driver);
		singInOrCreatePage =new SignInOrCreateAccountPage(driver);
		landingPage.moveToLinkAccountLists();
		landingPage.clickSignIn();
		singInOrCreatePage.enterEmailAddress("tanoojatanooja8384@gmail.com");
		singInOrCreatePage.clickBtnContinue();
		singInOrCreatePage.enterPassword("Tanunicky@789");
		singInOrCreatePage.clickBtnSignIn();
		wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	    sa.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","LoginFailed");
	}
	
	
	
}

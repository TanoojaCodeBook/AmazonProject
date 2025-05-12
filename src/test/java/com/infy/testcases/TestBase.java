package com.infy.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestBase {
  
	public WebDriver driver;
	WebDriverWait wait;
	SoftAssert sa;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		System.out.println("tanu");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		sa=new SoftAssert();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
}

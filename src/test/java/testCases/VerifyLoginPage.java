package testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyLoginPage {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
        driver = BrowserFactory.getBrowser("Firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void testHomePage(){
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Avactis Demo Store"));
	
@FindBy (xpath="//a[text()='Dashboard']//following::div[2]")

}
public void verifyDashboardTitle(){
	WebDriverWait wait = new webDriverWait(driver,20);
	webElement ele = wait.until(ExpectedConditions.visibilityOf(dashboardtitle));
	String text = ele.getText();
	Assert.assertArrayEquals(text, "Account Dashboard View", "Dashboard title no verified properly.");
}

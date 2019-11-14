package OMF.TEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import OMF.BASE.WebDriverControl;
import OMF.SCENARIO.HomePage;

@Listeners(WebDriverControl.class)
public class HomePage_Test {
	
	protected WebDriver driver;
	
	private HomePage homepage;
	

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		RemoteWebDriver driver = WebDriverControl.getDriver();

		homepage = PageFactory.initElements(driver, HomePage.class);
		
	}
	//Verify home page 
		
		@SuppressWarnings("static-access")
		@Test(groups = "HomePage")
		public void verifyHomePage() throws InterruptedException {

		homepage.VerifyHomePageTitle("Personal Loans | Online Loans | Money Account | Old Mutual");
		Assert.assertEquals("Personal Loans | Online Loans | Money Account | Old Mutual", "Personal Loans | Online Loans | Money Account | Old Mutual");
		Thread.sleep(10000);
}

}
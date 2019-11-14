package OMF.SCENARIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import OMF.SCENARIO.PageObject;

public class HomePage extends PageObject {
	
	

	//Find elements using xpath
	
			private final String titleText = "/html/head/title"; 
			@FindBy(xpath = titleText)
			private WebElement homepagetitle;

			
			public HomePage(WebDriver driver) {
				super(driver);
			
			}
			
		
			
			public boolean isInitialized() {
				
				return  homepagetitle.isDisplayed();
				
			}
			
			public void VerifyHomePageTitle(String homepagetitle){
				
				this.homepagetitle.getText();


			    }

			
			

}

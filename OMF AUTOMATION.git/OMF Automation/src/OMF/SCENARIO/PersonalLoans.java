package OMF.SCENARIO;

import java.io.File;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalLoans extends PageObject{

	//Find elements using xpath
	
	private final String personalloanlinkpath = "//*[@id='navbar']/ul/li[2]/a"; 
	@FindBy(xpath = personalloanlinkpath)
	private WebElement personalloan;
	
	private final String titleText = "/html/head/title"; 
	@FindBy(xpath = titleText)
	private WebElement personalpagetitle;
	
	private final String fiftythousandbtnxpath = "//*[@id='calcAmountHold']/div/div[5]"; 
	@FindBy(xpath = fiftythousandbtnxpath)
	private WebElement fiftythousandbtn;
	
	private final String eightyfourmnthbtnxpath = "//*[@id='calcTermHold']/div/div[9]"; 
	@FindBy(xpath = eightyfourmnthbtnxpath)
	private WebElement eightyfourmnthbtn;
	
	private final String payminamountxpath = "paymin"; 
	@FindBy(id = payminamountxpath)
	private WebElement payminamount;
	
	private final String paymaxamountxpath = "paymax"; 
	@FindBy(id = paymaxamountxpath)
	private WebElement paymaxamount;
	
	private final String viewbreakdownxpath = "//*[@id='calcTotalsHold']/p[2]/a"; 
	@FindBy(xpath = viewbreakdownxpath)
	private WebElement viewbreakdown;
	
	private final String breakdownCapitalxpath = "//*[@id='breakdownCapital']"; // R50,000.00
	@FindBy(xpath = breakdownCapitalxpath)
	private WebElement breakdownCapital;
	
	private final String breakdownTermxpath = "//*[@id='breakdownTerm']"; //84 months
	@FindBy(xpath = breakdownTermxpath)
	private WebElement breakdownTerm;
	
	public PersonalLoans(WebDriver driver) {
		super(driver);

	}
	
	public boolean isInitialized() {
		
		return  personalpagetitle.isDisplayed();
		
	}
	
	public void ClickPersonalLoanLink(){


		this.personalloan.click();
			
			
			
		}
	
public void VerifyPersonalLoanPageTitle(String personalpagetitle){
		
		this.personalpagetitle.getText();


	    }
	
	public void CalculatorClickfiftythousandbtn(){
	
	this.fiftythousandbtn.click();
		
	}
	
	public void CalculatorClickeightyfourmnthbtn(){
		
		this.eightyfourmnthbtn.click();
			
		}
	
public void VerifyMinAmount(String payminamount){
		
		this.payminamount.getText();


	    }
	
public void VerifyMaxAmount(String paymaxamount){
		
		this.paymaxamount.getText();

	    }

public void Clickviewbreakdown(){
		
		this.viewbreakdown.click();
	
		}

public void VerifyBreakDownCapital(String breakdownCapital){
	
	this.breakdownCapital.getText();


    }

public void VerifyBreakDownTerm(String breakdownTerm){
	
	this.breakdownTerm.getText();


}

public void getCapitalscreenshot() throws Exception{
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scrFile, new File("D:\\Capital.png"));
	
	
}

public void getTermscreenshot() throws Exception{
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scrFile, new File("D:\\Term.png"));
	
	
}


}

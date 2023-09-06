package PageObjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import basepackage.TestAction;


@SuppressWarnings("unused")
public class RunNightJobsPageObjects extends TestAction{
	WebDriver  driver;
	public RunNightJobsPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	           } 
	
	@FindBy(xpath="//*[text()='Run Job']")
    public WebElement RunJob; 
	
	@FindBy(xpath="//*[text()='Import Person Data']")
	public WebElement selectimportpersondata;
	
	@FindBy(xpath="(//div[text()='Process Import Data'])[2]")
	public WebElement selectprocessimportdata;
	
	String JobName="//div[@title='Process Import Data']";
	
	//@FindBy(xpath="//*[text()='Teams']")
	// public WebElement Teams;
	
	@FindBy(xpath="//div[text()='Job Ran Successfully']")
	public WebElement importpersondata;
	
	@FindBy(xpath="//div[text()='Process import run successfully']")
	public WebElement processimportdata;
	
	
	public void clickOnimportpersondata() throws InterruptedException {
		this.click(RunJob);
		}
	
	public void clickOnprocessimportndata() throws InterruptedException {
		this.click(selectimportpersondata);
		this.click(selectprocessimportdata);
		Thread.sleep(2000);
		this.click(RunJob);
		}
		
	public String isImportPersonSuccessfullyMessageDisplayed() {
		String ImportPersonSuccessfullyMessage=importpersondata.getText();
		return ImportPersonSuccessfullyMessage;
		
	}
		
	
	public String isProcessImportSuccessfullyMessageDisplayed() {
		String ProcessImportSuccessfullyMessage=processimportdata.getText();
		return ProcessImportSuccessfullyMessage;
		
	}
	/*public void selectjob(String txtJobName) {
		try {
			this.click(selectimportpersondata);
			this.clickOnDynamicElement(JobName, txtJobName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnprocessimportdata() {
		this.click(RunJob);
		
	}*/
	
}
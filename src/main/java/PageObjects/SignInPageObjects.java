package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import basepackage.TestAction;
import Utilities.Constants;

public class SignInPageObjects extends TestAction{

	WebDriver driver;
	SignInPageObjects signinpage;
	Logger log = Logger.getLogger(SignInPageObjects.class);

	public SignInPageObjects(WebDriver driver) {
		super(driver);
		this.driver=driver;

		PageFactory.initElements(driver, this);
        
            }
	
	@FindBy(xpath="//button[@type=\"submit\"]")
    public WebElement click_signin;
	
    @FindBy(xpath="//input[@id=\"email\"]")
    public WebElement adminEmail; 
    
    @FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement Sign;
    
    @FindBy(xpath="//input[@id=\"idSIButton9\"]")
	public WebElement click_SignIn;
    
    @FindBy(xpath="//input[@id=\"i0118\"]")
    public WebElement adminPassword;
    
    @FindBy(xpath="//input[@id=\"idSIButton9\"]")
	public WebElement SignIn;
    
    @FindBy(xpath="//input[@id=\"idSIButton9\"]")
	public WebElement Yes;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[2]/main/h2")
	public WebElement Run;
    
    
    public void enterAdminEmail(String adiminemailid) throws InterruptedException {
    this.click(click_signin);
    Thread.sleep(4000);
    this.sendkeys(adminEmail,adiminemailid);	
	        }
    
    public void clickOnSign() {
	this.click(Sign);
            }
    
	public void enterAdminPassword(String adminpassword) throws InterruptedException {
	this.click(click_SignIn);
	Thread.sleep(4000);
	this.sendkeys(adminPassword,adminpassword);
            }
	
	public void clickOnSignIn() {
	this.click(SignIn);
	        }	
	
	public void clickOnYes() {
	this.click(Yes);
            }
	
	public String isRunNightJobsDisplayed( ) {
	String RunNightJobs= Run.getText();
	    	return RunNightJobs;
		    }
	
	public void adminsign() throws InterruptedException {
	navigateUrl(Constants.URL) ; 
	enterAdminEmail(Constants.adminEmail); 
	clickOnSign();
	enterAdminPassword(Constants.adminPassword); 
	clickOnSignIn(); 	 
	clickOnYes();
	//Thread.sleep(5000);
		    }
	    
}
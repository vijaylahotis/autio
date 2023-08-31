package PageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;
import org.openqa.selenium.interactions.Actions;


import basepackage.TestAction;
import Utilities.AzureInputs;
import Utilities.Inputs;
import org.testng.annotations.DataProvider;


@SuppressWarnings("unused")
public class AzureSignIn extends TestAction{

	WebDriver driver;
	AzureSignIn Azuresignin;
	Logger log = Logger.getLogger(SignInPageObjects.class);

	public AzureSignIn(WebDriver driver) {
		super(driver);
		this.driver=driver;

		PageFactory.initElements(driver, this);
        
            }
	
	@FindBy(xpath="//div[text()='Use another account']")
    public WebElement click_anotheraccount;
	
    @FindBy(xpath="//input[@id=\"i0116\"]")
    public WebElement enterEmail; 
    
    @FindBy(xpath="//input[@id=\"idSIButton9\"]")
	public WebElement clicknext;
    
    @FindBy(xpath="//input[@id=\"i0118\"]")
	public WebElement enterPassword;
    
    @FindBy(xpath="//input[@id=\"idSIButton9\"]")
	public WebElement SignIn;
    
    @FindBy(xpath="//input[@id=\"idSIButton9\"]")
	public WebElement Yes;
    
    @FindBy(xpath="//div[@title=\"View\"]")
	public WebElement clickView;
    
    @FindBy(xpath="//div[text()='Users']")
   	public WebElement clickUsers;
    
    @FindBy(xpath="//button[@title=\"Hide the menu for Users\"]")
   	public WebElement clickhide;
       
    @FindBy(xpath="//button[@data-testid=\"newUser\"]")
   	public WebElement clickNewuser;
       
    @FindBy(xpath="//button[@data-testid=\"createNewUser\"]")
   	public WebElement clickcreateuser;
    
    @FindBy(xpath="//input[@data-testid='upnLocalInputBox']")
	public WebElement enterpname;
    
    @FindBy(xpath="//input[@id='displayName-editComponent44']")
   	public WebElement enterdname;
       
    @FindBy(xpath="//span[text()='Next: Properties']")
   	public WebElement clickNext1;
    
    @FindBy(xpath="//input[@id='givenName-editComponent78']")
   	public WebElement enterfirstname;
    
    @FindBy(xpath="//input[@id='surname-editComponent85']")
   	public WebElement enterlastname;
       
    @FindBy(xpath="//input[@id='employeeType-editComponent128']")
   	public WebElement enteremployeetype;
    
    @FindBy(xpath="//div[@id='employeeHireDate-editComponent135-label']")
   	public WebElement clickhiredate;
    
    @FindBy(xpath="(//span[text()='28'])[2]")
   	public WebElement selecthiredate;
    
    @FindBy(xpath="//span[text()='Add manager']")
   	public WebElement clickmanager;
       
    @FindBy(xpath="//input[@id='SearchBox4']")
    public WebElement entersearch;
    
    @FindBy(xpath="//div[text()='Mahesh']")
    public WebElement clickcheckbox;
          
    @FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[1]")
    public WebElement clickcheckbox1;
          
    @FindBy(xpath="//span[text()='Select']")
    public WebElement clickselect;
    
    @FindBy(xpath="(//span[text()='Review + create'])[2]")
   	public WebElement clickreview;
       
    @FindBy(xpath="//span[text()='Create']")
    public WebElement clickcreate;
    
    @FindBy(xpath="//button[@class=\"fxs-dropmenu-button fxs-popup-button fxs-menu-account\"]")
    public WebElement click_logout;
    
    @FindBy(xpath="//a[text()='Sign out']")
    public WebElement click_signout;
    
    @FindBy(xpath="//input[@id='SearchBox4']")
    public WebElement click_searchbox;
    
    @FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[2]")
    public WebElement click_check;
    
    @FindBy(xpath="//span[text()='Delete']")
    public WebElement click_delete;
    
    @FindBy(xpath="//span[text()='OK']")
    public WebElement click_ok;
          
    public void enterAzureEmail(String azureemailid) throws InterruptedException {
    	this.click(click_anotheraccount);
        this.sendkeys(enterEmail,azureemailid);	
    	        }
        
        public void clickOnnext() {
    	this.click(clicknext);
                }
        
    	public void enterAzurePassword(String azurepassword) throws InterruptedException {
    	this.sendkeys(enterPassword,azurepassword);
                }
    	
    	public void clickOnSignIn() {
    	this.click(SignIn);
    	        }	
    	
    	public void clickOnYes() {
    	this.click(Yes);
                }
    	
    	public void azuresign() throws InterruptedException {
    		navigateUrl(AzureInputs.AzureURL); 
    		enterAzureEmail(AzureInputs.AzureEmail); 
    		clickOnnext();
    		enterAzurePassword(AzureInputs.AzurePassword); 
    		clickOnSignIn(); 	 
    		//clickOnYes();
    	}
    	
    	public void azuresign1() throws InterruptedException {
    		navigateUrl(AzureInputs.AzureURL); 
    		enterAzureEmail(AzureInputs.AzureEmail); 
    		clickOnnext();
    		enterAzurePassword(AzureInputs.AzurePassword); 
    		clickOnSignIn(); 	 
    	//	clickOnYes();
    	}

    	
    	public void createuser() throws InterruptedException {
        	this.click(clickView);
        	Thread.sleep(4000);
        	this.click(clickUsers);
        	Thread.sleep(4000);
        	driver.switchTo().frame("_react_frame_2");
        	Actions actions = new Actions(driver);
        	actions.moveToElement(clickNewuser).click().perform();
        	Thread.sleep(3000);
        	this.click(clickcreateuser);    	
        	}
    	
    	public void enterpname() throws InterruptedException {
        	driver.switchTo().defaultContent();
    		driver.switchTo().frame("_react_frame_3");
    		String randompname = generateRandomprimaryname(3); // Specify the desired length
    		enterpname.sendKeys(randompname);
    	}
    	
    	public void enterdname() throws InterruptedException {
    		String randomdname = generateRandomdisplayname(3); // Specify the desired length
    		enterdname.sendKeys(randomdname);
    		this.click(clickNext1);
    	}
    	
    	public String enterfirstname() throws InterruptedException {
    		String randomfname = generateRandomfirstname(3); // Specify the desired length
    		enterfirstname.sendKeys(randomfname);
			return randomfname;
			
			
    	}
    	
    	public void enterlastname() throws InterruptedException {
    		String randomlname = generateRandomlastname(3); // Specify the desired length
    		enterlastname.sendKeys(randomlname);
    	}
    	
    	public void enterdetails(String EmployeeType) {
    			
        		this.sendkeys(enteremployeetype, EmployeeType);
        		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickhiredate);
        		this.click(clickhiredate);
        		this.click(selecthiredate);
    	}
    	
    	public void clickmanager() throws InterruptedException {
    		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickmanager);	
    		this.click(clickmanager);
    	}
    	
    	public void enterotherdetails(String Search) throws InterruptedException {
    		    driver.switchTo().defaultContent();
    		    driver.switchTo().frame("_react_frame_5");
        		this.sendkeys(entersearch, Search);
        		this.click(clickcheckbox1);
        		this.click(clickselect);
        		driver.switchTo().defaultContent();
        		driver.switchTo().frame("_react_frame_3");
        		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickreview);
        		this.click(clickreview);
        		this.click(clickcreate);
    	}
        	//	driver.switchTo().defaultContent();
        	//	driver.switchTo().frame("_react_frame_2");
        	//	this.click(click_logout);
        	//	this.click(click_signout);
        		
        		
        		public void createuser1(String firstname) throws InterruptedException {
                	this.click(clickView);
                	Thread.sleep(4000);
                	this.click(clickUsers);
                	Thread.sleep(4000);
                	driver.switchTo().frame("_react_frame_2");
                	this.sendkeys(click_searchbox, firstname);
                	this.click(click_check);
                	this.click(click_delete);
                	this.click(click_ok);
                	}
        		}
    	
    
    
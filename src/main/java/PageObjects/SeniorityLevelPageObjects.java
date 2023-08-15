package PageObjects;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import basepackage.TestAction;

@SuppressWarnings("unused")
public class SeniorityLevelPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(SeniorityLevelPageObjects.class);
	public SeniorityLevelPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[3]/div")
    public WebElement RateCards; 
	
	@FindBy(xpath="//*[text()='Seniority Level']")
	public WebElement clickseniority;
    
    @FindBy(xpath="//*[text()='Create Seniority Level']")
	public WebElement Createseniority;
    
    @FindBy(xpath="//input[@id=\"nest-messages_name\"]")
	public WebElement Name;
    
    @FindBy(xpath="//*[@id=\"nest-messages\"]/div[2]/div/div[2]/div/div/div")
    public WebElement Exp;
    
   // @FindBy(xpath="//div[@title='15']")
    //public WebElement Exp1;
 
     String Experience="//div[@title='#']";
    
    @FindBy(xpath="//*[text()='Submit']")
	public WebElement clicksubmit;
    
    public void enterseniorityname(String SeniorityName) throws InterruptedException {
    	this.click(RateCards);
    	this.click(clickseniority);
    	this.click(Createseniority);
    	this.click(Name);
    	this.sendkeys(Name, SeniorityName);
    	
            }
    
    public void selectexpereince(String txtExperience) {
		try {
			this.click(Exp);
			//Actions actions = new Actions(driver);
	        //actions.moveToElement(Exp1).click().build().perform();
		   this.clickOnDynamicElement(Experience, txtExperience);
		   this.click(clicksubmit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

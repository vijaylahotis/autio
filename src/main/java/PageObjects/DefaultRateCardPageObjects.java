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
public class DefaultRateCardPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(DefaultRateCardPageObjects.class);
	public DefaultRateCardPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[3]/div")
    public WebElement RateCards; 
	
	@FindBy(xpath="//*[text()=' Default Rate Card']")
	public WebElement clickdefaultratecard;
    
    @FindBy(xpath="//*[text()='Create Rate card']")
	public WebElement Createratecard;
    
    @FindBy(xpath="//*[@id=\"nest-messages\"]/div[1]/div/div[2]/div/div/div")
	public WebElement location;
    
    String Location="//div[@title='#']";
    
    @FindBy(xpath="//*[@id=\"nest-messages\"]/div[2]/div/div[2]/div/div/div")
	public WebElement seniority;
    
    String Seniority="//div[@title='#']";
    
    @FindBy(xpath="//*[@id=\"nest-messages\"]/div[3]/div/div[2]/div/div/div")
	public WebElement role;
    
    String Role="//div[@title='#']";
    
    @FindBy(xpath="//input[@id='nest-messages_rate']")
	public WebElement rate;
    
    @FindBy(xpath="//*[text()='Submit']")
	public WebElement clicksubmit;
    
    public void clickdetails() throws InterruptedException {
    	this.click(RateCards);
    	this.click(clickdefaultratecard);
    	this.click(Createratecard);
    }
    
    public void selectlocation(String txtLocation) {
		try {
			this.click(location);
		    this.clickOnDynamicElement(Location, txtLocation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void selectseniority(String txtSeniority) {
		try {
			this.click(seniority);
		    this.clickOnDynamicElement(Seniority, txtSeniority);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void selectrole(String txtRole) {
		try {
			this.click(role);
		    this.clickOnDynamicElement(Role, txtRole);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void enterrate(String Rate) throws InterruptedException {
    	this.click(rate);
    	this.sendkeys(rate, Rate);
    	this.click(clicksubmit);
    	
            }
}

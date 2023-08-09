package PageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import basepackage.TestAction;

@SuppressWarnings("unused")
public class LocationPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(LocationPageObjects.class);
	public LocationPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[3]/div")
    public WebElement RateCards; 
	
	@FindBy(xpath="//*[text()='Locations']")
	public WebElement clicklocation;
	
	@FindBy(xpath="//*[text()='Create Location']")
	public WebElement createlocation;
	
	@FindBy(xpath="//input[@id=\"nest-messages_location\"]")
	public WebElement enterlocation;
	
	@FindBy(xpath="//textarea[@id=\"nest-messages_description\"]")
	public WebElement enterdescription;
	
	@FindBy(xpath="//*[text()='Submit']")
	public WebElement clicksubmit;
	
	public void clickenterDetails(String LocationName, String DescriptionName) throws InterruptedException {
		this.click(RateCards);
		this.click(clicklocation);
		this.click(createlocation);
		this.sendkeys(enterlocation, LocationName);
	    this.sendkeys(enterdescription, DescriptionName);
	    this.click(clicksubmit);
		}
}
	
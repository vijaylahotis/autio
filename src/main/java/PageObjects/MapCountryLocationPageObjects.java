package PageObjects;

import java.time.Duration;
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
public class MapCountryLocationPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(MapCountryLocationPageObjects.class);
	public MapCountryLocationPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[3]/div")
    public WebElement RateCards; 
	
	@FindBy(xpath="//*[text()='Map Country Location']")
	public WebElement clickmapcountrylocation;
	
	@FindBy(xpath="//button[@class=\"ant-btn css-fpg3f5 ant-btn-primary\"]")
	public WebElement createmapcountrylocation;
	
	@FindBy(xpath="//ul[@role='listbox']/li")
	List<WebElement> dropdownList;
    
	@FindBy(xpath="//input[@id=\"nest-messages_country\"]")
	public WebElement clickcountry;
    
 
    String CountryName="//div[text()='#']";
    
    @FindBy(xpath="//input[@id=\"nest-messages_location\"]")
	public WebElement clicklocation;
    
 
    String LocationName="//div[text()='#']";
    
    @FindBy(xpath="//*[text()='Submit']")
    public WebElement clicksubmit;
    
    
    public void clickOnmapcountrylocation() {
    	this.click(RateCards);
    	this.click(clickmapcountrylocation);
    	this.click(createmapcountrylocation);
            }
    
    public void selectCountry(String txtCountryName) {
		try {
			this.click(clickcountry);
			this.sendkeys(clickcountry, txtCountryName);
			this.clickOnDynamicElement(CountryName, txtCountryName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectLocation(String txtLocationName) {
		try {
			this.click(clicklocation);
			this.clickOnDynamicElement(LocationName, txtLocationName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnsubmit() {
    	this.click(clicksubmit);
            }
}
    
    

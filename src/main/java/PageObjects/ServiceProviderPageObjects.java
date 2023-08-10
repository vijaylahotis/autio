package PageObjects;

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
public class ServiceProviderPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(ServiceProviderPageObjects.class);
	public ServiceProviderPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[text()='Service Provider']")
    public WebElement clickcerviceprovider; 
	
	@FindBy(xpath="//*[text()='Create Service Provider']")
	public WebElement createserviceprovider;
    
    @FindBy(xpath="//input[@id='nest-messages_name']")
	public WebElement enterName;
    
    @FindBy(xpath="//input[@id='nest-messages_url']")
	public WebElement enterUrl;
    
    @FindBy(xpath="//textarea[@id='nest-messages_description']")
	public WebElement enterDescription;
    
    @FindBy(xpath="//button[@type='submit']")
    public WebElement clickSubmit;
    
    public void clickenterdetails(String SPName, String URL, String SPDescription) throws InterruptedException {
		this.click(clickcerviceprovider);
		this.click(createserviceprovider);
		this.sendkeys(enterName, SPName);
		Thread.sleep(2000);
		this.sendkeys(enterUrl, URL);
		Thread.sleep(2000);
		this.sendkeys(enterDescription, SPDescription);
		Thread.sleep(2000);
	    this.click(clickSubmit);

		}
}

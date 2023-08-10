package PageObjects;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import basepackage.TestAction;

@SuppressWarnings("unused")
public class ActionDescriptionPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(ActionDescriptionPageObjects.class);
	public ActionDescriptionPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[text()='Action Description']")
    public WebElement clickActiondescription; 
	
	@FindBy(xpath="//*[text()='Create Action Description']")
	public WebElement createActiondescription;
	
	@FindBy(xpath="//*[@id=\"formCreateRecord\"]/div[1]/div/div[2]/div/div/div")
	public WebElement selectcategory;
	 
	String Category="//div[@title='#']";
	
	@FindBy(xpath="//span[@title='Last Update Date']")
	public WebElement selectdate;
	 
	String Date="//div[@title='#']";
	
	@FindBy(xpath="//input[@id=\"formCreateRecord_overdue_notice\"]")
	public WebElement enteroverdue;
	
	@FindBy(xpath="//textarea[@id=\"formCreateRecord_description\"]")
	public WebElement enterdescription;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
    public WebElement clicksubmit;
	
	public void clickactiondetails() throws InterruptedException {
    	this.click(clickActiondescription);
    	this.click(createActiondescription);
	}
	
	public void selectcategory(String txtCategory) {
		try {
			this.click(selectcategory);
		    this.clickOnDynamicElement(Category, txtCategory);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectdate(String txtDate) {
		try {
			this.click(selectdate);
		    this.clickOnDynamicElement(Date, txtDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enteroverdue(String Overdue, String Description) throws InterruptedException {
		Thread.sleep(2000);
		this.waitForEle(enteroverdue);
	    Actions action = new Actions(driver);
		action.moveToElement(enteroverdue).click().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.DELETE).perform();
		Thread.sleep(2000);
		this.sendkeys(enteroverdue, Overdue);
		Thread.sleep(2000);
		this.sendkeys(enterdescription, Description);
		this.click(clicksubmit);
		Thread.sleep(2000);
	}
}
	
	
	
	
	
	

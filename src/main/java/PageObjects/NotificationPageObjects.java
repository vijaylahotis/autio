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
public class NotificationPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(NotificationPageObjects.class);
	public NotificationPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[text()='Notification']")
    public WebElement clickNotification; 
	
	@FindBy(xpath="//span[@class=\"anticon anticon-edit\"]")
	public WebElement editnotification;
    
    @FindBy(xpath="//input[@id=\"nest-messages_reminder_notice_lead_time\"]")
	public WebElement enterremindertime;
    
    @FindBy(xpath="//input[@id=\"nest-messages_escalation_notice_lead_time\"]")
	public WebElement enteescalationtime;
    
    @FindBy(xpath="//input[@id=\"nest-messages_reminder_escalation_frequency\"]")
	public WebElement enterfrequency;
    
    @FindBy(xpath="//*[text()='Update']")
    public WebElement clickupdate;
    
    public void Notificationenterdetails(String Reminder, String Escalation, String Frequency) throws InterruptedException {
		this.click(clickNotification);
		this.click(editnotification);
		this.sendkeys(enterremindertime, Reminder);
		Thread.sleep(2000);
		this.sendkeys(enteescalationtime, Escalation);
		Thread.sleep(2000);
		this.sendkeys(enterfrequency, Frequency);
		Thread.sleep(2000);
	    this.click(clickupdate);

		}
}

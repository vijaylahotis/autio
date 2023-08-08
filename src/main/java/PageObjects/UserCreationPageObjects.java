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
public class UserCreationPageObjects extends TestAction {
	WebDriver  driver;
	Logger log = Logger.getLogger(UserCreationPageObjects.class);
	public UserCreationPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	         } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[2]")
    public WebElement Users; 
	
	@FindBy(xpath="//*[text()='Users']")
	public WebElement User1;
    
    @FindBy(xpath="//*[text()='Create User']")
	public WebElement CreateUser;
    
    @FindBy(xpath="//input[@id='nest-messages_name']")
	public WebElement Person;
    
 
    String PersonName="//div[@title='#']";
   		
    @FindBy(xpath="//input[@id=\"nest-messages_role\"]")
	public WebElement Persona;
    
    String PersonaName="//div[@title='#']";
    
   
    @FindBy(xpath="//*[text()='Event Based Email']")
    public WebElement eventbasedemail;
    
   
    @FindBy(xpath="//*[text()='Weekly Summary Email']")
    public WebElement weeklybasedemail;
     
    
    @FindBy(xpath="//input[@id='nest-messages_preference_day']")
	public WebElement preferenceday;
    
    //@FindBy(xpath="//span[text()='Select Days']")
	//public WebElement preferenceday;
    
    
    String PreferenceDay="//div[@title='#']";
    
    @FindBy(xpath="//*[text()='Manage Users']")
    public WebElement text_manageusers;
    

    public void clickOnUsers() {
	this.click(User1);
	this.click(CreateUser);
	this.click(Person);
        }
		
	public void selectPerson(String txtPersonName) {
		try {
			this.click(Person);
			this.clickOnDynamicElement(PersonName, txtPersonName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectPersona(String txtPersonaName) {
		try {
			this.click(Persona);
			this.clickOnDynamicElement(PersonaName, txtPersonaName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnEmails() throws InterruptedException {
		this.click(eventbasedemail);
		Thread.sleep(2000);
		this.click(weeklybasedemail);
		Thread.sleep(2000);

}
	
	public void selectPreference(String txtPreferenceDay) {
		try {
			this.click(preferenceday);
			this.clickOnDynamicElement(PreferenceDay, txtPreferenceDay);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String isManageUsersTextDisplayed() {
		String manageuserstext=text_manageusers.getText();
		return manageuserstext;
}
}

	


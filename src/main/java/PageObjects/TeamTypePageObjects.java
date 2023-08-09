package PageObjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import basepackage.TestAction;


@SuppressWarnings("unused")
public class TeamTypePageObjects extends TestAction{
	WebDriver  driver;
	public TeamTypePageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	           } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[4]/div")
    public WebElement Team; 
	
	@FindBy(xpath="//*[text()='Teams']")
	public WebElement Teams;
	
	@FindBy(xpath="//*[@id=\"rc-menu-uuid-76919-3-teams-popup\"]/li[2]/span")
    public WebElement TeamType; 
	
	@FindBy(xpath="//*[text()='Team Type']")
	public WebElement TeamsType;
	
	@FindBy(xpath="//*[text()='Create Team Type']")
	public WebElement CreateTeamType;
	
	@FindBy(xpath="//input[@id=\"nest-messages_name\"]")
    public WebElement Enter_Name; 
	
	@FindBy(xpath="//input[@id=\"nest-messages_description\"]")
    public WebElement Enter_Description; 	
	
	@FindBy(xpath="//button[@type=\"submit\"]")
    public WebElement Click_Submit;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[2]/main/div[2]/div/div/div/div/div/table/tbody/tr[3]/td[3]/div/div/span")
    public WebElement Click_Edit;
	
	
	@FindBy(xpath="//*[text()='Update']")
    public WebElement Click_Update;

	public void clickEnterDetails(String Name, String Description) throws InterruptedException {
	this.click(Teams);
	this.click(TeamsType);
	this.click(CreateTeamType);
	this.sendkeys(Enter_Name, Name);
    this.sendkeys(Enter_Description, Description);
    this.click(Click_Submit);
	}
	
	public void clickEditDetails(String Name, String Description) throws InterruptedException {
	this.click(Teams);
	this.click(TeamsType);
	this.click(Click_Edit);
	Thread.sleep(2000);
	this.waitForEle(Enter_Name);
	//Enter_Name.clear();
    Actions action = new Actions(driver);
	action.moveToElement(Enter_Name).click().perform();
	Thread.sleep(2000);
	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	action.sendKeys(Keys.DELETE).perform();
	Thread.sleep(2000);
	this.sendkeys(Enter_Name, Name);
	action.moveToElement(Enter_Description).click().perform();
	Thread.sleep(2000);
	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	action.sendKeys(Keys.DELETE).perform();
	Thread.sleep(2000);
	this.sendkeys(Enter_Description, Description);
    this.click(Click_Update);
	Thread.sleep(2000);

	}
}

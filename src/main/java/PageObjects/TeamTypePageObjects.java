package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestAction;

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

	public void clickEnterDetails(String Name, String Description) throws InterruptedException {
	this.click(Teams);
	this.click(TeamsType);
	this.click(CreateTeamType);
	this.sendkeys(Enter_Name, Name);
    this.sendkeys(Enter_Description, Description);
    this.click(Click_Submit);

	}
}

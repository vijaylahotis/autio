package PageObjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestAction;


@SuppressWarnings("unused")
public class TeamLevelPageObjects extends TestAction{
	WebDriver  driver;
	public TeamLevelPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	           } 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/aside/div/ul/li[4]/div")
    public WebElement Team; 
	
	@FindBy(xpath="//*[text()='Teams']")
	public WebElement Teams;
	
	@FindBy(xpath="//*[@id=\"rc-menu-uuid-57814-4-teams-popup\"]/li[1]")
    public WebElement TeamLevel; 
	
	@FindBy(xpath="//*[text()='Team Level']")
	public WebElement TeamsLevel;
	
	@FindBy(xpath="//*[text()='Create Team Level']")
	public WebElement CreateTeamLevel;
	
	@FindBy(xpath="//label[@title='Level Number']")
	WebElement levelnumberText;
	
	@FindBy(xpath="//input[@id=\"nest-messages_name\"]")
    public WebElement Enter_Name; 
	
	@FindBy(xpath="//button[@type=\"submit\"]")
    public WebElement Click_Submit;
	
	public void clickEnterDetails(String LevelName) throws InterruptedException {
		this.click(Teams);
		this.click(TeamsLevel);
		this.click(CreateTeamLevel);
		this.sendkeys(Enter_Name, LevelName);
	    this.click(Click_Submit);

		}
	
	public String isLevelNumberTextDisplayed( ) {
		String LevelNumberText= levelnumberText.getText();
    	return LevelNumberText;
	}
	
}
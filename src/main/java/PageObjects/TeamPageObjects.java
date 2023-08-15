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
public class TeamPageObjects extends TestAction{
	WebDriver  driver;
	public TeamPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	           } 
	
	
	@FindBy(xpath="//*[text()='Teams']")
	public WebElement Teams;
	
	@FindBy(xpath="//ul[contains(@id, 'teams-popup')]/li[3]")
	public WebElement Team;
	
	@FindBy(xpath="//*[text()='Create Team']")
	public WebElement CreateTeam;
	
	@FindBy(xpath="//input[@id=\"team_level_id\"]")
	public WebElement Selectteamlevel;
	
	String TeamLevel="//div[@title='#']";
	
	@FindBy(xpath="//input[@id=\"parent_team\"]")
	public WebElement Selectparentteam;
	
	String ParentTeam="//div[@title='#']";
	
	@FindBy(xpath="//input[@id=\"validating\"]")
	public WebElement enterteamname;
	
	@FindBy(xpath="//input[@id=\"team_leader\"]")
	public WebElement Selectteamleader;
	
	String TeamLeader="//div[@title='#']";
	
	@FindBy(xpath="//input[@id=\"team_type_id\"]")
	public WebElement Selectteamtype;
	
	String TeamType="//div[@title='#']";
	
	@FindBy(xpath="//input[@id=\"sunset_date\"]")
	public WebElement clickdate;
	
	@FindBy(xpath="//td[@title=\"2023-08-10\"]")
	public WebElement Selectdate;
	
	@FindBy(xpath="//button[@type='submit']")
    public WebElement clicksubmit;
	
	
	public void clickteamdetails() throws InterruptedException {
    	this.click(Teams);
    	this.click(Team);
    	this.click(CreateTeam);
	}
	
	public void selectteamlevel(String txtTeamLevel) {
		try {
			this.click(Selectteamlevel);
			this.sendkeys(Selectteamlevel, txtTeamLevel);
		    this.clickOnDynamicElement(TeamLevel, txtTeamLevel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectparentteam(String txtParentTeam) {
		try {
			this.click(Selectparentteam);
		    this.clickOnDynamicElement(ParentTeam, txtParentTeam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterteamname(String TeamName) throws InterruptedException {
		this.sendkeys(enterteamname, TeamName);
		Thread.sleep(2000);
	}
	
	public void selectteamleader(String txtTeamLeader) {
		try {
			this.click(Selectteamleader);
			this.sendkeys(Selectteamleader, txtTeamLeader);
		    this.clickOnDynamicElement(TeamLeader, txtTeamLeader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectteamtype(String txtTeamType) {
		try {
			this.click(Selectteamtype);
			this.sendkeys(Selectteamtype, txtTeamType);
		    this.clickOnDynamicElement(TeamType, txtTeamType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectdetails() throws InterruptedException {
    	this.click(clickdate);
    	this.click(Selectdate);
    	this.click(clicksubmit);
	}
}
	
	
	
	
	

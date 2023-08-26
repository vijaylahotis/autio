package PageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import basepackage.TestAction;
import org.openqa.selenium.interactions.Actions;



@SuppressWarnings("unused")
public class RegressionPageObjects extends TestAction{
	WebDriver  driver;
	public RegressionPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	           } 
	
	// New Team
	
	
	@FindBy(xpath="//div[@id=\"select-id\"]")
	public WebElement selectparentteam;
	
	@FindBy(xpath="(//div[text()='Deposits'])[2]")
	public WebElement selectdeposits;
	
	@FindBy(xpath="//*[text()='New Team']")
	public WebElement NewTeam;
	
	@FindBy(xpath="//*[@title='Deposits']")
	public WebElement select_group;
	
	String Group="//div[@title='#']";
	
	@FindBy(xpath="//input[@id='validating']")
	public WebElement enter_teamname;
	
	@FindBy(xpath="//input[@id=\"team_leader\"]")
	public WebElement select_teamleader;
	
	String TeamLeader="//div[@title='#']";
	
	@FindBy(xpath="//input[@id='team_level_id']")
	public WebElement Selectteamlevel;
	
	String TeamLevel="//div[@title='#']";
	
	@FindBy(xpath="//input[@id='team_type_id']")
	public WebElement select_teamtype;
	
	String TeamType="//div[@title='#']";
	
	@FindBy(xpath="//input[@id='sunset_date']")
	public WebElement clicksunsetdate;
	
	@FindBy(xpath="//td[@title=\"2023-08-22\"]")
	public WebElement select_sunsetdate;
	
	@FindBy(xpath="//*[text()='Create Team']")
    public WebElement click_createteam;
	
	@FindBy(xpath="//*[@class='ant-btn css-17a39f8 ant-btn-default ant-btn-lg' and span[text()='Cancel']]")
    public WebElement click_cancelteam;
	
	// Position 1 & Member 1
	

    String Teamname = "//*[text()='#']";
	 
	@FindBy(xpath="(//div[@col-id='role_name'])[2]")
	 public WebElement click_role_row1;
	
//	@FindBy(xpath="//*[text()='Java Developer']")
 //   public WebElement click_selectposition1;
		
	String Position1="//*[text()='#']";
	
	@FindBy(xpath="(//div[@col-id='team_member_name'])[2]")
    public WebElement click_member_row1;
	
	
    String Member1="//div[text()='#']";
    
    @FindBy(xpath="(//div[@col-id='hire_date'])[2]")
    public WebElement click_startdate1;
	
	@FindBy(xpath="//*[text()='Save changes']")
    public WebElement click_savechanges1;
	
	// Position 2 & Member 2

	@FindBy(xpath="(//div[@col-id='role_name'])[3]")
    public WebElement click_role_row2;
	
	
//	@FindBy(xpath="//*[text()='Designer']")
  //  public WebElement click_selectposition2;
	
	String Position2="//*[text()='#']";

	
	@FindBy(xpath="(//div[@col-id='team_member_name'])[3]")
    public WebElement click_member_row2;
	
	
	String Member2="//*[text()='#']";
	
	@FindBy(xpath="(//div[@col-id='hire_date'])[3]")
    public WebElement click_startdate2;
	
	@FindBy(xpath="//*[text()='Save changes']")
    public WebElement click_savechanges2;
	
	// Actions Cancel
	
	@FindBy(xpath="//button[contains(@class, 'ant-btn') and contains(span, 'Action Required')]")
    public WebElement click_actionrequired1;
	
	String Actions1="//*[text()='#']";
	
	String MemberAction="//*[text()='#']";
	
	@FindBy(xpath="(//span[text()='Cancel'])[12]")
    public WebElement click_cancelbutton1;
	
	@FindBy(xpath="//*[text()='Yes']")
    public WebElement click_yes1;
	
	@FindBy(xpath="//span[@class=\"anticon anticon-close\"]")
    public WebElement click_X1;
	
	@FindBy(xpath="//button[contains(@class, 'ant-btn') and contains(span, 'Action Required')]")
    public WebElement click_actionrequired2;
	
	@FindBy(xpath="//span[contains(text(), 'All')]")
    public WebElement click_filter;
	
	@FindBy(xpath="//div[contains(text(), 'New Confirmed Contractors')]")
    public WebElement click_confirmedcontractor;
	
	String Actions2="//*[text()='#']";
	
	String cancelbutton = "(//*[contains(text(), '#')]/ancestor::li//button[contains(@type, 'button')])";
	
	@FindBy(xpath="//a[text()='A-09 B-09']/ancestor::li//button/span[text()='Cancel']")
    public WebElement click_cancelbutton2;
	
	
	@FindBy(xpath="//*[text()='Yes']")
    public WebElement click_yes2;
	
	@FindBy(xpath="//span[@class=\"anticon anticon-close\"]")
    public WebElement click_X2;
	
	@FindBy(xpath="(//span[@data-testid=\"avatar\"])[1]")
    public WebElement click_avatar;
	
	@FindBy(xpath="//span[text()='Log Out']")
    public WebElement click_logout;
	
	@FindBy(xpath="//div[@class=\"table\"]")
    public WebElement click_out;
	
	// New team member Assign
	
	@FindBy(xpath="//button[contains(@class, 'ant-btn') and contains(span, 'Action Required')]")
    public WebElement click_actionrequired3;
	
	String Actions3="//*[contains(text(), '#')]";
	
	String dropdownteammember = "(//*[contains(text(), '#')]/ancestor::li//div[contains(@class, 'ant-select ant-cascader ant-select-in-form-item css-17a39f8 ant-select-single ant-select-allow-clear ant-select-show-arrow')])[1]";
	
	String teamname = "//*[contains(text(), '#')]";
	
	String teamtype = "//div[contains(text(), '#')]";
	
	String positionname ="(//div[text()='#'])[2]";
	
	String addnewmember = "(//*[contains(text(), '#')]/ancestor::li//button[contains(@class, 'ant-btn css-17a39f8 ant-btn-primary')])[1]";
	
	String dropdownteammember1 = "(//*[contains(text(), '#')]/ancestor::li//div[contains(@class, 'ant-select ant-cascader ant-select-in-form-item css-17a39f8 ant-select-single ant-select-allow-clear ant-select-show-arrow')])[2]";
	
	String teamtype1 = "//div[contains(text(), '#')]";
	
	String positionname1 ="(//div[text()='#'])[2]";
	
	String mergemember = "(//*[contains(text(), '#')]/ancestor::li//button[contains(@class, 'ant-btn css-17a39f8 ant-btn-primary')])[2]";
	
	// @FindBy(xpath="//*[contains(text(), 'Aiden Markram onboarded in Azure AD on @source.HireDate. Please assign Aiden Markram to one of your teams')]")
   // public WebElement click_a1;
	
	@FindBy(xpath="//*[contains(text(), 'Select team position')]")
    public WebElement click_addnewmember;
	
	@FindBy(xpath="//*[@title='SQA Team']")
    public WebElement click_selectteam;
	
	@FindBy(xpath="//*[text()='Scrum Master']")
    public WebElement click_selectposition;
	
	@FindBy(xpath="(//button[span[text()='Add New Member']])[1]")
    public WebElement click_addmember;
	
	@FindBy(xpath="//input[@id='monthly_rate']")
    public WebElement click_monthlyrate;
	
	@FindBy(xpath="//input[@id='experience']")
    public WebElement click_experience;
	
	@FindBy(xpath="//input[@id='tenure']")
    public WebElement click_tenure;
	
	@FindBy(xpath="//input[@id='country']")
    public WebElement click_country;
	
	String Country="//span[@title='#']";
	
	@FindBy(xpath="//input[@id='service_provider_id']")
    public WebElement click_provider;
	
	String Provider="//span[@title='#']";

	
	@FindBy(xpath="//span[text()='Create Member']")
    public WebElement click_createmember;
	
	@FindBy(xpath="//span[@class=\"anticon anticon-close\"]")
    public WebElement click_X3;
	
	//Merge a new hire
	
	@FindBy(xpath="//button[contains(@class, 'ant-btn') and contains(span, 'Action Required')]")
    public WebElement click_actionrequired4;
	
	@FindBy(xpath="//*[contains(text(), 'Name XOCRI')]")
    public WebElement click_newhire;
	
	@FindBy(xpath="(//div[contains(@class, 'ant-select') and contains(@class, 'ant-cascader') and contains(@class, 'ant-select-single')])[2]")
    public WebElement click_mergeteammember;
	
	@FindBy(xpath="//*[@title='SQA Team']")
    public WebElement click_mergeselectteam;
	
	@FindBy(xpath="(//*[text()='Bilal Ahmed'])[3]")
    public WebElement click_mergeselectposition;
	
	@FindBy(xpath="(//button[span[text()='Merge']])[1]")
    public WebElement click_mergebutton;
	
	@FindBy(xpath="//input[@id='experience']")
    public WebElement click_mergeexperience;
	
	@FindBy(xpath="//input[@id='tenure']")
    public WebElement click_mergetenure;
	
	@FindBy(xpath="//span[text()='Update Member']")
    public WebElement click_updatemember;
	
	//Move team member past date
	
	@FindBy(xpath="//button[contains(@class, 'ant-btn') and contains(span, 'Action Required')]")
	 public WebElement click_actionrequired5;
		
	@FindBy(xpath="//*[text()='Confirm Move Team Member']")
	 public WebElement click_moveteammember;
		
    @FindBy(xpath="(//input[@id='formCreateRecord_date'])[14]")
	 public WebElement click_selectdate;
		
	@FindBy(xpath="//*[@title='2023-08-22']")
	 public WebElement select_date;
	
	@FindBy(xpath="(//button[@class='ant-btn css-17a39f8 ant-btn-primary' and span[text()='Confirm']])[14]")
    public WebElement click_confirm;
	
	
	//Move team member future date
	
	@FindBy(xpath="//button[contains(@class, 'ant-btn') and contains(span, 'Action Required')]")
	public WebElement click_actionrequired6;
			
	@FindBy(xpath="(//*[text()='Confirm Move Team Member'])[2]")
	public WebElement click_moveteammember1;
			
	@FindBy(xpath="(//input[@id='formCreateRecord_date'])[3]")
    public WebElement click_selectdate1;
			
	@FindBy(xpath="//*[@title='2023-08-18']")
	public WebElement select_date1;
		
	@FindBy(xpath="(//button[@class='ant-btn css-byeoj0 ant-btn-primary' and @hidden and span[text()='Confirm']])[3]")
	public WebElement click_confirm1;
	
	// New Team
	
	public void clickteam() throws InterruptedException {
		this.click(selectparentteam);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectdeposits);
		this.click(selectdeposits);
    	
	}
	
	public void clicknewteam() throws InterruptedException {
    	this.click(NewTeam);
    	
	}
	
	public void selectgroup(String txtGroup) {
		try {
			this.click(select_group);
		    this.clickOnDynamicElement(Group, txtGroup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String enterteamname() throws InterruptedException {
		String randomTeamName = generateRandomTeamname(5); // Specify the desired length
		enter_teamname.sendKeys(randomTeamName);
		return randomTeamName;
	}
	
	public void selectteamleader(String txtTeamLeader) {
		try {
			this.click(select_teamleader);
			this.sendkeys(select_teamleader, txtTeamLeader);
		    this.clickOnDynamicElement(TeamLeader, txtTeamLeader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void selectteamtype(String txtTeamType) {
		try {
			this.click(select_teamtype);
			this.sendkeys(select_teamtype, txtTeamType);
		    this.clickOnDynamicElement(TeamType, txtTeamType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectdetails() throws InterruptedException {
    	//this.click(clicksunsetdate);
    	//this.click(select_sunsetdate);
    	this.click(click_createteam);
    	//this.click(click_cancelteam);
    	
	}
	
	// Position & Member 
	
	public void clickonteamname(String txtTeamname) throws InterruptedException {
    	try {
			this.clickOnDynamicElement(Teamname, txtTeamname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	
	}
	
	public void createposition1(String PositionName) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.doubleClick(click_role_row1).perform();
		//this.sendkeys(click_role_row3, "SDET");
      //  jsExecutor.executeScript(setInputValueScript);
	//	clickUsingJavaScriptExecutor(click_role_row1, 10);
	//	WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'ag-cell-value')][@col-id='role_name']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver; 
		 System.out.println("PositionName is" +PositionName);
		 jse.executeScript("arguments[0].removeAttribute('disabled')", click_role_row1);
		 jse.executeScript("arguments[0].value = '+PositionName';", click_role_row1);
		// this.sendkeys(click_role_row1, PositionName);
		 Thread.sleep(10000);
		// jse.executeScript("arguments[0].value = '" +PositionName + " " + "'", click_role_row1);
		// jse.executeScript("arguments[0].removeAttribute('disabled')", cclick_role_row1);
		 //jse.executeScript("arguments[0].value='Analysts'", click_role_row1);
	
	}
	
	public String selectposition1(String txtPosition1) {
		try {
			this.click(click_role_row1);
			Actions actions = new Actions(driver);
			actions.doubleClick(click_role_row1).perform();
			this.clickOnDynamicElement(Position1, txtPosition1);
		//	this.click(click_selectposition1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txtPosition1;
	}
	
	public void createmember1(String MemberName) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.doubleClick(click_member_row1).perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		 System.out.println("MemberName is" +MemberName);
		 jse.executeScript("arguments[0].removeAttribute('disabled')", click_member_row1);
		 jse.executeScript("arguments[0].value = '+MemberName';", click_member_row1);
		//this.sendkeys(click_member_row1, MemberName);
	}
	
	public String selectmember1(String txtMember1) {
		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(click_member_row1).perform();
		    this.clickOnDynamicElement(Member1, txtMember1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txtMember1;
	}
	
	public void savechanges1()throws InterruptedException {
		this.click(click_startdate1);
    	this.click(click_savechanges1);
	}
	
	
	
	public String selectposition2(String txtPosition2) {
		try {
			this.click(click_role_row2);
			Actions actions = new Actions(driver);
			actions.doubleClick(click_role_row2).perform();
			this.clickOnDynamicElement(Position2, txtPosition2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txtPosition2;
	}
		
	public String selectmember2(String txtMember2) {
		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(click_member_row2).perform();
			this.clickOnDynamicElement(Member2, txtMember2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txtMember2;	
	}
	
	public void savechanges2() throws InterruptedException {
        this.click(click_startdate2);
    	this.click(click_savechanges2);
	}
	
	// Actions Cancel
	
	public void actioncancel1(String txtActions1) throws InterruptedException {
    	this.click(click_actionrequired1);
		try {
			this.clickOnDynamicElement(Actions1, txtActions1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.click(click_cancelbutton1);
		Thread.sleep(2000);
		this.click(click_yes1);
		Thread.sleep(2000);
		this.click(click_X1);
	
	}
	
		
	public void action(String txtMemberAction) throws InterruptedException {
    	try {
    		this.click(click_actionrequired2);
		//	this.clickOnDynamicElement(MemberAction, txtMemberAction);
			this.clickOnDynamicElement(cancelbutton, txtMemberAction);
		//	this.click(click_cancelbutton2);
			Thread.sleep(2000);
			this.click(click_yes2);
			Thread.sleep(2000);
			this.click(click_X2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	
	}
	
	public void logout() throws InterruptedException {
    	this.click(click_avatar);
    	this.click(click_logout);
    	this.click(click_out);
	}
	
	
	public void clickCancel(String webElement, String elementToReplace) {
		this.click(click_actionrequired2);
        String eleToClick = webElement.replaceAll("#", elementToReplace);
        WebElement cancelElement = driver.findElement(By.xpath(eleToClick));
        cancelElement.click();
    }
	
	
	public void actioncancel2(String txtActions2) throws InterruptedException {
    	this.click(click_actionrequired2);
		try {
			this.clickOnDynamicElement(Actions2, txtActions2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.click(click_cancelbutton2);
		Thread.sleep(2000);
		this.click(click_yes2);
		Thread.sleep(2000);
		this.click(click_X2);
	
	}
	
	// Assign a new hire to an existing open position
	
	public void clickonactions(String txtfirstname) {
		try {
			this.click(click_actionrequired2);
		//	this.click(click_filter);
		//	this.click(click_confirmedcontractor);
		//	this.clickOnDynamicElement(Actions3, txtfirstname);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
			wait.until(ExpectedConditions.elementToBeClickable(this.findDynamicElement(dropdownteammember, txtfirstname)));
		    this.clickOnDynamicElement(dropdownteammember, txtfirstname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonteamactions(String txtteamtype) {
		try {
			
		    this.clickOnDynamicElement(teamtype, txtteamtype);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonpositionactions(String txtpositionname) {
		try {
			
		    this.clickOnDynamicElement(positionname, txtpositionname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonaddnewmember(String txtaddnewmember) {
		try {
			
		    try {
				this.clickOnDynamicElement(addnewmember, txtaddnewmember);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Selectteampostion1() {
		try {
			this.click(click_addnewmember);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_selectteam);
			this.click(click_selectteam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void Selectteampostion2() {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_selectposition);
			this.click(click_selectposition);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		this.click(click_addmember);
	}
	
	public void entermonthlyrate() throws InterruptedException {
		String randomMonthlyRate = generateRandommonthlyrate(3); 
		click_monthlyrate.sendKeys(randomMonthlyRate);
		}
	
	public void enterexperience() throws InterruptedException {
		String randomExperience = generateRandomexperience(0); 
		click_experience.sendKeys(randomExperience);
	    }
	
	public void entertenure() throws InterruptedException {
		String randomTenure = generateRandomtenure(0); 
		click_tenure.sendKeys(randomTenure);
	    }
	
	public void selectCountry(String txtCountry) {
		try {
			this.click(click_country);
			this.sendkeys(click_country, txtCountry);
			this.clickOnDynamicElement(Country, txtCountry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectProvider(String txtProvider) {
		try {
			this.click(click_provider);
			this.sendkeys(click_provider, txtProvider);
			this.clickOnDynamicElement(Provider, txtProvider);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickcreatemember() throws InterruptedException {
    	this.click(click_createmember);
    	Thread.sleep(5000);
    	this.click(click_X2);
	}
	
	
	// Merge
	
	public void clickonmergeactions(String txtfirstname) {
		try {
			this.click(click_actionrequired2);
		//	this.click(click_filter);
		//	this.click(click_confirmedcontractor);
		//	this.clickOnDynamicElement(Actions3, txtfirstname);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
			wait.until(ExpectedConditions.elementToBeClickable(this.findDynamicElement(dropdownteammember1, txtfirstname)));
		    this.clickOnDynamicElement(dropdownteammember1, txtfirstname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonmergeteamactions(String txtteamtype) {
		try {
			
		    this.clickOnDynamicElement(teamtype1, txtteamtype);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonmergepositionactions(String txtpositionname) {
		try {
			
		    this.clickOnDynamicElement(positionname1, txtpositionname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonmergemember(String txtaddnewmember) {
		try {
			
		    try {
				this.clickOnDynamicElement(mergemember, txtaddnewmember);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonactions() {
		try {
			this.click(click_actionrequired4);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_newhire);
			this.click(click_newhire);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	public void Mergeteampostion1() {
		try {
			this.click(click_mergeteammember);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_mergeselectteam);
			this.click(click_mergeselectteam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	
		}
		
	public void Mergeteampostion2() {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_mergeselectposition);
			this.click(click_mergeselectposition);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			this.click(click_mergebutton);
		}
		
	public void entermergeexperience() throws InterruptedException {
		String randomExperience = generateRandomexperience(0); 
		click_experience.sendKeys(randomExperience);
	    }
	
	public void entermergetenure() throws InterruptedException {
		String randomTenure = generateRandomtenure(0); 
		click_tenure.sendKeys(randomTenure);
	    }
	
	public void clickupdatemember() throws InterruptedException {
    	this.click(click_updatemember);
    	Thread.sleep(5000);
    	this.click(click_X2);
	}
	
		
	// Move a member past or current date
		
		public void clickonmoveteammember() {
			try {
				this.click(click_actionrequired5);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_moveteammember);
				this.click(click_moveteammember);
				this.click(click_selectdate);
				this.click(select_date);
				//this.click(click_confirm);
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	// Move a member future date
		
		public void clickonmoveteammember1() {
			try {
				this.click(click_actionrequired6);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_moveteammember1);
				this.click(click_moveteammember1);
				this.click(click_selectdate1);
				this.click(select_date1);
				//this.click(click_confirm1);
							
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	
	
	
	
	

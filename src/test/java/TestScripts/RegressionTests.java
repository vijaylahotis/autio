package TestScripts;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.TestBase;
import basepackage.TestAction;
import Utilities.Inputs;
import Utilities.AzureInputs;
import Utilities.Constants;
import Utilities.ExpectedValue;
import PageObjects.RegressionPageObjects;
import PageObjects.RunNightJobsPageObjects;
import PageObjects.SignInPageObjects;
import PageObjects.UserCreationPageObjects;
import PageObjects.SignInPageObjects;
import PageObjects.AzureSignIn;



@SuppressWarnings("unused")
@Listeners({TestScripts.Itestlistners.class})
public class RegressionTests extends TestBase{
	
	public SignInPageObjects SignIn;
	public RegressionPageObjects Regression;
	public AzureSignIn Azuresignin;
	public RunNightJobsPageObjects RunJob;
	
	// All possible test scenarios
	
		@Test(priority=0,description="This testcase verifies complete flow",enabled=true)
		public void RegressionSuite() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign();
			Thread.sleep(5000);
			Regression= new RegressionPageObjects(driver);
			Regression.clickonteamname(Inputs.teamname);
			Regression.action(Inputs.Member2);
			Thread.sleep(2000);
			Regression.logout();
			driver.switchTo().newWindow(WindowType.TAB);
			Azuresignin= new AzureSignIn(driver);
			Azuresignin.azuresign();
			Azuresignin.createuser();
			Azuresignin.enterpname();
			Thread.sleep(3000);
			Azuresignin.enterdname();
			String firstname1 = Azuresignin.enterfirstname();
			Azuresignin.enterlastname();
			Azuresignin.enterdetails(AzureInputs.EmployeeType);
			Azuresignin.clickmanager();
			Azuresignin.enterotherdetails(AzureInputs.Manager);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign1();		
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Inputs.teamname);
			Regression.clickonactions(firstname1);
			Regression.clickonteamactions(Inputs.teamname);
			Regression.clickonpositionactions(Inputs.Position2);
			Regression.clickonaddnewmember(firstname1);
			Regression.entermonthlyrate();
		    Regression.enterexperience();
		    Regression.entertenure();
		    Regression.clickcreatemember();
			driver.switchTo().newWindow(WindowType.TAB);
			Azuresignin= new AzureSignIn(driver);
			Azuresignin.azuresign1();
			Azuresignin.createuser();
			Azuresignin.enterpname();
			Thread.sleep(3000);
			Azuresignin.enterdname();
			String firstname2 = Azuresignin.enterfirstname();
			Azuresignin.enterlastname();
			Azuresignin.enterdetails(AzureInputs.EmployeeType);
			Azuresignin.clickmanager();
			Azuresignin.enterotherdetails(AzureInputs.Manager);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign2();		
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Inputs.teamname);
			Regression.clickonmergeactions(firstname2);
			Regression.clickonmergeteamactions(Inputs.teamname);
			Regression.clickonmergepositionactions(Inputs.Member1);
			Regression.clickonmergemember(firstname2);
			Regression.clickupdatemember();
		    Thread.sleep(5000);
		    driver.switchTo().newWindow(WindowType.TAB);
			Azuresignin= new AzureSignIn(driver);
			Azuresignin.azuresign1();
			Azuresignin.createuser();
			Azuresignin.enterpname();
			Thread.sleep(3000);
			Azuresignin.enterdname();
			String firstname3 = Azuresignin.enterfirstname();
			Azuresignin.enterlastname();
			Azuresignin.enterdetails(AzureInputs.EmployeeType);
			Azuresignin.clickmanager();
			Azuresignin.enterotherdetails(AzureInputs.Manager);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign2();		
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Inputs.teamname);
			Regression.clickonignoreactions(firstname3);
			Thread.sleep(4000);
			Regression.updatedetails();
			Regression.entermonthlyrate1();
			Regression.enterexperience1();
			Regression.entertenure1();
			Regression.selectProvider1(Inputs.Provider);
			Regression.selectstartdate(Inputs.StartDate);
			Thread.sleep(4000);
			Regression.enterbudgetrate1();
			Thread.sleep(4000);
			Regression.savechanges2();
			Thread.sleep(2000);
		    driver.switchTo().newWindow(WindowType.TAB);
			Azuresignin= new AzureSignIn(driver);
			Azuresignin.azuresign1();
			Azuresignin.createuser1(firstname2);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign2();		
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Inputs.teamname);
			Regression.clickonconfirmrolloffactions(firstname2);
			Regression.clickonconfirmdate(Inputs.Rolloffdate);
			Regression.clickonconfirmreason(firstname2);
			Regression.clickonreason(Inputs.Reason);
			Regression.clickonconfirm(firstname2);
		    Thread.sleep(10000);
			Regression.cancelrolloff1(firstname1); // select roll off date
			Thread.sleep(5000);
			Regression.clickonteamname(Inputs.teamname1);
			Regression.selectmember(firstname1); // select member and select start date as future
			Regression.confirmove(firstname1);
			Regression.clickonteamname(Inputs.teamname);
			
        }						
}
				
				
   


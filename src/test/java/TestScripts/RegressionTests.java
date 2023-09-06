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
	
		@Test(priority=0,description="Scenarios:\n" +
		
				"Cancel a potential member\n" +
				
		        "Assign a new hire to an existing open position\n" +
		        
		        "Ignore a new hire\n" +
		        
		        "Merge a new hire with a potential member\n" +
		        
		        "Plan Roll-off member from a position\n" +
		        
		        "Cancel the Roll-off\n" +
		        
				"Confirm the Roll-off\n" +
				
				"Update the budget/rate for a position\n" +
				
				"Change the start date of a contractor\n" + 
				
				"Update the service provider for a contractor\n" +
				
				"Update the experience for a contractor\n" +
				
				"Update the tenure for a contractor\n" +
			
				"Add a new monthly/rate for a contractor\n" +
				
				"Move a member from one team to another (future date)\n", enabled = true)
		
		public void RegressionSuite() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign();
			Thread.sleep(5000);
			Regression= new RegressionPageObjects(driver);
			Regression.clickonteamname(Inputs.teamname);
			Regression.action(Inputs.Member2);
			Thread.sleep(2000);
			Assert.assertEquals(ExpectedValue.expectedupdatedsuccessfullMessage,Regression.isCancelUpdatedSuccessfullyMessageDisplayed()); 
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
			Azuresignin.enterdetails(Inputs.EmployeeType);
			Azuresignin.selecthiredate(Inputs.HireDate);
			Azuresignin.clickmanager();
			Azuresignin.enterotherdetails(Inputs.Manager);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			Assert.assertEquals(ExpectedValue.expectedImportPersonSuccessfullMessage,RunJob.isImportPersonSuccessfullyMessageDisplayed()); 
			Thread.sleep(5000);
			RunJob.clickOnprocessimportndata();
			Assert.assertEquals(ExpectedValue.expectedProcessImportSuccessfullMessage,RunJob.isProcessImportSuccessfullyMessageDisplayed());
			Thread.sleep(5000);
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
		    Assert.assertEquals(ExpectedValue.expectedaddedsuccessfullMessage,Regression.isAddedSuccessfullyMessageDisplayed());
			driver.switchTo().newWindow(WindowType.TAB);
			Azuresignin= new AzureSignIn(driver);
			Azuresignin.azuresign1();
			Azuresignin.createuser();
			Azuresignin.enterpname();
			Thread.sleep(3000);
			Azuresignin.enterdname();
			String firstname2 = Azuresignin.enterfirstname();
			Azuresignin.enterlastname();
			Azuresignin.enterdetails(Inputs.EmployeeType);
			Azuresignin.selecthiredate(Inputs.HireDate);
			Azuresignin.clickmanager();
			Azuresignin.enterotherdetails(Inputs.Manager);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			Assert.assertEquals(ExpectedValue.expectedImportPersonSuccessfullMessage,RunJob.isImportPersonSuccessfullyMessageDisplayed()); 
			Thread.sleep(5000);
			RunJob.clickOnprocessimportndata();
			Assert.assertEquals(ExpectedValue.expectedProcessImportSuccessfullMessage,RunJob.isProcessImportSuccessfullyMessageDisplayed());
			Thread.sleep(5000);
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
			Assert.assertEquals(ExpectedValue.expectedmergedsuccessfullMessage,Regression.isMergedSuccessfullyMessageDisplayed());
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
			Azuresignin.enterdetails(Inputs.EmployeeType);
			Azuresignin.selecthiredate(Inputs.HireDate);
			Azuresignin.clickmanager();
			Azuresignin.enterotherdetails(Inputs.Manager);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign1();
			RunJob= new RunNightJobsPageObjects(driver);
			Thread.sleep(100000);
			RunJob.clickOnimportpersondata();
			Assert.assertEquals(ExpectedValue.expectedImportPersonSuccessfullMessage,RunJob.isImportPersonSuccessfullyMessageDisplayed()); 
			Thread.sleep(5000);
			RunJob.clickOnprocessimportndata();
			Assert.assertEquals(ExpectedValue.expectedProcessImportSuccessfullMessage,RunJob.isProcessImportSuccessfullyMessageDisplayed());
			Thread.sleep(5000);
			driver.switchTo().newWindow(WindowType.TAB);
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign2();		
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Inputs.teamname);
			Regression.clickonignoreactions(firstname3);
			Assert.assertEquals(ExpectedValue.expectedupdatedsuccessfullMessage,Regression.isCancelUpdatedSuccessfullyMessageDisplayed()); 
			Thread.sleep(4000);
			Regression.updatedetails();
			Regression.entermonthlyrate1();
			Regression.enterexperience1();
			Regression.entertenure1();
			Regression.selectProvider1(Inputs.Provider);
			Regression.selectstartdate(Inputs.StartDate);
			Assert.assertEquals(ExpectedValue.expectedStaffMemberSuccessfullMessage,Regression.isStaffSuccessfullyMessageDisplayed());
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
			Assert.assertEquals(ExpectedValue.expectedImportPersonSuccessfullMessage,RunJob.isImportPersonSuccessfullyMessageDisplayed()); 
			Thread.sleep(5000);
			RunJob.clickOnprocessimportndata();
			Assert.assertEquals(ExpectedValue.expectedProcessImportSuccessfullMessage,RunJob.isProcessImportSuccessfullyMessageDisplayed());
			Thread.sleep(5000);
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
			Assert.assertEquals(ExpectedValue.expectedCancelRollOffSuccessfullMessage,Regression.isCancelRollOffSuccessfullyMessageDisplayed());
		    Thread.sleep(10000);
			Regression.cancelrolloff1(firstname1); // select roll off date
			Assert.assertEquals(ExpectedValue.expectedCancelRollOffSuccessfullMessage,Regression.isCancelRollOffSuccessfullyMessageDisplayed());
			Thread.sleep(5000);
			Regression.clickonteamname(Inputs.teamname1);
			Regression.selectmember(firstname1); // select member and select start date as future
			Regression.confirmove(firstname1);
			Regression.clickonteamname(Inputs.teamname);
			
        }						
}
				
				
   


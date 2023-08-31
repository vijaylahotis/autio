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
public class RegressionTests1 extends TestBase{
	
	public SignInPageObjects SignIn;
	public RegressionPageObjects Regression;
	public AzureSignIn Azuresignin;
	public RunNightJobsPageObjects RunJob;
	
	// All 7 test scenarios
	
		@Test(priority=0,description="This testcase verifies to complete flow",enabled=true)
		public void CreateTeam() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.hiringsign();
			Thread.sleep(5000);
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clicknewteam();
		//	Regression.selectgroup(Inputs.Group2);
			String teamname = Regression.enterteamname();
			Regression.selectteamleader(Inputs.TeamLeader1);
		//	Regression.selectteamtype(Inputs.TeamType1);
			Regression.selectdetails();
			Thread.sleep(2000);
			Assert.assertEquals(ExpectedValue.expectedTeamCreatedSuccessfullMessage,Regression.isTeamCreatedSuccessfullyMessageDisplayed()); 
		    Regression.clickonteamname(teamname);
			String Positionselect1 = Regression.selectposition1(Inputs.Position1);
			Thread.sleep(1000);
			String Membername1 = Regression.selectmember1(Inputs.Member1);
			Thread.sleep(10000);
			Regression.savechanges1();
			Thread.sleep(2000);
			Assert.assertEquals(ExpectedValue.expectedRecordCreatedSuccessfullMessage,Regression.isRecordCreatedSuccessfullyMessageDisplayed1()); 
			Thread.sleep(3000);
			String Positionselect2 = Regression.selectposition2(Inputs.Position2);
			Thread.sleep(1000);
			String Membername2 = Regression.selectmember2(Inputs.Member2);
			Thread.sleep(10000);
			Regression.savechanges2();
			Thread.sleep(2000);
			Assert.assertEquals(ExpectedValue.expectedRecordCreatedSuccessfullMessage,Regression.isRecordCreatedSuccessfullyMessageDisplayed2()); 
			Thread.sleep(5000);
			Regression.action(Membername2);
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
			Regression.clickonteamname(teamname);
			Regression.clickonactions(firstname1);
			Regression.clickonteamactions(teamname);
			Regression.clickonpositionactions(Positionselect2);
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
			Regression.clickonteamname(teamname);
			Regression.clickonmergeactions(firstname2);
			Regression.clickonmergeteamactions(teamname);
			Regression.clickonmergepositionactions(Membername1);
			Regression.clickonmergemember(firstname2);
			Regression.clickupdatemember();
			Assert.assertEquals(ExpectedValue.expectedmergedsuccessfullMessage,Regression.isMergedSuccessfullyMessageDisplayed());
		    Thread.sleep(5000);
		//    Regression.clickrolloff1();
		//    Thread.sleep(4000);
		//    Regression.clickrolloff2(Inputs.Rolloffdate);
		//    Regression.cancelrolloff(firstname2);
        }
}
				
				
   

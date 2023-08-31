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
import PageObjects.AzureSignIn;
import PageObjects.RegressionPageObjects;
import PageObjects.RunNightJobsPageObjects;
import PageObjects.SignInPageObjects;
import TestScripts.RegressionTests1;



@SuppressWarnings("unused")
@Listeners({TestScripts.Itestlistners.class})
public class AzurePotentialMember extends TestBase{
	
	public AzureSignIn Azuresignin;
	public SignInPageObjects SignIn;
	public RunNightJobsPageObjects RunJob;
	public RegressionPageObjects Regression;

	
	// Azure User Creation
	
		@Test(priority=0,description="This testcase verifies to create a user in azure",enabled=true)
		public void CreateUser() throws InterruptedException  {
		Azuresignin= new AzureSignIn(driver);
		Azuresignin.azuresign();
		Azuresignin.createuser();
		Azuresignin.enterpname();
		Thread.sleep(3000);
		Azuresignin.enterdname();
		String firstname = Azuresignin.enterfirstname();
		Azuresignin.enterlastname();
		Azuresignin.enterdetails(AzureInputs.EmployeeType);
		Azuresignin.clickmanager();
		Azuresignin.enterotherdetails(AzureInputs.Manager);
		driver.switchTo().newWindow(WindowType.TAB);
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign1();
		RunJob= new RunNightJobsPageObjects(driver);
		Thread.sleep(400000);
		RunJob.clickOnimportpersondata();
		driver.switchTo().newWindow(WindowType.TAB);
		SignIn= new SignInPageObjects(driver);
		SignIn.hiringsign1();		
		Regression= new RegressionPageObjects(driver);
	//	Regression.clickonteamname(teamname);
		Regression.clickonactions(firstname);
	
	    }
		
		
		
		
		
		
		
		
	// Run Jobs
			
		@Test(priority=1,description="This testcase verifies to run jobs",enabled=true)
		public void RunJob() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		RunJob= new RunNightJobsPageObjects(driver);
		RunJob.clickOnimportpersondata();
			
		}
  		
   // Assign a new hire to an existing open position
		
	    @Test(priority=2,description="This testcase verifies to Assign a member",enabled=true)
		public void AssignNewHire() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.hiringsign();		
		Regression= new RegressionPageObjects(driver);
	//	Regression.clickonteamname(teamname);
		Regression.clickonactions();
		Regression.Selectteampostion1();
		Regression.Selectteampostion2();
		Regression.entermonthlyrate();
		Regression.enterexperience();
		Regression.entertenure();
	//	Regression.selectCountry(Inputs.Country);
	//	Regression.selectProvider(Inputs.Provider);
	//  Regression.clickcreatemember();
	    }
}

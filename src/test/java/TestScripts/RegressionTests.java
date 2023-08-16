package TestScripts;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.TestBase;
import basepackage.TestAction;
import Utilities.Inputs;
import Utilities.Constants;
import Utilities.ExpectedValue;
import PageObjects.RegressionPageObjects;
import PageObjects.SignInPageObjects;
import PageObjects.UserCreationPageObjects;
import PageObjects.SignInPageObjects;



@SuppressWarnings("unused")
@Listeners({TestScripts.Itestlistners.class})
public class RegressionTests extends TestBase{
	
	public SignInPageObjects SignIn;
	public RegressionPageObjects Regression;
	
	// Team Creation
	
		@Test(priority=0,description="This testcase verifies to create a Team",enabled=true)
		public void CreateUser() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign();
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectgroup(Inputs.Group2);
			Regression.enterteamname();
			Regression.selectteamleader(Inputs.TeamLeader1);
			Regression.selectteamtype(Inputs.TeamType1);
			Regression.selectdetails();
		}
			
	// Position & Member Assigning
			
		@Test(priority=1,description="This testcase verifies to assign a position and member",enabled=true)
		public void CreatePosition() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign();		
			Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname();
		//	Regression.createposition1(Inputs.Position1);
			Regression.selectposition1();
		//	Regression.createmember1(Inputs.Member1);
			Regression.selectmember1(Inputs.Member1);
		//	Regression.savechanges1();
			Regression.selectposition2();
			Regression.selectmember2(Inputs.Member2);
		//	Regression.savechanges2();
        }
		
	// Cancel a potential member which is assigned to a position
		
	    @Test(priority=2,description="This testcase verifies to cancel a member",enabled=true)
		public void Cancelmember() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname();
		    Regression.actioncancel2(Inputs.Actions2);
	    }
	 
   // Assign a new hire to an existing open position
		
	    @Test(priority=3,description="This testcase verifies to Assign a member",enabled=true)
		public void Addamember() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname();
		    Regression.clickonactions(Inputs.Actions3);
		    Regression.Selectteampostion1();
		    Regression.Selectteampostion2();
		    Regression.entermonthlyrate();
		    Regression.enterexperience();
		    Regression.entertenure();
	//	    Regression.selectCountry(Inputs.Country);
	//	    Regression.selectProvider(Inputs.Provider);
		    Regression.clickcreatemember();
	    }
	    
 // Merge a new hire with a potential member
		
	    @Test(priority=4,description="This testcase verifies to Merge a member",enabled=true)
		public void Mergeamember() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname();
		    Regression.clickonactions();
		    Regression.Mergeteampostion1();
		    Regression.Mergeteampostion2();
		    Regression.entermergeexperience();
		    Regression.entermergetenure();
		    Regression.clickupdatemember();
	    }
	
	    
 // Move a member past or current date
		
	    @Test(priority=5,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname();
		    Regression.clickonmoveteammember();
	    }
	    
	    
// Move a member future date
		
	    @Test(priority=6,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember1() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname();
		    Regression.clickonmoveteammember1();
	    }
}

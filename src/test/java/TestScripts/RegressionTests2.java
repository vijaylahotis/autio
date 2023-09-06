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
public class RegressionTests2 extends TestBase{
	
	public SignInPageObjects SignIn;
	public RegressionPageObjects Regression;
	
	
	@Test(priority=1,description="This testcase verifies to complete flow",enabled=true)
	public void RegressionSuite1() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.hiringsign();
		Thread.sleep(5000);
		Regression= new RegressionPageObjects(driver);
		Regression.clickonteamname(Inputs.teamname);
	//	Regression.cancelrolloff1(firstname1);
}
	
	// Team Creation
	
		@Test(priority=0,description="This testcase verifies to create a Team",enabled=true)
		public void CreateTeam() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign();
			Regression= new RegressionPageObjects(driver);
			Regression.clickteam();
			Regression.selectgroup(Inputs.Group2);
			Regression.enterteamname();
			Regression.selectteamleader(Inputs.TeamLeader1);
		//	Regression.selectteamtype(Inputs.TeamType1);
			Regression.selectdetails();
		}
			
   // Position & Member Selection and Assigning
			
		@Test(priority=1,description="This testcase verifies to assign a position and member",enabled=true)
		public void SelectPositionMember() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign();		
			Regression= new RegressionPageObjects(driver);
		//  Regression.clickonteamname(teamname);
		//  Regression.selectposition1();
			Thread.sleep(1000);
			Regression.selectmember1(Inputs.Member1);
			Thread.sleep(5000);
			Regression.savechanges1();
			Thread.sleep(3000);
		//	Regression.selectposition2();
			Thread.sleep(1000);
			Regression.selectmember2(Inputs.Member2);
			Thread.sleep(5000);
			Regression.savechanges2();
			Thread.sleep(3000);
        }
		
		
   // Position & Member Creation and Assigning
		
		@Test(priority=2,description="This testcase verifies to create a position and member",enabled=true)
		public void CreatePositionMember() throws InterruptedException  {
			SignIn= new SignInPageObjects(driver);
			SignIn.adminsign();		
			Regression= new RegressionPageObjects(driver);
			Regression.clickonteamname(Constants.Teamname1);
			Regression.createposition1(Inputs.Position1);
			Regression.createmember1(Inputs.Member1);
			Regression.savechanges1();
		
		 }
				
				
   // Cancel a potential member which is assigned to a position
		
	    @Test(priority=3,description="This testcase verifies to cancel a member",enabled=true)
		public void Cancelpotentialmember() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname(Constants.Teamname1);
		//    Regression.actioncancel2(Inputs.Actions2);
	    }
	 
   // Assign a new hire to an existing open position
		
	    @Test(priority=4,description="This testcase verifies to Assign a member",enabled=true)
		public void AssignNewHire() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname(Constants.Teamname1);
	//	    Regression.clickonactions(Inputs.Actions3);
		    Regression.Selectteampostion1();
		    Regression.Selectteampostion2();
		    Regression.entermonthlyrate();
		    Regression.enterexperience();
		    Regression.entertenure();
	//	    Regression.selectCountry(Inputs.Country);
	//	    Regression.selectProvider(Inputs.Provider);
	//	    Regression.clickcreatemember();
	    }
	    
   // Merge a new hire with a potential member
		
	    @Test(priority=5,description="This testcase verifies to Merge a member",enabled=true)
		public void MergeNewHire() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname(Constants.Teamname1);
		    Regression.clickonactions();
		    Regression.Mergeteampostion1();
		    Regression.Mergeteampostion2();
		    Regression.entermergeexperience();
		    Regression.entermergetenure();
		  //  Regression.clickupdatemember();
	    }
	
	    
   // Move a member past or current date
		
	    @Test(priority=6,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname(Constants.Teamname1);
		    Regression.clickonmoveteammember();
	    }
	    
	    
  // Move a member future date
		
	    @Test(priority=7,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember1() throws InterruptedException  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.adminsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname(Constants.Teamname1);
		    Regression.clickonmoveteammember1();
	    }
	    
// Move a member future date
		
	    @Test(priority=7,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember21() throws Throwable  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.hiringsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.clickonteamname(Constants.Teamname1);
		    Regression.clickrolloff1();
		    
		    
	    }
	    
	    
	    @Test(priority=7,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember22() throws Throwable  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.hiringsign();		
		    Regression= new RegressionPageObjects(driver);
		    Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Inputs.teamname);
			Regression.updatedetails();
			Regression.entermonthlyrate1();
			Regression.enterexperience1();
			Regression.entertenure1();
			Regression.selectProvider1(Inputs.Provider);
			Regression.selectstartdate(Inputs.StartDate);    
	    }
	    
	    
	    @Test(priority=7,description="This testcase verifies to move a member",enabled=true)
		public void Moveteammember32() throws Throwable  {
		    SignIn= new SignInPageObjects(driver);
		    SignIn.hiringsign();		
		    Regression= new RegressionPageObjects(driver);
		   // Regression.selectparentteam(Inputs.ParentTeam2);
			Regression.clickonteamname(Constants.Teamname1);
			Thread.sleep(4000);
			Regression.enterbudgetrate1();
			Thread.sleep(4000);
			Regression.savechanges2();
}
	    
	    
	    @Test(priority=7,description="This testcase verifies to move a member",enabled=true)
	  		public void Moveteammember33() throws Throwable  {
	  		    SignIn= new SignInPageObjects(driver);
	  		    SignIn.hiringsign();		
	  		    Regression= new RegressionPageObjects(driver);
	  		   // Regression.selectparentteam(Inputs.ParentTeam2);
	  			Regression.clickonteamname(Constants.Teamname1);
	  			Regression.clickonteamname(Constants.Teamname2);
	  			Regression.selectmember(Constants.PM1);
	  			Regression.confirmove(Constants.PM1);
	  			Thread.sleep(4000);
	  			Regression.enterbudgetrate1();
	  			Thread.sleep(4000);
	  			Regression.savechanges2();
}
}

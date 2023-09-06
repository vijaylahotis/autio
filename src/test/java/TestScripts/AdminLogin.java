package TestScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basepackage.TestBase;
import basepackage.TestAction;
import Utilities.Constants;
import Utilities.ExpectedValue;
import PageObjects.SignInPageObjects;


@SuppressWarnings("unused")
@Listeners({TestScripts.Itestlistners.class})
public class AdminLogin extends TestBase{
	public SignInPageObjects sign ;


	Logger log = Logger.getLogger(AdminLogin.class);

	
	//signin test case
		@Test(priority=0,description="Test Case Scenarios:\n" +
				"1) Verify Sign-In\n" +
		        "2) Verify Sign-Out\n" +
		        "3) Verify SLogin\n", enabled = true)
		
		public void verifysigninFunctionality() throws InterruptedException {
			sign= new SignInPageObjects(driver);
			sign.adminsign();
			//Thread.sleep(2000);
		   // Assert.assertEquals(ExpectedValue.Run,sign.isRunNightJobsDisplayed());
		   // Thread.sleep(2000);
		}
}

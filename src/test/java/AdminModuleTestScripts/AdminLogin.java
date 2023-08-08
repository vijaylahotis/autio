package AdminModuleTestScripts;

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
public class AdminLogin extends TestBase{
	public SignInPageObjects sign ;


	Logger log = Logger.getLogger(AdminLogin.class);

	
	//signin test case
		@Test(priority=0,description="This testcase verifies to signin",enabled=true)
		public void verifysigninFunctionality() throws InterruptedException {
			sign= new SignInPageObjects(driver);
			sign.adminsign();
			
		    Assert.assertEquals(ExpectedValue.Run,sign.isRunNightJobsDisplayed());
		}
}

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
@Listeners({AdminModuleTestScripts.Itestlistners.class})
public class AdminLogin extends TestBase{
	public SignInPageObjects sign ;


	Logger log = Logger.getLogger(AdminLogin.class);

	
	//signin test case
		@Test(priority=0,description="This testcase verifies to signin",enabled=true)
		public void verifysigninFunctionality() throws InterruptedException {
			sign= new SignInPageObjects(driver);
			sign.adminsign();
			Thread.sleep(2000);
		    Assert.assertEquals(ExpectedValue.Run,sign.isRunNightJobsDisplayed());
		    Thread.sleep(2000);
		}
}

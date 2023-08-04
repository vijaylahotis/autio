package AdminModuleTestScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basepackage.TestBase;
import Utilities.Constants;
import Utilities.ExpectedValue;
import PageObjects.SignInPageObjects;


@SuppressWarnings("unused")
public class AdminLogin extends TestBase{
	public SignInPageObjects sign ;


	Logger log = Logger.getLogger(AdminLogin.class);

	//sign method
	public void adminsignin() throws InterruptedException {
		sign= new SignInPageObjects(driver);
		sign.navigateUrl(Constants.URL) ; 
		sign.enterAdminEmail(Constants.adminEmail); 
		sign.clickOnSign(); 
		sign.enterAdminPassword(Constants.adminPassword);
		sign.clickOnSignIn();
		sign.clickOnYes();
		//Thread.sleep(5000);
	}
	
	//signin test case
		@Test(priority=0,description="This testcase verifies signin functionality",enabled=true)
		public void verifysigninFunctionality() throws InterruptedException {
			adminsignin(); 
			Assert.assertEquals(ExpectedValue.Run,sign.isRunNightJobsDisplayed());
		}
}

package AdminModuleTestScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


import basepackage.TestBase;
import basepackage.TestAction;
import Utilities.Constants;
import Utilities.ExpectedValue;
import PageObjects.SignInPageObjects;
import PageObjects.TeamTypePageObjects;
import PageObjects.UserCreationPageObjects;


@SuppressWarnings("unused")
@Listeners({AdminModuleTestScripts.Itestlistners.class})
public class AdminModule extends TestBase{
	
	public SignInPageObjects sign ;
	public UserCreationPageObjects User;
	public TeamTypePageObjects Type;

	// User Creation
	@Test(priority=0,description="This testcase verifies to create a User",enabled=true)
	public void CreateUser() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		User= new UserCreationPageObjects(driver);
		User.clickOnUsers();
		User.selectPerson(Constants.Person3);
		User.selectPersona(Constants.Persona3);
		User.clickOnEmails();
		Thread.sleep(3000);
		User.selectPreference(Constants.PreferenceDay1);

}
	// Team Type Creation
	@Test(priority=1,description="This testcase verifies to create a TeamType",enabled=true)
	public void CreateTeamType() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		Type= new TeamTypePageObjects(driver);
		Type.clickEnterDetails(Constants.Name1,Constants.Description1);
	}
}

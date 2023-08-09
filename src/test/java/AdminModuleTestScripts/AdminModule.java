package AdminModuleTestScripts;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.TestBase;
import basepackage.TestAction;
import Utilities.Constants;
import Utilities.ExpectedValue;
import PageObjects.LocationPageObjects;
import PageObjects.MapCountryLocationPageObjects;
import PageObjects.RunNightJobsPageObjects;
import PageObjects.SignInPageObjects;
import PageObjects.TeamLevelPageObjects;
import PageObjects.TeamTypePageObjects;
import PageObjects.UserCreationPageObjects;


@SuppressWarnings("unused")
@Listeners({AdminModuleTestScripts.Itestlistners.class})
public class AdminModule extends TestBase{
	
	public SignInPageObjects sign ;
	public UserCreationPageObjects User;
	public TeamTypePageObjects Type;
	public TeamLevelPageObjects Level;
	public RunNightJobsPageObjects RunJob;
	public MapCountryLocationPageObjects MapCountryLocation;
	public LocationPageObjects Location;

	// User Creation
	
	@Test(priority=0,description="This testcase verifies to create a User",enabled=true)
	public void CreateUser() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		User= new UserCreationPageObjects(driver);
		User.clickOnUsers();
		User.selectPerson(Constants.Person4);
		User.selectPersona(Constants.Persona3);
		User.clickOnEmails();
		User.selectPreference(Constants.PreferenceDay1);

        }
	
	// Team Type Creation
	
	@Test(priority=1,description="This testcase verifies to create a TeamType",enabled=true)
	public void CreateTeamType() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		Type= new TeamTypePageObjects(driver);
		Type.clickEnterDetails(Constants.Name1,Constants.Description1);
		//Type.clickEditDetails(Constants.Name2,Constants.Description2);
	    }
	
	// Team Level Creation
	
		@Test(priority=2,description="This testcase verifies to create a TeamLevel",enabled=true)
		public void CreateTeamLevel() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		Level= new TeamLevelPageObjects(driver);
		Level.clickEnterDetails(Constants.LevelName1);
		Assert.assertEquals(ExpectedValue.levelnumberText,Level.isLevelNumberTextDisplayed());
		}
		
	// Run Jobs
		
		@Test(priority=3,description="This testcase verifies to run jobs",enabled=true)
		public void RunJob() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		RunJob= new RunNightJobsPageObjects(driver);
		RunJob.clickOnimportpersondata();
		Thread.sleep(3000);
		RunJob.selectjob(Constants.Jobs);
		RunJob.clickOnprocessimportdata();
		Thread.sleep(3000);
		}
		
	// Map Country Location
		
		@Test(priority=4,description="This testcase verifies to map country location",enabled=true)
		public void MapCountryLocation() throws InterruptedException  {
		sign= new SignInPageObjects(driver);
		sign.adminsign();
		MapCountryLocation= new MapCountryLocationPageObjects(driver);
		MapCountryLocation.clickOnmapcountrylocation();
		MapCountryLocation.selectCountry(Constants.Country1);
		MapCountryLocation.selectLocation(Constants.Location1);
		MapCountryLocation.clickOnsubmit();
	    }
		
		// Location Creation
		
		@Test(priority=5,description="This testcase verifies to create a location",enabled=true)
		public void CreateLocation() throws InterruptedException  {
			sign= new SignInPageObjects(driver);
			sign.adminsign();
			Location= new LocationPageObjects(driver);
			Location.clickenterDetails(Constants.LocationName1,Constants.LocationDescription1);
}
}

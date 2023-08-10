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
import PageObjects.ActionDescriptionPageObjects;
import PageObjects.DefaultRateCardPageObjects;
import PageObjects.LocationPageObjects;
import PageObjects.MapCountryLocationPageObjects;
import PageObjects.NotificationPageObjects;
import PageObjects.RunNightJobsPageObjects;
import PageObjects.SeniorityLevelPageObjects;
import PageObjects.ServiceProviderPageObjects;
import PageObjects.SignInPageObjects;
import PageObjects.TeamLevelPageObjects;
import PageObjects.TeamTypePageObjects;
import PageObjects.UserCreationPageObjects;


@SuppressWarnings("unused")
@Listeners({AdminModuleTestScripts.Itestlistners.class})
public class AdminModule extends TestBase{
	
	public SignInPageObjects SignIn;
	public UserCreationPageObjects User;
	public TeamTypePageObjects TeamType;
	public TeamLevelPageObjects TeamLevel;
	public RunNightJobsPageObjects RunJob;
	public MapCountryLocationPageObjects MapCountryLocation;
	public LocationPageObjects Location;
	public SeniorityLevelPageObjects SeniorityLevel;
	public DefaultRateCardPageObjects DefaultRateCard;
	public ServiceProviderPageObjects ServiceProvider;
	public NotificationPageObjects Notification;
	public ActionDescriptionPageObjects ActionDescription;

	// User Creation
	
	@Test(priority=0,description="This testcase verifies to create a User",enabled=true)
	public void CreateUser() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
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
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		TeamType= new TeamTypePageObjects(driver);
		TeamType.clickEnterDetails(Constants.Name1,Constants.Description1);
		//Type.clickEditDetails(Constants.Name2,Constants.Description2);
	    }
	
	// Team Level Creation
	
		@Test(priority=2,description="This testcase verifies to create a TeamLevel",enabled=true)
		public void CreateTeamLevel() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		TeamLevel= new TeamLevelPageObjects(driver);
		TeamLevel.clickEnterDetails(Constants.LevelName1);
		Assert.assertEquals(ExpectedValue.levelnumberText,TeamLevel.isLevelNumberTextDisplayed());
		}
		
	// Run Jobs
		
		@Test(priority=3,description="This testcase verifies to run jobs",enabled=true)
		public void RunJob() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		RunJob= new RunNightJobsPageObjects(driver);
		RunJob.clickOnimportpersondata();
		Thread.sleep(3000);
		RunJob.selectjob(Constants.Jobs);
		RunJob.clickOnprocessimportdata();
		Thread.sleep(3000);
		}
		
	// Map Country Location Creation
		
		@Test(priority=4,description="This testcase verifies to map country location",enabled=true)
		public void MapCountryLocation() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		MapCountryLocation= new MapCountryLocationPageObjects(driver);
		MapCountryLocation.clickOnmapcountrylocation();
		MapCountryLocation.selectCountry(Constants.Country1);
		MapCountryLocation.selectLocation(Constants.Location1);
		MapCountryLocation.clickOnsubmit();
	    }
		
	// Location Creation
		
		@Test(priority=5,description="This testcase verifies to create a location",enabled=true)
		public void CreateLocation() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		Location= new LocationPageObjects(driver);
		Location.clickenterDetails(Constants.LocationName1,Constants.LocationDescription1);
        }
		
	// Seniority Level Creation
		
		@Test(priority=6,description="This testcase verifies to create a seniority level",enabled=true)
		public void CreateSeniorityLevel() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		SeniorityLevel= new SeniorityLevelPageObjects(driver);
		SeniorityLevel.enterseniorityname(Constants.SeniorityName1);
		SeniorityLevel.selectexpereince(Constants.Expereince2);
		}
		
	// Default Rate Card Creation
		
		@Test(priority=7,description="This testcase verifies to create a default rate card",enabled=true)
		public void CreateDefaultRateCard() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		DefaultRateCard= new DefaultRateCardPageObjects(driver);
		DefaultRateCard.clickdetails();
		DefaultRateCard.selectlocation(Constants.DefaultLocation1);
		DefaultRateCard.selectseniority(Constants.DefaultSeniority1);
		//DefaultRateCard.selectrole(Constants.Role1);
		DefaultRateCard.enterrate(Constants.Rate1);
		}
		
	// Service Provider Creation
		
		@Test(priority=8,description="This testcase verifies to create a service provider",enabled=true)
		public void CreateServiceProvider() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		ServiceProvider= new ServiceProviderPageObjects(driver);
		ServiceProvider.clickenterdetails(Constants.ServiceProviderName1, Constants.URL1, Constants.SPDescription1);
		}


   // Notification Creation

		@Test(priority=9,description="This testcase verifies to create a notification alerts",enabled=true)
		public void CreateNotification() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		Notification= new NotificationPageObjects(driver);
		Notification.Notificationenterdetails(Constants.Reminder1, Constants.Escalation1, Constants.Frequency1);
		}
		
	// Action Description Creation
		
	    @Test(priority=10,description="This testcase verifies to create a action description",enabled=true)
		public void CreateActionDescription() throws InterruptedException  {
		SignIn= new SignInPageObjects(driver);
		SignIn.adminsign();
		ActionDescription= new ActionDescriptionPageObjects(driver);
		ActionDescription.clickactiondetails();
		ActionDescription.selectcategory(Constants.Category1);
		ActionDescription.selectdate(Constants.Date1);
		ActionDescription.enteroverdue(Constants.Overdue1, Constants.ActionDescription1);
		}
}

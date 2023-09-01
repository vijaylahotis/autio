package Utilities;

import java.security.SecureRandom;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import basepackage.TestAction;

@SuppressWarnings("unused")
public class Constants extends TestAction{
	public Constants(WebDriver driver) {
	super(driver);
	}
	
	// Login Credentials
	
	public static final String URL = "https://dev.talentsavvy.com/login";
	public static final String adminEmail = "tony@bsaas.us";
	public static final String adminPassword = "P99Soft.com";
	
	// User Creation
	
	public static final String Person1 = "Shaheed Khan";
	public static final String Person2 = "Krishna Kumar";
	public static final String Person3 = "Vikram Khot";
	public static final String Person4 = "Tina Fey";
	public static final String Persona1 = "Hiring Manager";
	public static final String Persona2 = "IT Leadership";
	public static final String Persona3 = "Admin";
	public static final String PreferenceDay1 = "Monday";
	public static final String PreferenceDay2 = "Tuesday";
	public static final String PreferenceDay3 = "Wednesday";
	
	// Team type
	
	public static final String Name1 = "Devops";
	public static final String Description1 = "Creating a new team type";
	public static final String Name2 = "IT Leaders";
	public static final String Description2 = "Modifying existing team type";
	
	// Team level
	
	public static final String LevelName1 = "Corporate";
	
	// Run Jobs
	
	public static final String Jobs = "Process Import Data";
	
	// Map Country Location
	
	public static final String Country1 = "Canada";
	public static final String Country2 = "Argentina";
	public static final String Country3 = "Afganistan";
	public static final String Location1 = "Onshore";
	public static final String Location2 = "Nearshore";
	public static final String Location3 = "Offshore";
	public static final String Location4 = "Midshore";
	
	// Location
	
	public static final String LocationName1 = "Midshore";
	public static final String LocationDescription1 = "Midshore";
	public static final String LocationName2 = "Farshore";
	public static final String LocationDescription2 = "Farshore";
	
	// Seniority Level
	
	public static final String SeniorityName1 = "Fresher";
	public static final String SeniorityName2 = "Associate";
	public static final String Expereince1 = "1";
	public static final String Expereince2 = "15";
	
	// Default Rate Card
	
	public static final String DefaultLocation1 = "Onshore";
	public static final String DefaultLocation2 = "Offshore";
	public static final String DefaultSeniority1 = "Fresher";
    public static final String DefaultSeniority2 = "Senior";
    public static final String Role1 = "Java Developer";
	public static final String Role2 = "QA";
	public static final String Rate1 = "10000";
	public static final String Rate2 = "8000";
	
	// Service Provider
	
	public static final String ServiceProviderName1 = "CTS";
	public static final String ServiceProviderName2 = "Tech Mahindra";
	public static final String SPDescription1 = "";
	public static final String SPDescription2 = "Service Provider";
	public static final String URL1 = "www.cts.com";
	public static final String URL2 = "www.techmahindra.com";
	
	// Notification
	
	public static final String Reminder1 = "CTS";
	public static final String Escalation1 = "CTS";
	public static final String Frequency1 = "CTS";
	
	// Action Description
	
	public static final String Category1 = "Update Team Member";
	public static final String Category2 = "New Roll-off";
	public static final String Category3 = "Start Date Passed";
	public static final String Date1 = "Created Date";
	public static final String Overdue1 = "4";
	public static final String Overdue2 = "8";
	public static final String ActionDescription1 = "Contractor @target.ContractorName rolled off from Azure AD";
	public static final String ActionDescription2 = "Contractor @target.ContractorName rolled off from Azure AD on @source.DownloadDate";
	
	// Team
	
	public static final String Teamlevel1 = "5 - Corporate";
	public static final String Teamlevel2 = "3 - Business Unit";
	public static final String Parentteam1 = "Finance";
	public static final String Parentteam2 = "Global Enterprise";
	public static final String Teamname1 = "Team-ABCD";
	public static final String Teamname2 = "Team-AFMFO";
	public static final String PM1 = "Name LAJ";
	public static final String Teamleader1 = "Ana de Armas";
	public static final String Teamleader2 = "Dora Samuels";
	public static final String Teamtype1 = "Grow";
	public static final String Teamtype2 = "Run";
	public static final String Date = "30";
	
	
	
}
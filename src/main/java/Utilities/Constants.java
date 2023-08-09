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
	public static final String adminEmail = "nagendra@bsaas.us";
	public static final String adminPassword = "P99Soft.com";
	
	// User Creation
	
	public static final String Person1 = "Shaheed Khan";
	public static final String Person2 = "Krishna Kumar";
	public static final String Person3 = "Vikram Khot";
	public static final String Person4 = "F-009 L-009";
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
}
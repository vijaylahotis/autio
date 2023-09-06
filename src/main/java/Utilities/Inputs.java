package Utilities;

import java.security.SecureRandom;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import basepackage.TestAction;

@SuppressWarnings("unused")
public class Inputs extends TestAction{
	public Inputs(WebDriver driver) {
	super(driver);
	}
	
	// Hiring Manager Login Credentials
	
	    public static final String URL = "https://dev.talentsavvy.com/login";
	    public static final String HiringEmail = "krishna@bsaas.us";
	    public static final String HiringPassword = "P99Soft.com";
	
	// Team Selection
	
	    public static final String ParentTeam1 = "Lending";
        public static final String ParentTeam2 = "Deposits";
	    public static final String Group1 = "Lending";
	    public static final String Group2 = "Deposits";
		public static final String TeamLeader1 = "Mahesh Babu";
		

		
	// Member Selection	
		
		public static final String teamname = "Team-A6";
		public static final String teamname1 = "Team-A7";
		public static final String Position1 = "Java Developer";
		public static final String Member1 = "AA 01";
		public static final String Position2 = "React Developer";
		public static final String Member2 = "AA 02";
		
		
	// Azure Login Credentials
		
		public static final String AzureURL = "https://portal.azure.com/";
		public static final String AzureEmail = "tony@bsaas.us";
		public static final String AzurePassword = "P99Soft.com";
	
		
   // Azure User Creation
		
		public static final String HireDate= "6";		
		public static final String EmployeeType = "Contractor";
		public static final String Manager = "Krishna";
		
		
   // Admin Login Credentials
		
		public static final String adminURL = "https://dev.talentsavvy.com/login";
		public static final String adminEmail = "tony@bsaas.us";
		public static final String adminPassword = "P99Soft.com";
		
		
   // Update Details
		
		public static final String StartDate = "8";
		public static final String Provider = "TCS";
	
		
   // Confirm Roll Off
		
		public static final String Rolloffdate = "6";
		public static final String Reason = "Natural";
		
}

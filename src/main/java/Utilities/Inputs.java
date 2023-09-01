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
	
	// Login Credentials
	
	    public static final String URL = "https://dev.talentsavvy.com/login";
	    public static final String HiringEmail = "mahesh@bsaas.us";
	    public static final String HiringPassword = "P99Soft.com";
	
	// Team
	
	    public static final String ParentTeam1 = "Lending";
        public static final String ParentTeam2 = "Deposits";
	    public static final String Group1 = "Lending";
	    public static final String Group2 = "Deposits";
		public static final String TeamLeader1 = "Mahesh Babu";
		public static final String TeamLeader2 = "Dora Samuels";

		
	// Member Selection	
		
		public static final String teamname = "Team-A8";
		public static final String Position1 = ".Net Developer";
		public static final String Member1 = "AA 01";
		public static final String Position2 = "Java Developer";
		public static final String Member2 = "AA 02";
		public static final String teamname1 = "Team-A9";
		
	
	
   // Update Details
		
		public static final String StartDate = "8";
		public static final String Provider = "TCS";
		
   // Azure User Creation
		
		public static final String EmployeeType = "Contractor";
		public static final String Manager = "Mahesh";
		
   // Roll Off
		
		public static final String Rolloffdate = "1";
		public static final String Reason = "Natural";
		
}

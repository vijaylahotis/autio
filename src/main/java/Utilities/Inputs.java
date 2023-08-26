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
	 
	    public static final String Group1 = "Lending";
	    public static final String Group2 = "Deposits";
		public static final String TeamLeader1 = "Ana de Armas";
		public static final String TeamLeader2 = "Dora Samuels";
		public static final String TeamType1 = "Grow";
		public static final String TeamType2 = "Run";
		
	// Member Selection	
		
		public static final String Position1 = "Java Developer";
		public static final String Member1 = "A-01 B-01";
		public static final String Position2 = "React Developer";
		public static final String Member2 = "A-02 B-02";
		public static final String Member3 = "A-03 B-03";
		
   // Actions
		
		public static final String Actions1 = "C450 Contractor";
		public static final String Actions2 = "A-02 B-02";
		public static final String Actions3 = "null null onboarded in Azure AD on @source.HireDate. Please assign null null to one of your teams";
		
	
	
   // New hire assign
		
		public static final String Country = "United States";
		public static final String Provider = "TCS";
		
   // Azure User Creation
		
		public static final String EmployeeType = "Contractor";
		public static final String Manager = "Mahesh";
		
}

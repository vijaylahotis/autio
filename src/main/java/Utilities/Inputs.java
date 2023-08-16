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
	
	// Team
	 
	    public static final String Group1 = "Lending";
	    public static final String Group2 = "Deposits";
		public static final String TeamLeader1 = "Ana de Armas";
		public static final String TeamLeader2 = "Dora Samuels";
		public static final String TeamType1 = "Grow";
		public static final String TeamType2 = "Run";
		
	// Member Selection	
		
		public static final String Position1 = "Analyst";
		public static final String Member1 = "Anatoli Abadd";
		public static final String Position2 = "QA";
		public static final String Member2 = "C-003 Contractor";
		
   // Actions
		
		public static final String Actions1 = "C450 Contractor";
		public static final String Actions2 = "F-999 L-002";
		public static final String Actions3 = "Aantony Dsouza onboarded in Azure AD on @source.HireDate. Please assign Aantony Dsouza to one of your teams";
		
		public static final String TeamSelect = "SQA Team1";
		public static final String PositionSelect = "Scrum Master";
	
   // New hire assign
		
		public static final String Country = "United States";
		public static final String Provider = "TCS";
		
}

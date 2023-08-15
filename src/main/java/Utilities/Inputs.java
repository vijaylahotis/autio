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
	    public static final String TeamName1 = "SQA Team1";
	    public static final String TeamName2 = "QC Team";
		public static final String TeamName3 = "Architect Team";
		public static final String TeamLeader1 = "Ana de Armas";
		public static final String TeamLeader2 = "Dora Samuels";
		public static final String TeamType1 = "Grow";
		public static final String TeamType2 = "Run";
		
		public static final String Position1 = "Analyst";
		public static final String Member1 = "C-002 Contractor";
		public static final String Position2 = "QA";
		public static final String Member2 = "C-003 Contractor";
		
		public static final String Actions1 = "C450 Contractor";
		public static final String Actions2 = "F-999 L-001";
		public static final String Actions3 = "Sarfraz Khan onboarded in Azure AD on @source.HireDate. Please assign Sarfraz Khan to one of your teams";
		
		public static final String TeamSelect = "SQA Team1";
		public static final String PositionSelect = "Scrum Master";
		
}

package Utilities;

import java.security.SecureRandom;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import basepackage.TestAction;

@SuppressWarnings("unused")
public class AzureInputs extends TestAction{
	public AzureInputs(WebDriver driver) {
	super(driver);
	}
	
	// Login Credentials
	
		public static final String AzureURL = "https://portal.azure.com/";
		public static final String AzureEmail = "tony@bsaas.us";
		public static final String AzurePassword = "P99Soft.com";

    // Azure User Creation
		
		public static final String EmployeeType = "Contractor";
		public static final String Manager = "Mahesh";
	}


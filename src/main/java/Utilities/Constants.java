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
	
	public static final String URL = "https://dev.talentsavvy.com/login";
	public static final String adminEmail = "nagendra@bsaas.us";
	public static final String adminPassword = "P99Soft.com";
	
	//User Creation
	
	public static final String Person1 = "Shaheed Khan";
	public static final String Person2 = "Krishna Kumar";
	public static final String Person3 = "Vikram Khot";
	public static final String Persona1 = "Hiring Manager";
	public static final String Persona2 = "IT Leadership";
	public static final String Persona3 = "Admin";
	public static final String PreferenceDay1 = "Monday";
	
	//Team type
	
	public static final String Name1 = "Devops";
	public static final String Description1 = "Creating team type";
}
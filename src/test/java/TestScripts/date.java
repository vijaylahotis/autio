package TestScripts;

import java.time.LocalDate;


public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get the current date
		LocalDate currentDate = LocalDate.now();
	    System.out.println("Current Date: " + currentDate);
	    String newDate = "currentDate.plusDays(1)";
	    LocalDate newDate1 = currentDate.plusDays(1);
	    System.out.println("New Date (+1 day): " + newDate1);
	}

}

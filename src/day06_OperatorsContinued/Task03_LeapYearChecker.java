package day06_OperatorsContinued;

public class Task03_LeapYearChecker {

	public static void main(String[] args) {
	// Leap Year Checker:
	// Create a Java program that checks whether a given year is a leap year
	//  or not. Use the Modulus operator to determine of the year is divisible 
	//   by 4 but not 100 and not 400.	

		
		int year = 1960;
		
		boolean leapYear = year % 4 == 0 && year % 100 != 0 && year % 400 != 0;
		
		System.out.println(leapYear);
	}

}

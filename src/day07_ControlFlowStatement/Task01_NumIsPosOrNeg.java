package day07_ControlFlowStatement;

public class Task01_NumIsPosOrNeg {

	public static void main(String[] args) {
		
// Write a Java program that takes an integer input from the user and uses 
	// an if statement to check if it is positive or negative
		
		int number = -1;
		
		if (number <= 0) {
			System.out.println("The number "+number +" is Negetive");
		}else {
		 System.out.println("The number " +number + " is positive");
		
		 //else has been omitted in the following statement
		}
		if(number < 0) {
			System.out.println("The number "+number +" is Negetive");
			
		}
		if (number >= 0){
		System.out.println("The number " +number + " is positive");
		}
	}
	
	
	

}

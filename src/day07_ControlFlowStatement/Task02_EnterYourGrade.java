package day07_ControlFlowStatement;

import java.util.Scanner;

public class Task02_EnterYourGrade {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		char grade = 'A';
			scan.next();
		
		
		

		
		switch (grade){
		
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Good Job");
			break;
		case 'C':
			System.out.println("You can do better");
			break;
		case 'D':
			System.out.println("You need to work harder");
			break;
		case 'F':
			System.out.println("You failed");
			break;
		}
			
		
	}

}

package day07_ControlFlowStatement;

public class StudentGrades {

	public static void main(String[] args) {
		
		char grade = 'A';
		switch (grade) {
		case 'A':
		case 'B':
		case 'c':
		case 'D':
			System.out.println("PASS");
			break;
		case 'W':
			System.out.println("Withdraw");
			break;
		case 'I' :
			System.out.println("Incomplete");
		break;
		default:
			System.out.println("FAIL");
		}
		
		
		
		
		
	}

}

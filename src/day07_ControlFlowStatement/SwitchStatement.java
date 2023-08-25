package day07_ControlFlowStatement;

public class SwitchStatement {

	public static void main(String[] args) {
// you can have multiple statements (println) within each case
// if default block not included nothing will print if there is no match
// you can have multiple cases before a break if the cases result the same		
		
		int day = 8;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("You must enter a valid number between 1 and 7");

		}

	}

}

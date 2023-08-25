package day10_DoWhileLoopAndForLoop;

public class WhileLoopReview {

	public static void main(String[] args) {
		
		int num = 0;
		
		if (num < 5) 
		System.out.println(num);// if statement will execute one time
		if (num < 5) {
			System.out.println(num);
		num = 10;
		}
		System.out.println(num);
		
		while (num < 5) {
			
		}
		while (num > 5) {
			System.out.println(num);
			num--; // exit from loop when condition is no longer true
		}
	}
}

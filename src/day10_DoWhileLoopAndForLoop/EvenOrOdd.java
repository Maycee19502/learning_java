package day10_DoWhileLoopAndForLoop;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+ " is an even number");
			
			
		}else {
			System.out.println(num + " is an odd number");
		}
		
		scan.close();

	}

}

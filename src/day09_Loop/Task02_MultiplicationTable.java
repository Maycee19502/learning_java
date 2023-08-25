package day09_Loop;

public class Task02_MultiplicationTable {

	public static void main(String[] args) {
		
//Multiplication Table
// Generate and print the multiplication table (up to 10) of a given number using a while loop.
		
		int num = 10;
		int num2 = 4;
		while(num2 <= 10) {
			System.out.println(num +" * "+ num2+ " = "+ num * num2);
			num2++;
		}

	}

}

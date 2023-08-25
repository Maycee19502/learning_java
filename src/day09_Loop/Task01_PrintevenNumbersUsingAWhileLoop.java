package day09_Loop;

public class Task01_PrintevenNumbersUsingAWhileLoop {

	public static void main(String[] args) {
		
		//Print Even Numbers
		//Write a program that uses a while loop to print all numbers between 1 and 50
		
		int num = 0;
		while (num <=50) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}
		//write a program to display if a number is even or odd 
		int num1 = 5;
		if (num1% 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
		
		
		
		
	}

}

package day09_Loop;

public class task03_FactorialCalculationUsingWhileLoop {

	public static void main(String[] args) {
		
	//Factorial calculation
	//Create a program to calculate and print the factorial of a given positive integer
	//using a while Loop
		
		
		
		
		
		int result = 1;
		int factorialNum = 15;
				
		
		while(factorialNum>=1) {
			//System.out.println(factorialNum);
			result *= factorialNum;
			factorialNum--;
		}
			System.out.println(result);
	
	}

}

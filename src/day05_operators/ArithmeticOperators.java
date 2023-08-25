package day05_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
// 	 + , - , * , /, % , ++ , --

		int a = 10;
		int b = 5;
		int c = 3;
		System.out.println(a+b); //15
		
		int result = a + b;
		System.out.println(result);//15
		int result2 = a + b + c;
		// or
		//int result2 = result + c; prints the same results
		System.out.println(result2); //18
		
		double d = 9.9;
		System.out.println(a + d); //19.9
		
		double result3 = (a + d); //if result you want to store is a decimal 
									//select double as the datatype
		System.out.println(result3); //19.9
		
		// subtraction (-) /// java version
		
		System.out.println(a - b - c);//  2
		System.out.println(c - a);// -7
		
		int x = 25;
		int y = 5;
		System.out.println(x * y);
		int result4 = x * y;
		System.out.println(result4);
		
		System.out.println(x / y);
		int result5 = x/ y;
		System.out.println(result5);
		
		//Remainder
		
		System.out.println(x%y); //0
		System.out.println(a%b); //0
		System.out.println(c%a); //3
		System.out.println(10 % 3); //1
		System.out.println(10 % 2); //0
		System.out.println(10 % 4); //2
	}
	

}

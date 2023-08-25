package day05_operators;

public class HomeworkReview {
	public static void main(String[] args) {
		
		//homework task #7-write a program to swap 2 numbers without 
		// using a temporary variable. 
		//iput:
		// int x = 10;
		// int y = 20;
		//output:
		// int x = 20;
		// int y = 10;
		
		
		int x = 7;
		int y = 2;
		x = x + y;//9
		y = x - y;//7
		x = x - y;//2		
System.out.println("x= "+x);
System.out.println("y= " +y);


//example #2 w/o temporary variable

	int num1 = 4;
	int num2 = 7;
	num1 = num1 + num2; //14
	num2 = num1 - num2; //5
	num1 = num1 - num2;// 9
	 System.out.println("num1="+ num1);
	 System.out.println("num2= "+num2);
// swap two variables using a temporary variable
	int a = 30;
	int b = 40;
	System.out.println("a="+a); //30
	System.out.println("b="+b); //40
	int c = a;
	System.out.println("c=" +c); //30
	a = b;
	b = c;
	System.out.println("a="+ a);
	System.out.println("b="+ b);











	}

}

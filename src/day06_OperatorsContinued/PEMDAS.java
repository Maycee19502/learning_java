package day06_OperatorsContinued;

public class PEMDAS {

	public static void main(String[] args) {
		
		
//	PEMDAS (Parenthesis,Exponents, Multiplication, Division, Add, Subtract) order.
//	When there are multiple instances if the same precedence, 
//   Java reads from left to right.		
		
		
	int a = 1;
	int b = 2;
	int c = 3;
	
	int result1 = a + b - c;
	System.out.println(result1); //0
	
	result1 = a + (b - c);
	System.out.println(result1); //0	
	
	result1 = a + b * c;
	System.out.println(result1); //7
	
	result1 = a + (b*c)/2;
	System.out.println(result1); //4
		
		
		
	}

}

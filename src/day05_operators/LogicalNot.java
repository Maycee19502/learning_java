package day05_operators;

public class LogicalNot {

	public static void main(String[] args) {
		
//	  Logical Not (!)
	 // if the value is true, it makes the  result  NOT TRUE (false)		
	 //	if the value is false, it makes the result NOT FALSE (True)
		
		
		boolean result = true;
		
		System.out.println(result); // will run true
		System.out.println(!result);// will run false because the exclamation 
		 							//  mark tells it is not true
		
		boolean result2 = false;
		System.err.println(result2); // will run false 
		System.err.println(!result2); //will run not false (true)
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a + b == c); //true
		System.err.println(! ( a + b == c)); // false (NOT true)
		

	}

}

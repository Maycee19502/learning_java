package day05_operators;

public class RelationalOperators {
 public static void main(String[] args) {
	
 
	// == , > , >=, < , <= , !=
	// relational operators will return boolean
	
	int a = 2;
	int b = 3;
	int c = 5;
	
	System.out.println(a == b); //false a is not equal to b
	
	int d = a + b; // 5
	
	System.out.println(d == c);//true
	
	boolean result = a + b == c; 
	
	System.out.println(result);//true
	
	/// ! = NOT EQUAL
	
	System.out.println(a != c); //true
	System.out.println(d != c); //false
	
	a = 1;
	b = 2;
	c = 3;
	 
	System.out.println(a >= b); //false
	System.out.println(a + b >= c); //True
	 boolean result2 = a <= c; 
	 System.out.println(result2); //true
	 
	 System.out.println(a * b >= c); //false
	  
	 System.out.println(a + b + c < c + b); //false
	 
	 System.out.println(a + b + c <= c * b); //true
	
	}
	
	
	
	
	
	
}

package day06_OperatorsContinued;

public class LogicalOr {

	public static void main(String[] args) {
		
		//Logical OR (||) if either condition is True the result will be true
		
//		condition1 	condition2 	Result
		
	//	true		true		true
	//  true		false		true
	//  false		true 		true
	//	false		false		false
		
		
	int a = 1;
	int b = 2;
	int c = 3;
	
	boolean result = a > b || a + b == c;
	
	System.out.println(result);
	
	result = a * b <= c || c < a || c < b;
	
	System.out.println(result);
	
	boolean conditionA = false;
	boolean conditionB = false;
	boolean conditionC = false;
	boolean conditionD = false;
	boolean conditionE = a < b;//----> this statement is true,
		//therefore the whole thing true
		result = conditionA || conditionB || conditionC || conditionD;
	boolean conditionF = c < a;
	
	result = conditionA || conditionB || conditionC || conditionD && conditionF;
//	This statement will return false because conditionF is false and 
//  	LOGICAL OPERATION "AND" was used with LOGICAL OPERATION "OR"
		
	System.out.println(result);
		
		
		
		
		
	}

}

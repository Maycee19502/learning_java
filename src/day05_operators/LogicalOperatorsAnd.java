package day05_operators;

public class LogicalOperatorsAnd {

	public static void main(String[] args) {
		
// AND (&&) OR (||) NOT (!)
		
// AND statements - all of the conditions must be true		
		
//		condition1 	condition2 	Result
	
	//	true		true		true
	//  true		false		false
	//  false		true 		false
	//	false		false		false
		
		boolean condition1 = true;
		boolean condition2 = true;
		boolean condition3 = false;
		
		System.out.println(condition1 && condition2);
		
		System.out.println(condition1 && condition2 && condition3);
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a < b && a + b == c);
		System.out.println(a < b && a  * b ==c);
		System.out.println(a < b && a + b >= c);
		
		
		
				
	}

}

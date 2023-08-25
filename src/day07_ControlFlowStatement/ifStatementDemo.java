package day07_ControlFlowStatement;

public class ifStatementDemo {

	public static void main(String[] args) {
		
//syntax:
//	condition is always boolean --> true or false	
//	if (condition) { if condition is true it will run the true block 
//  if its false it will run False block (else)		
// }else {	
// If the first condition is true it will stop and run the first block. however 
// if its false, it will move to the next block until the condition is true or 
// until else statement is reached	
// If "else" part is omitted and the expression after "if" is false, no action occurs.		
		int num = 2;
		 
		if (num > 3) {
			System.out.println(num + " is greater than 3");
		}else {
			System.out.println(num + " is less than 3");
			
			// even or odd
		
		long num2 = 56;
		if(num2 % 2 == 0) {
			System.out.println("The " + num2 + " number is even!");
		}else {
			System.out.println("The "+num2 + " number is odd!");
			
		}
			int count = 12;
			int total = 4;
			
			if (count<3) {
				total = 0;
				
			}else {
				total += count;
				
			}
			System.out.println("value of total is equal to "+ total);
		}
			
		}
		
	
		
		
		
		
	

}

package day09_Loop;

public class IfStatementReview {

	public static void main(String[] args) {
		
		int value = 10;
		
		if (value < 10) {
			System.out.println("Hello");
			
		}else {
			System.out.println("hi");
		}
		System.out.println("print line 15");
		
	// If you only have one statement you do not need curly braces
		if (value > 1)  
			System.out.println("Hello");
			
		else
			System.out.println("hi");
	System.out.println("-----------------------------");	
		System.out.println("print line 24");
		
		int y = 5;
		if (y < 5) {
			System.out.println("print line 28");//will not print anything because Y !< 5
				
		}
		System.out.println("-----------------------------");	
		if (y < 1)
			System.out.println("print line 33");// will not print because y !< 1
		if (y < 1);// <----do NOT put semicolon
		System.out.println("print line 35");// even though y !< 1, it WILL print because 
											// if statement was ended with a semicolon		
		System.out.println("-----------------------------");	
		
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("one");
		//	break; <---If break statement is not included, program will run (and print) 
			//through all cases regardless if statement is true or not
			
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
		}
	}

}

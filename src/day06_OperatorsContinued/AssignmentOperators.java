package day06_OperatorsContinued;

public class AssignmentOperators {

	public static void main(String[] args) {
		
// 		Assignment Operators
// 		= , += , -=, *= , /=		
		
		int a = 5;
		
		a = a + 5; // is the exact same a a += 5;
		
		System.out.println(a); //10

		a += 5;
		
		System.out.println(a); //15
		
		a += 5;
		a += 5;
		a += 5;
		
		System.out.println(a); //30
		
		a++;
		
		System.out.println(a); //31
		
		a -= 2;
		
		System.out.println(a); //29
		
		a -= 19;
		
		System.out.println(a); //10
		
		a--;
		
		System.out.println(a); //9
		
		a *= 10;
		System.out.println(a); // 90
		
		a /= 9; // 10
		System.out.println(a); // 10
		
		// To find the last digit
		
		int num = 59;
		int lastDigit = num % 10;
		
		System.out.println(lastDigit);
		
		//To find the first digit
		
		int firstDigit = num / 10;
		
		System.out.println(firstDigit);
		
//		swap number 25 for 52
		
		
		int num1 =25;
		int digit2 = num1 % 10; //5
		System.out.println(digit2);
		int digit1 = num1 / 10; //2
		
		int reverseDigit = digit2*10+digit1;
		System.out.println(reverseDigit);
		

	
	}

}

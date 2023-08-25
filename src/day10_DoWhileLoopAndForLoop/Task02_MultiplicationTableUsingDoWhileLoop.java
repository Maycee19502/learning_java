package day10_DoWhileLoopAndForLoop;

public class Task02_MultiplicationTableUsingDoWhileLoop {

	public static void main(String[] args) {
		
		
		int num1 = 1;
		int num2 = 1;
		
			do {
				System.out.println(num1 + " * " + num2 + " = " +num1 * num2);
			num2++;
			}
			while (num2 <= 10);
	
}
}
package day10_DoWhileLoopAndForLoop;

public class DoWhile {

	public static void main(String[] args) {

		int i = 0;

		do {
			System.out.println(i); // code block will run at least once in a do while loop
			// regardless if the condition (while loop) is true or false
			i++; // <---must include to stop the loop from running indefinitely
		} while (i < 0);
		System.out.println("value of i is " + i);

		int a = 10;
		do {
			System.out.println(a);
			a--;
		} while (a > 1);

	}

}

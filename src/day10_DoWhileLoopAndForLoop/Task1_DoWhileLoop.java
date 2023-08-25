package day10_DoWhileLoopAndForLoop;

public class Task1_DoWhileLoop {

	public static void main(String[] args) {

		int evenNum = 1;

		do {
			if (evenNum % 2 == 0) {
				System.out.println(evenNum);

			}
			evenNum++;
		} while (evenNum <= 50);

	}

}

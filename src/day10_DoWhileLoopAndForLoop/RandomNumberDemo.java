package day10_DoWhileLoopAndForLoop;

import java.util.Random;

public class RandomNumberDemo {

	public static void main(String[] args) {
		
		Random random = new Random(); //creating object of random class
		
		System.out.println(random.nextInt(10));// 0 - 10
		
		System.out.println(random.nextInt(100));// 0-100
		
		int secretNumber = random.nextInt(100); // assign random number to a variable
		
		System.out.println(secretNumber);
	}

}

package day10_DoWhileLoopAndForLoop;

import java.util.Random;
import java.util.Scanner;

public class Task04_DoWhileNumGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();

		int SecretNum = random.nextInt(5);

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to number guessing game.");

		System.out.println("Guess a number between 0 and 5");
		int guessedNum;

		do {

			guessedNum = scan.nextInt();

			if (guessedNum > SecretNum) {
				System.out.println("Too high. Try again");

			} else if (guessedNum == SecretNum) {
				System.out.println("Way to go! You guessed my Secret Number");

			} else {
				System.out.println("Too low. Try again");
			}

		} while (guessedNum != SecretNum);

		scan.close();

	}

}

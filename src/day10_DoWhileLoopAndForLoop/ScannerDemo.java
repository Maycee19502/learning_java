package day10_DoWhileLoopAndForLoop;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String name = scan.next();
		
		System.out.println("Hello "+ name);
		
		System.out.println("how old are you?");
		
		int age = scan.nextInt();		
		scan.close();
		
		System.out.println(name + " is " + age + " years old");
	}

}

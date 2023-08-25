package day14_StringDayTwo;

import java.util.Scanner;

public class String_EqualMessage {

	public static void main(String[] args) {
		
String word1 = "hello";
String word2 = "Hello";

	System.out.println(word1 == word2);// dont use this 
	System.out.println(word1.equals(word2));
	System.out.println(word1.equalsIgnoreCase(word2));
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a word");
	String str = scan.next();
	System.out.println("Enter second word");
	String str2 = scan.next();
	System.out.println(str==str2);// Do NOt use. returns false info
	
	System.out.println(str.equals(str2));
	
	
	scan.close();
	}

}

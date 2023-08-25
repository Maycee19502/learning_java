package day13_NestedLoop;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		
//      Write a program that asks the user to enter a number for 5 times.
//      return the maximum number
      
      int max = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      for (int i = 1 ; i < 6 ; i++) {
          System.out.println("Enter a number");
          int input = keyboard.nextInt();
          
          if (input > max) {
              max = input;
          }
      }
      
      System.out.println("Maximum number is "+ max);
      
      
      keyboard.close();
	}

}

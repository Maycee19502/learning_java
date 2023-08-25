package day14_StringDayTwo;

public class Task4 {

	public static void main(String[] args) {
		
//      Unique Character Finder
//
//      Write a Java program that takes a string as input and returns a string containing
//      only the unique characters present in the input string
//    The order of characters in the output string should be the same as they appear in the input string.
//
//      For example, if the input string is "hello", the output should be "helo". If the input string is "programming", the output should be "progamin".
//  input = "java"
//  output = "jav"
      
      
//      input = "techcircle"
//      output = "techirl"
        
        
//        char c = 'h';
//        String output = "";
//        
//        System.out.println(output.indexOf(c));
//        
//        if (output.indexOf(c) == -1) {
//            output += c; // h
//        }
//        
//        c = 'e';
//        
//        if (output.indexOf(c) == -1) {
//            output += c; // he
//        }
//        
//        
//        c = 'l';
//        
//        if (output.indexOf(c) == -1) {
//            output += c; //hel        
//            }
//        
//        c = 'l';
//        
//        System.out.println(output.indexOf(c));
//        
//        
//        if (output.indexOf(c) == -1) {
//            output += c; //hel        
//        }
//        
//        c = 'o';
//        System.out.println(output);
//        System.out.println(output.indexOf(c));
//    
//        
//        
//        if (output.indexOf(c) == -1) {
//            output += c; //hel        
//        }
//        
//        System.out.println(output);
//                         01234
        String input  = "civic";
        String output = "";
        
        System.out.println(output);
        
//                            5
        for (int i = 0; i < input.length() ; i++) {
            //System.out.println(i);
            
//            System.out.println(input.charAt(i));
            
//            if (output.indexOf(c) == -1) {
//                output += c; //hel        
//            }
            
            char currentCharacter = input.charAt(i);
            //System.out.println(currentCharacter);
            
            
            //System.out.println(output.indexOf(currentCharacter));
            
            if (output.indexOf(currentCharacter) == -1) {
                output += currentCharacter;
            }
            
            
            
        }
        
        System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
//      Unique Character Finder
//
//      Write a Java program that takes a string as input and returns a string containing
//      only the unique characters present in the input string
//    The order of characters in the output string should be the same as they appear in the input string.
//
//      For example, if the input string is "hello", the output should be "helo". If the input string is "programming", the output should be "progamin".
//  input = "java"
//  output = "jav"
      
      
//      input = "techcircle"
//      output = "techirl"	
		
		//String str = "pneumoencephalographically";
//		System.out.println(str.indexOf('p'));
//		System.out.println(str.indexOf('n'));
//		System.out.println(str.indexOf('e'));
//		System.out.println(str.indexOf('u'));
//		System.out.println(str.indexOf('m'));
//		System.out.println(str.indexOf('o'));
//		System.out.println(str.indexOf('c'));
//		System.out.println(str.indexOf('h'));
//		System.out.println(str.indexOf('a'));
//		System.out.println(str.indexOf('l'));
//		System.out.println(str.indexOf('g'));
//		System.out.println(str.indexOf('r'));
//		System.out.println(str.indexOf('i'));
//		System.out.println(str.indexOf('y'));
		
		//System.out.print(0, 1, 2, 3, 4, 5, 8, 11, 12, 13, 15, 16, 20, 25);
//		System.out.print(str.charAt(0));
//		System.out.print(str.charAt(1));
//		System.out.print(str.charAt(2));
//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(8));
//		System.out.print(str.charAt(11));
//		System.out.print(str.charAt(12));
//		System.out.print(str.charAt(13));
//		System.out.print(str.charAt(15));
//		System.out.print(str.charAt(16));
//		System.out.print(str.charAt(20));
//		System.out.print(str.charAt(25));
//		
//		String str = "contain";
//		System.out.println(str.length());
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(i);		
//		}
//		//for (int j = i ; j < str.length(); j++) {
//	}
		
		
		
		
		
		
		
	}
}

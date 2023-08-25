package day15_StringTasks;

public class IsPalindrome {

	public static void main(String[] args) {
		
		
		String str = "garage";
		String reverse = "";
		
		for (int i= str.length()-1; i >= 0 ; i--) {
			//System.out.println(str.charAt(i));
			reverse += str.charAt(i);
		}
		
		System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println("is Palindrome");
		}else {
			System.out.println("is not palindrome");
		}
		
		System.out.println("Irfan Notes");
		System.out.println("-----------------------------------------------");
		
		 String input = "qazaq";
//       input = input.toLowerCase();
   String output = "";
   
   
   // 1. reverse the string
   for (int i = input.length()-1 ; i >= 0 ; i--) {
//       System.out.println(i);
       //System.err.println(input.charAt(i));
       
       output += input.charAt(i);
       
   }
   
   System.out.println(output);
   
   // 2. compare reversed string with original string

   if (input.equalsIgnoreCase(output)) {
       System.out.println(input +" is a palindrome");
   }else {
       System.out.println(input +" is not a palindrome");

   }
	}

}

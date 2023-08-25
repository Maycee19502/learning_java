package day03_variables;

public class variableNamingConvention {

	public static void main(String[] args) {
		
		// RULE # 1
		
		// first character of a variable MUST be a letter or _ or $. 
		// Everything else will throw an error message
		
		String name; // works because first character of variable is a letter
		int _distance; // works because first character of variable is _
		double $balance; // works because first character of variable is $
		 
		int age = 4; // works because first character of variable is a letter
		
		//  RULE #2
		
		//  After the first initial letter, variable names may also contain letters 
		//	and digits 0 to 9. NO SPACES OR SPECIAL CHARACTERS ALLOWED
		
		String user12; // works because number follows a letter
		String userx_________$; // works because underscore used in place of spaces
	//	String color of car; Does not work because spaces are not allowed
		String color_of_car; // works because underscore used in place of spaces
		
		
		//  RULE #3
		
		// The name of a variable can be any length, but don't get carried away.
		// Remember that you will have to type this name.
		
		String helloThisIsALongStringName;
		
		//	RULE #4
		
		// Java is case sensitive program. Upper case and lower case ALWAYS matters.
		// upper case characters are distinct from lower case characters.
		//  Using ALL upper case letters are primarily used to identify constant variables.
		//  Remember that variable names are case sensitive.
		
		// Example of case sensitivity. All three hold different values even though 
		// they all share the same name. Notice the difference each character case.
		
		int SPEED =100; // All upper case letters
		int Speed = 90; // Mixed upper and lower case
		int speed = 80; // All lower case
		System.out.println(SPEED);
		System.out.println(Speed);
		System.out.println(speed);
		
		//Reassign the value to a variable by calling variable by name = value;
		
		speed =0; // variable type "speed" will no longer hold value of 80. 
		//Instead it will now hold value of 0.
		
		// Use the word "final" BEFORE variable type, in order to make 
		// a variable permanent(no one can change it).
		
		final String Jack = "Rabbit";
		final int jack = 455;
		//jack= 20;
		
		final int DAYS_IN_WEEK =7;
		//DAYS_IN_WEEK=27;
		
		// Error message: final local variable jack cannot be assigned. It must 
		// be blank and not using a compound assignment
		// Error message: final local variable DAYS_IN_WEEK cannot be assigned. It 
		// must be blank and not using a compound assignment
		
		
		//  	RULE #5
		
		// Use full meaningful words instead of cryptic abbreviations. It will make 
		// your code self-documenting and easier to understand.
		
		
		//  	RULE #6
		
		//	You can not use java keyword (or "reserved" word) for a variable name.
		//  If word is a "Reserved word" add another word or number to it.
		
		//  	RULE #7
		
		// If the name you choose consists of only one word, spell that word in all lower 
		// case letters. If it consists of more than one word, capitalize the first 
		// letter of each subsequent word. This is called camelCased and makes stringed 
		// together words easier to read.
		
			int numberOfStudents = 24;
			String ColorOfCar = "silver";
			
		
		
		
		
		
	}

}

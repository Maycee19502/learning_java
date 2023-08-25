package day14_StringDayTwo;

public class StringMethod_Substing {

	public static void main(String[] args) {
		
		String str = "television";
		
		System.out.println(str.substring(2, 5));//lev 
		System.out.println(str.substring(1, 7));//elevis
		System.out.println(str.substring(4)); //vision
		System.out.println(str.substring(0,4));//tele
		
		//System.out.println("bob".substring (9) );will give error because it doesn't exist
		

	}

}

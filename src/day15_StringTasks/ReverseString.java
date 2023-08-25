package day15_StringTasks;

public class ReverseString {

	public static void main(String[] args) {
		

		String str = "washington";
		String reverse = "";
		
//		for(int i = 2 ; i >= 0; i--) {
		for (int i= str.length()-1; i >= 0 ; i--) {
			//System.out.println(str.charAt(i));
			reverse += str.charAt(i);
		}
		
		System.out.println(reverse);
//		System.out.println(str.charAt(2));//c
//		reverse += str.charAt(2);
//		System.out.println(str.charAt(1));//b
//		reverse += str.charAt(1);
//		System.out.println(str.charAt(0));//a
//		reverse += str.charAt(0);
//		
		
		
		
		
		
	}

}

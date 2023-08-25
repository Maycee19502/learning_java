package day13_NestedLoop;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str2 = " techcircle";
		String str3 = str+str2;
		String str4 = "HELLO TECHCIRCLE";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4); // false 
		
		System.out.println(str.toUpperCase());//<---changes to upper case
		System.out.println(str);// <----reverts back to lower case
		
		System.out.println(str4.toLowerCase());
		System.out.println(str4);
		
		str2 = str2.toUpperCase();
		System.out.println(str2);// this statement permanently replaces the original value of the string 
		
	}

}

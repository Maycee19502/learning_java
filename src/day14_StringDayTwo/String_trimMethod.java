package day14_StringDayTwo;

public class String_trimMethod {

	public static void main(String[] args) {
		

		String str = "      hello        ";
		System.out.println(str.length());
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
		
		String str2 ="      hello cohort16           ";
		System.out.println(str2);
		str2 = str2.trim();
		System.out.println(str2);
	}

}

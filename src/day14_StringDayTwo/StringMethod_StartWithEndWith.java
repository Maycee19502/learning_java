package day14_StringDayTwo;

public class StringMethod_StartWithEndWith {

	public static void main(String[] args) {
		
		String str = "TechCircle";
		
		System.out.println(str.startsWith("Tech"));//True
		System.out.println(str.startsWith("ech"));//false
		
		System.out.println(str.endsWith("cle"));//true
		System.out.println(str.endsWith("rcl"));//false
		
		
		

	}

}

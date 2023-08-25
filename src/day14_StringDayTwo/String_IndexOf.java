package day14_StringDayTwo;

public class String_IndexOf {

	public static void main(String[] args) {
		
		//	index starts at 0		
				
		String name = "President George Washington";
		
		System.out.println(name.charAt(0)); //Returns character at given index position
		
		System.out.println(name.indexOf('P'));// returns index position on a given character
		
		System.out.println(name.indexOf('p'));
		
		System.out.println(name.indexOf('G'));
		
		System.out.println(name.indexOf("G"));
		
		System.out.println(name.indexOf('e'));
		
		System.out.println(name.indexOf('e',3));
		
		System.out.println(name.lastIndexOf('e'));
		
		System.out.println(name.indexOf("George"));
		
		System.out.println(name.indexOf ("ash"));
		
		System.out.println(name.indexOf("fred"));
		
	}

}

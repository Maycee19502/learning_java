package day03_variables;

public class PrimitiveType_int_byte_short_long {

	public static void main(String[] args) {
		
		byte day = 28;
		int distance =3000;
		short pageNumber = 499;
		long phoneNumber = 7031231234L; 
		// Place an Upper case L at end of long number that is too long
		
		//System.out.println(Integer.MAX_VALUE); Find max value of integer
		System.out.println(day);
		System.out.println(distance);
		System.out.println(pageNumber);
		System.out.println(phoneNumber);
		
		long ssn = 123_12_1234; //can use underscore in long variable type
		System.out.println(ssn);
		
		int price = (int)9.99; // Placing (int) before the value will force java to 
								//	accept saving the value but as a whole number.In
								// this case it will save int value as 9. If you need
								// to store as decimal, use dataType Float or Double.
	}

}

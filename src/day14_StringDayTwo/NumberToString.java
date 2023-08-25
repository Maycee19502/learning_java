package day14_StringDayTwo;

public class NumberToString {

	public static void main(String[] args) {
		

		int num = 123;
		int num2 = 456;
		
		System.out.println(num + num2); //579
		
		String str1 = "" + num; //changes datatype int to String
		String str2 = "" + num2;// changes datatype int to String
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(1)); //2
		
		System.out.println(str1 + str2); // 123 + 456 =123456
		
		 double price = 9.99;
	        
	        String str3 = ""+price; // changes datatype "double" to String
	        
	        System.out.println(str3);//9.99
	        
	        System.out.println(str3.length()); //4

	        System.out.println(str3.charAt(1)); //.
	        
	        
//	            0123
	        /// 9.99
	        
	    System.out.println(String.valueOf(price)); //9.99
	        
	    System.out.println(String.valueOf(price).substring(2)); // 99
	    
	  /* Primitive		Wrapper class
	   * char			Character
	   * int			Integer
	   * byte			Byte
	   * short			Short
	   * long			Long
	   * float			Float
	   * double 		Double
	   * boolean  		Boolean
	   */
	   	        
		String strPrice = Double.toString(price);
		
		System.out.println(strPrice);//9.99
		
		System.out.println(strPrice.substring(2)); //99
		
		String strNum = Integer.toString(num);
		
		System.out.println(strNum);//123
		
		System.out.println(strNum.charAt(2));
		
		System.out.println(strNum.length());
		
		
		System.out.println(strNum.charAt(strNum.length()-1));
		
		 int num3 = 123456780;
	        
	        String strNum3 = Integer.toString(num3);
	        
	        System.out.println(strNum3.charAt(8)); //0
	        
	        System.out.println(strNum3.length()); 
	        
	        
	        System.out.println(strNum3.charAt(strNum3.length()-1));
		
	}

}

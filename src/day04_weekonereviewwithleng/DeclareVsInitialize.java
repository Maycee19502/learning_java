package day04_weekonereviewwithleng;

public class DeclareVsInitialize {

	public static void main(String[] args) {
		
		// DataType  VariableName  = Value
		String	schoolName = "TechCircle"; // in this case the variable name has been
										  // initialized
		
		String myCatsNameIs;  // In this case the variable name has not been initialized.
		// To Declare and initialize (place a value to the variableName) at a later time 
		
		myCatsNameIs = "Sabrina"; // "variable name is now initialized
		
		//Variable name can be reassigned indefinitely as long as the variable name
		// is not defined as constant or Final.
		//Constant or final variable names should be written in SCREAM SNAKE CASE (all caps)
		System.out.println( myCatsNameIs );
		
		myCatsNameIs = "Max";
		System.out.println( myCatsNameIs );
		
		myCatsNameIs = "BJ";
		System.out.println(myCatsNameIs);
		
		// You can declare more than one variable on the same line but
		//  they have to be the same dataType
		
		//int a = 5;
		//int b = 6;
		//int c = 7;
		// is the same as 
		int a,b,c;
		
		a= 5;
		b= 6;
		c= 7;
				
	final String FINALVARIABLENAME = "is assigned in all caps to easily recognize as Final";
	}

}

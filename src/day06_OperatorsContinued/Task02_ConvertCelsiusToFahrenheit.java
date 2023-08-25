package day06_OperatorsContinued;

public class Task02_ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {

	// Create a Java program that takes a temperature value in Celsius as input 
//		and converts it to Fahrenheit using the formula:
//		--Fahrenheit = (celsius * 9/5) + 32.
//		display the converted tempature as output.
//		
		double Celsius = 21;
		double Fahrenheit = (Celsius * 9 / 5) + 32;
		
		System.out.println(Celsius + " Celsius = " + Fahrenheit + " Fahrenheit");
	}

}

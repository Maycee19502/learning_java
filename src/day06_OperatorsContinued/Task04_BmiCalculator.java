package day06_OperatorsContinued;

public class Task04_BmiCalculator {

	public static void main(String[] args) {
		
// BMI Calculator:
	//Write a program that calculates the Body Mass Index (BMI) of a person 
		//based on their weight and height using arithmetic operators.
		// calculate bmi = weight / (height * height);
		
		
		// Ternary Operator
		//variable = (condition ? true block : false block;
		
		double weightKg = 101.57; 
		double heightM= 1.83; 
		System.out.println();
		double BMI = weightKg / (heightM * heightM);
		
		System.out.println(BMI);
		
		
		String msg = (BMI < 18.5) ? "Under weight" : 
					(BMI > 18.5 && BMI <= 24.9) ? "Normal Weight":
					(BMI >= 25 && BMI < 30 ) ? "Over weight":
					(BMI >= 30) ? "Obese" : "Obese";
		System.out.println(msg);
	}

}

package day07_ControlFlowStatement;

public class Task01_FindTheLargestValue {

	public static void main(String[] args) {
		
		double n1 = -1.0;
		double n2 = 4.5;
		double n3 = -5.3;
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is greater than " + n2 + " & "+ n3);
		}else if (n2 > n1 && n2 > n3) {
		System.out.println(n2 + " is greater than "+ n1 +" & "+ n3);
		}else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " is greater than "+ n1 +" & " +n2);
		}
		

	}

}

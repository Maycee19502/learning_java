package day07_ControlFlowStatement;

public class LoanApplication {

	public static void main(String[] args) {
		
		int salary = 120000;
		int jobHistory = 3;
		int creditScore = 750;
		
		if(salary >= 25000){
			
			if(jobHistory>=2) {
				
				if(creditScore >=750) {
					System.out.println("You qualify for this loan!!");
				}else {
				System.out.println("You do not meet minimum credit score requirement");
				}
			}else {
				System.out.println("You must have 2 years of job history");
			}
		}else {
			System.out.println("You must have minimum salary of $25000 first");		
		}
		
		

	}

}

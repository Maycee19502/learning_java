package day12_Week03ReviewWithLeng;

public class ContinueBreakStatement {

	public static void main(String[] args) {
		
 //break;
		
		for(int i = 0; i <5; i++) {
			System.out.println(i);
			if (i == 2)
				break; // this will stop the loop right away
		}
		
		System.out.println("end of loop");
		
		for(int i = 0; i <5; i++) {
			if (i <= 2)
				System.out.println(i);
				continue; // this will restart (go back to the beginning) 
			//the loop right away
		}
	}

}

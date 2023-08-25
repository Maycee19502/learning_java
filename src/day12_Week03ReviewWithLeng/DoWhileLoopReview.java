package day12_Week03ReviewWithLeng;

public class DoWhileLoopReview {

	public static void main(String[] args) {
		
		// do While
		
		//dowhile loop will execute at least once regardless of boolean condition
		// do{
		//code to be repeated
		//while (condition);
		
		int i = 5;
		do {
		System.out.println("hello - "+ i);
		i--;
		}while (i > 8);
		System.out.println("outside loop");
		System.out.println("i = "+ i);	
		
		
	}

}

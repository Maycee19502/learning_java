package day12_Week03ReviewWithLeng;

public class Task01_PrintPrimeNumbersUsingForLOop {

	public static void main(String[] args) {
		
		int input = 100;
		for (int i = 2; i < input; i++) {

		      boolean isPrime = true;
		      if (i == 0 || i == 1) isPrime = false;

		      for (int j = 2; j < i; j++) {
		        if (i % j == 0)
		          isPrime = false;
		      }

		      if (isPrime) System.out.println(i);
		    }
		
		
		
		
		
		
	}

}

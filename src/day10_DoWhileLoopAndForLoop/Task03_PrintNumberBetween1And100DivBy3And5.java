package day10_DoWhileLoopAndForLoop;

public class Task03_PrintNumberBetween1And100DivBy3And5 {

	public static void main(String[] args) {

//      task:
//      Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
//      Sample Output:
//
//      Divided by 3:                                                          
//      3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
//      , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
//                                                                             
//      Divided by 5:                                                          
//      5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
//      95,                                                                    
//                                                                             
//      Divided by 3 & 5:                                                      
//      15, 30, 45, 60, 75, 90,

		int count = 1;

		do {

//      Divided by 3:                                                          
//      3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
//      , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,  

			if (count % 3 == 0) {
				System.out.print(count + " , ");
			}

			count++;
		} while (count <= 100);

		System.out.println();
		count = 1;

		do {

//      Divided by 5:                                                          
//      5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
//      95,  

			if (count % 5 == 0) {
				System.out.print(count + " , ");
			}

			count++;
		} while (count <= 100);

		System.out.println();
		count = 1;

		do {

//      Divided by 3 & 5:                                                      
//      15, 30, 45, 60, 75, 90, 

			if (count % 5 == 0 && count % 3 == 0) {
				System.out.print(count + " , ");
			}

			count++;
		} while (count <= 100);

	}
}
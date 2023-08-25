package day13_NestedLoop;

public class CreateTimer {

	public static void main(String[] args) throws InterruptedException {
		
		int time = 1;
		
		for (int min = time-1 ; min >= 0 ;min--) {
	//System.out.println(min);
		
		for(int sec = 59 ; sec >= 0 ; sec--) {
			System.out.println(min + ":" + sec);
			Thread.sleep(1000);
		}
		}
//		 for (int day = 6; day >= 0; day--) {
//	            for (int hour = 23; hour >= 0; hour--) {
//	                for (int minute = 59; minute >= 0; minute--) {
//	                    // System.out.println(minute);
//	                    for (int second = 59; second >= 0; second--) {
//	                        System.out.println(day+ ":"+hour+ ":"+minute + ":" + second);
//	                        Thread.sleep(1000);
//	                    
//	                
//	                    }
//	                    }
//	                }
//	            }	
//	
	}
}

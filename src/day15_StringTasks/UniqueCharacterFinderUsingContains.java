package day15_StringTasks;

public class UniqueCharacterFinderUsingContains {

	public static void main(String[] args) {
		
		String input = "hello";
		String output = "he";
//		System.out.println(!output.contains("l"));
//		
//		//convert char to String
//		
//		char letter1 = input.charAt(4);
//		String letter = Character.toString(letter1);
//		System.out.println(letter);
//		
		for (int i = 0 ; i < input.length(); i++) {
			System.out.println(input.charAt(i));
			char currentCharacter = input.charAt(i);
			String currentLetter = Character.toString(currentCharacter);
			
			 if (!output.contains(currentLetter)) {
	                output += currentCharacter;
	            }
	            
	            
	        }
	        
	        
	        System.out.println(output);// javt
	        
		
	}

}

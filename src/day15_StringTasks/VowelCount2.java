package day15_StringTasks;

public class VowelCount2 {

	public static void main(String[] args) {
		
		
			String input = "hello";
			String vowels = "aeiou";
	        int count = 0;

	        for (int i = 0 ; i < input.length() ; i++) {
	            char currentCharacter = input.charAt(i);
	            String currentStr = Character.toString(currentCharacter);    
	            if (vowels.contains(currentStr)) {
	                count++;
	            }
	        }
	        
	        System.out.println(count);
	}

}

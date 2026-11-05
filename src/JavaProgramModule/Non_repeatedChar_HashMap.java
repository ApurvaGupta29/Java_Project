package JavaProgramModule;

import java.util.HashMap;

public class Non_repeatedChar_HashMap {

	public static void main(String[] args) {
		
		
//		Bring the tool → import java.util.HashMap;
//		Take the word → String text = "swiss";
//		Open an empty register → HashMap<Character, Integer> register = new HashMap<>();
//		Walk 1: Count → loop the word. If the letter is already there, +1. If not, write 1.
//		Walk 2: Check → loop the word again. If the count is 1, print it and break.
//		Nothing found? → print “No non-repeated character found”.
		
		        String text = "swiss";
		        HashMap<Character, Integer> register = new HashMap<>();

		        // WALK 1: Fill the register
		        for (int i = 0; i < text.length(); i++) {
		            char current = text.charAt(i);

		            if (register.containsKey(current)) {
		                register.put(current, register.get(current) + 1);
		            } else {
		                register.put(current, 1);
		            }
		        }

		        // WALK 2: Find the first letter with count 1
		        boolean found = false;

		        for (int i = 0; i < text.length(); i++) {
		            char current = text.charAt(i);

		            if (register.get(current) == 1) {
		                System.out.println("First non-repeated character: " + current);
		                found = true;
		                break;
		            }
		        }

		        if (found == false) {
		            System.out.println("repeated character found");
		        }
		    }
		}
package JavaProgramModule;

public class Non_repeate_NestedLoop {

	public static void main(String[] args) {
		String text = "swiss";          // Our word
		boolean found = false;          // Note to self: "Answer not found yet"

		for (int i = 0; i < text.length(); i++) {     // Pick letters one by one: s, w, i, s, s
		    char current = text.charAt(i);            // Hold this letter in my hand
		    int count = 0;                            // Start counting from 0 for this letter

		    for (int j = 0; j < text.length(); j++) { // Go through the whole word again
		        if (text.charAt(j) == current) {      // Is this letter the same as the one in my hand?
		            count++;                          // Yes → add 1
		        }
		    }                                         // Now I know how many times my letter appears

		    if (count == 1) {                         // Appears only once?
		        System.out.println("First non-repeated character: " + current);  // Print it
		        found = true;                         // Note to self: "Found it!"
		        break;                                // Stop, no need to check more
		    }
		    else {
		    	System.out.println(current + "____" + count);
		    }
		}                                             // Loop over

		if (found == false) {                         // Still not found after checking all?
		    System.out.println("No non-repeated character found");  // Say so
		}
	}
}
package JavaProgramModule;

public class Duplicate_char {

	public static void main(String[] args) {
		String text = "prommingg";        // our word
		boolean found = false;            // note: "nothing found yet"

		for (int i = 0; i < text.length(); i++) {      // go to each letter, one by one
		    char current = text.charAt(i);             // hold this letter
		    int count = 0;                             // start counting from 0

		    for (int j = 0; j < text.length(); j++) {  // check the whole word
		        if (text.charAt(j) == current) {       // same letter?
		            count++;                           // add 1
		        }
		    }

		    if (count > 1 && text.lastIndexOf(current) == i) {   // repeated AND last appearance?
		        System.out.println(current + "___" + count);     // print it
		        found = true;                                    // note: "found something"
		    }
		}

		if (found == false) {                          // nothing repeated at all?
		    System.out.println("no char repeating");
		}
	}

}

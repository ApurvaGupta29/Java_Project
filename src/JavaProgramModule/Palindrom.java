//package JavaProgramModule;
//
//public class Palindrom {
//
//	public static void main(String[] args) {
//		//palindrom = reverse of string is same as string 
//		
//		String name= "anna";
//		String rev ="";
//		int len= name.length();
//		for(int i = len-1;i>=0;i--)
//		{
//			rev= rev+name.charAt(i);
//			
//		}
//		//System.out.println(rev.toString());
//		if (name.equals(rev))
//		{
//			System.out.println("this is palindrom program");
//		}
//		else
//		{
//			System.out.println("This is not palindrom");
//		}
//
//	}
//
//}

package JavaProgramModule;

import java.util.Scanner; // Import the Scanner class to read input

public class Palindrom {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string to check: ");
		String name = scanner.nextLine(); // Reads the whole line entered by the user

		String rev = "";
		int len = name.length();

		// Loop to reverse the input string
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		// Note: We use .equals() here instead of == because they are Strings
		if (name.equalsIgnoreCase(rev)) {
			System.out.println("'" + name + "' is a palindrome.");
		} else {
			System.out.println("'" + name + "' is not a palindrome.");
		}

		scanner.close(); // Good practice to close the scanner when done
	}
}

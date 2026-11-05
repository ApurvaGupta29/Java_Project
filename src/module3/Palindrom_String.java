package module3;

public class Palindrom_String {

	public static void main(String[] args) {
		String input = "MuM";
		String output= "";
		for (int i = input.length()-1;i>=0;i--) {
			char b = input.charAt(i);
			output +=b;
		}
		System.out.println(output);
		if (output.equals(input))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
			
			
	}

}

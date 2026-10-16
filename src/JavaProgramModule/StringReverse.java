package JavaProgramModule;

import java.util.Iterator;

public class StringReverse {

	public static void main(String[] args) {

		String name = "Apurva";

		// without predefined function

		String rev = "";
		int len = name.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}

		System.out.println(rev);

		// with predefined string function

		StringBuilder sb = new StringBuilder(name);
		StringBuilder s1 = sb.reverse();
		System.out.println(s1);
		System.out.println(s1.toString());

	}

}

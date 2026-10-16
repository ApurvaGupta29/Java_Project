package module1Programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);// used to take human input at run time
		System.out.print("what is your name?");
		String name = s1.next();
		System.out.print("what is your age?");
		int age = s1.nextInt();
		s1.close();
	}

}

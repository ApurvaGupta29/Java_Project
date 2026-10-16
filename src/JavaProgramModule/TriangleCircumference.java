package JavaProgramModule;

import java.util.Scanner;

public class TriangleCircumference {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the value of A");
		int a = s1.nextInt();
		System.out.print("Enter the value of b");
		int b = s1.nextInt();
		System.out.print("Enter the value of c");
		int c = s1.nextInt();

		int CircumferenceofTriangle = a + b + c;
		System.out.println(CircumferenceofTriangle);
		s1.close();

	}

}

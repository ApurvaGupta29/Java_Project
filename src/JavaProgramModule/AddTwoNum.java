package JavaProgramModule;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of A :");
		int a = s1.nextInt();

		System.out.println("enter the value of B :");
		int b = s1.nextInt();

		// int sum = a+b;
		int sum = Math.addExact(a, b);
		System.out.println("the addition of two number-> " + sum);
		s1.close();

	}

}

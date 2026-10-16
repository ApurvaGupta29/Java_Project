package JavaProgramModule;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the value of r");
		int r = s1.nextInt();

		double AreaOfCircle = Math.PI * r * r;
		System.out.println(AreaOfCircle);
		s1.close();
	}

}

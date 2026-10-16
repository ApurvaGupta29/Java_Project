package module1Programs;

import java.util.Scanner;

public class AllMethodScanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();
		int age = s1.nextInt();
		int a = s1.nextByte();
		int b = s1.nextShort();
		Long c = s1.nextLong();
		double d = s1.nextDouble();
		float f = s1.nextFloat();
		boolean t = s1.nextBoolean();

		s1.close();
	}

}

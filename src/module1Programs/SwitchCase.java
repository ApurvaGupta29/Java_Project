package module1Programs;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter which case you want to run");
		int at = s1.nextInt();
		System.out.println(at);
		switch (at)

		{
		case 1:
			System.out.println("launch chrome");
			break;

		case 2:
			System.out.println("launch firefox");
			break;
		default:
			System.out.println("not available");

			s1.close();

		}

	}

}

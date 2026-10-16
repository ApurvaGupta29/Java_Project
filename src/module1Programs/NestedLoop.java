package module1Programs;

public class NestedLoop {

	public static void main(String[] args) {
		for (int j = 1; j <= 12; j++) {

			for (int i = 1; i <= 30; i++) {
				System.out.println("Month-> " + j);
				System.out.println("Days-> " + i);
			}

		}
	}

}
//outer is true then inner will execute as many time as it can
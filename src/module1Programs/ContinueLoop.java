package module1Programs;

public class ContinueLoop {

	public static void main(String[] args) {
		for (int i = 10; i <= 15; i++) {
			if (i >= 12) {
				continue;// it will skip iteration
			}
			System.out.println(i);
		}
	}

}

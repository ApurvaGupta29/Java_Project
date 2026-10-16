package module2;

public class ThisCalling {

	ThisCalling(String a, String b) {

		System.out.println("Home");
	}

	ThisCalling(int a, int b) {
		this("ram", "soni");
		System.out.println("Gold and Share");
	}

	public static void main(String[] args) {
		new ThisCalling(10, 20);

	}
}

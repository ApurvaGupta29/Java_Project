package module2;

public class AccessSpecifierCase1 {
	public static int a = 100;
	protected static int b = 50;
	static int c = 25;
	private static int d = 11;

	static void main1() {
		System.out.println("aadk");
	}

	{
		System.out.println("a");
	}

	public static void add() {
		System.out.println("Addition");
	}

	protected static void sub() {
		System.out.println("Sutraction");
	}

	static void mul() {
		System.out.println("Multiplication");
	}

	private static void div() {
		System.out.println("Division");
	}

	public static void main(String[] args) {
		add();
		mul();
		div();
		sub();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

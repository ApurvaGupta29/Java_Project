package module1Programs;

public class MethodsWithParam {

	static void add() {
		int a = 100;
		int b = 200;
		int c = a + b;

		System.out.println(c);

	}

	void sub() {
		int a = 100;
		int b = 200;
		int c = b - a;

		System.out.println(c);
	}

	MethodsWithParam() {

	}

	public static void main(String[] args) {

		add();
		MethodsWithParam arth = new MethodsWithParam();
		arth.sub();

	}

}

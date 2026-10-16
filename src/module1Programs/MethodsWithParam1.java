package module1Programs;

public class MethodsWithParam1

{

	static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	void mul(double a, double b) {
		double c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MethodsWithParam1 para = new MethodsWithParam1();

		add(100, 200);
		para.sub(300, 200);
		para.mul(12.3, 3.4);

	}

}

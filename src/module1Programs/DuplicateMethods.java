package module1Programs;

public class DuplicateMethods {

	static void add(int a, int b) // DUplicate Method is possible with different params in java
	{
		int c = a + b;
		System.out.println(c);
	}

	void add(double b, double a)

	{
		double c = a + b;
		System.out.println(c);
	}

	static void add(int a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	static void add(double a, int b) {
		double c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add(100, 200);
		DuplicateMethods para = new DuplicateMethods();
		para.add(34.44, 43.533);
		add(100, 23.44);
		add(34.4, 200);

	}

}

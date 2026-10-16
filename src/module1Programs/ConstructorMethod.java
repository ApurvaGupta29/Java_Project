package module1Programs;

public class ConstructorMethod {

	ConstructorMethod(int a, char b) {
		System.out.println("1");
	}

	ConstructorMethod(String a, char b) {
		System.out.println("2");
	}

	ConstructorMethod(String a, String b) {
		System.out.println("3");
	}

	ConstructorMethod(int a, int b) {
		System.out.println("4");
	}

	public static void main(String[] args)

	{
		ConstructorMethod c1 = new ConstructorMethod(100, 's');
		ConstructorMethod c2 = new ConstructorMethod("Ap", 's');
		ConstructorMethod c3 = new ConstructorMethod("App", "Ra");
		ConstructorMethod c4 = new ConstructorMethod(100, 200);

		new ConstructorMethod(100, 200);

	}

}

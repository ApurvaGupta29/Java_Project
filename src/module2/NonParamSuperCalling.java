package module2;

class Amma {
	Amma() {
		super();
		System.out.println("Home");
	}

	static void house() {
		System.out.println("home builded");
	}

	int savings = 100000000;

}

class Papa extends Amma {
	Papa() {
		super();
		System.out.println("Gold and Share");
	}

	static void Gold() {
		System.out.println("gold biscuit purchase");
	}

	static int share = 2000000;
}

public class NonParamSuperCalling extends Papa {

	NonParamSuperCalling() {
		super();
		System.out.println("Home, Gold , Share and personal income");
	}

	public static void main(String[] args) {

		new NonParamSuperCalling();

	}
}

package module2;

class Amma1 {
	Amma1(String a, String b) {
		super();
		System.out.println("Home");
	}

	static void house() {
		System.out.println("home builded");
	}

	int savings = 100000000;

}

class Papa1 extends Amma1 {
	Papa1(int a, int b) {
		super("home", "scooty");
		System.out.println("Gold and Share");
	}

	static void Gold() {
		System.out.println("gold biscuit purchase");
	}

	static int share = 2000000;
}

public class ParamSuperCalling extends Papa1 {
	ParamSuperCalling() {
		super(12, 13);
		System.out.println("Home, Gold , Share and personal income");
	}

	public static void main(String[] args)

	{
		new ParamSuperCalling();

	}

}

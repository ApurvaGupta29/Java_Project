package module1Programs;

public class GlobalVar {
	int a = 100;// global variable non static in nature //instance var
	static int b = 600;// global variable static in nature
	static int c = 800;

	static void add() {
		GlobalVar gv = new GlobalVar();
		int t = gv.a;
		gv.a = 200;
		int b = 0; // update value of static method of global variable
		int sum = b + c + t;
		System.out.println(sum);
	}

	static void sub() {
		c = 600;
		int sub = c - b;
		System.out.println(sub);
	}

	void mul() {
		b = 500;
		int mul = b * c * a;
		System.out.println(mul);
	}

	public static void main(String[] args) {
		GlobalVar gv = new GlobalVar();
		add();
		sub();

		gv.a = 200; // update value of instance or non-static method of global variable
		gv.mul();
		System.out.println(gv.a);

	}

}

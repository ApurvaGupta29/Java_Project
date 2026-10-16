package module1Programs;

public class MathProgram {
//method overloading 

	public static void main(String[] args) {

		int a = Math.addExact(100, 200);
		System.out.println(a);

		int b = Math.subtractExact(500, 200);
		System.out.println(b);

		int c = Math.multiplyExact(23434, 0);
		System.out.println(c);

		double d = Math.min(23.3, -34.44);
		System.out.println(d);

		double e = Math.max(23.3, -34.44);
		System.out.println(e);

		double absolute = Math.abs(-3242424.9382479723740327);
		System.out.println(absolute);
		double random = Math.random(); // greater than 0 but less than 1 and decimal value up to 19 digits
		System.out.println(random);

		double a1 = Math.PI; // global variable
		System.out.println(a1);

		double a2 = Math.sqrt(10000);
		System.out.println(a2);

	}

}

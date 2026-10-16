package module1Programs;

public class CombinationProgramWithParam {

	int d = 100; // global variable
	double g = 13.333; // global variable

	static void a(boolean a, String b)// local variable in brown color and its scope is within method
	{

	}

	static void b(String a, boolean b) {

	}

	static void c(double a, int b) {

	}

	static void d(double a, char c) {

	}

	static void e(char a, char b, char c) {

	}

	static void f(String a, String b) {

	}

	public static void main(String[] args) {
		a(false, "hello");
		b("bye", true);
		c(1.1, 10);
		d(1.1, 'X');
		f("Apu", "Rah");
		e('a', 'b', 'c');

	}

}

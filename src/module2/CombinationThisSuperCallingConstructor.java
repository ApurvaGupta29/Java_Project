package module2;

class K3 {
	K3(int a) {
		this();
		System.out.println("6");

	}

	K3() {
		System.out.println("5");
	}
}

class K2 extends K3 {
	K2(char a) {
		super(100);
		System.out.println("4");
	}

	K2() {
		this('D');
		System.out.println("3");
	}
}

public class CombinationThisSuperCallingConstructor extends K2 {

	CombinationThisSuperCallingConstructor(String a) {
		this();
		System.out.println("2");
	}

	CombinationThisSuperCallingConstructor() {
		super();
		System.out.println("1");
	}

	public static void main(String[] args) {
		new CombinationThisSuperCallingConstructor("Automation");

	}

}

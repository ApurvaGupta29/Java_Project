package module2;

class MultiLevelC3 {
	static void house() {
		System.out.println("house");
	}
}

class MultiLevelC2 extends MultiLevelC3 {
	static void car() {
		System.out.println("Car");
	}
}

public class MultiLevelC1 extends MultiLevelC2 {
	static void gold() {
		System.out.println("Gold");
	}

	public static void main(String[] args) {
		car();
		house();
		gold();
	}
}

package module2;

class B {
	void login() {
		System.out.println("Login using Emailid");
	}
}

public class MethodOverriding extends B {
	void login() {
		System.out.println("Login using MobileNo");
	}

	public static void main(String[] args) {
		MethodOverriding a1 = new MethodOverriding();
		a1.login();
	}

}

package module2;

abstract class Bank { // This is what we are going to expose to 3rd party companies
	abstract void login();// This is what we are going to expose to 3rd party companies

	abstract void registration();
}

public class Abstract_Method extends Bank { // concrete class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void login() { // concrete Method
System.out.println("Hi");
	}

	void registration() {
System.out.println("hello");
	}

}

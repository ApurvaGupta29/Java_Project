package module2;

abstract class Apple { 
	// This is what we are going to expose to 3rd party companies
	abstract void login();// This is what we are going to expose to 3rd party companies
}

public class AbstrctClass_Methods extends Apple{

	public static void main(String[] args) {
		
	
	}
	@Override
	void login() {
		System.out.println("dev write theri code");		
	}

}

package module2;

public class MilenialClass extends ParentClass

{
	static void tc_Addtocartproduct() {
		System.out.println("addtocartproduct");
	}

	public static void main(String[] args) {
		LoginCode();
		tc_Addtocartproduct();
		MilenialClass c1 = new MilenialClass();
// with this we can access both parent and child non static methods.
//Also instance variable of both class
		c1.screenshot();

	}

}

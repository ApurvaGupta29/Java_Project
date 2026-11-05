package module2;
 class A {
	 void login()
	{
		System.out.println("enter email id");
	}
}
public class Super_Keyword extends A
{
void login()
{
	System.out.println("enter via mobile number");
	super.login();
}
	public static void main(String[] args) {
		Super_Keyword loggedin = new Super_Keyword();
		loggedin.login();

	}

}

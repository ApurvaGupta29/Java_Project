package module1Programs;

public class Methods {
	static int a=10;
	
	static void add() // default/package //non parameterized
	{
		
		
		int a =100;
		System.out.println("static method");
		
	}

	public void sub() // non static //non -parameterized
	{
		System.out.println("Non-static method");
		add();
	}

	public void sub1() // non static //non -parameterized
	{
		System.out.println("Non-static method multi");

	}

	protected Methods() // non static - also remember constructor always non static
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) // main method decide what method execute or what not
	{

		System.out.println("start of the main method");

		Methods call = new Methods();
		call.sub();
		call.sub1();
	}

}

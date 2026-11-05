package module3;

public class String_Function3 {

	public static void main(String[] args) {
		String a = "Automation";
	Boolean b1=	a.equals("automation"); //java is case sensitive language
	System.out.println(b1);
	
	boolean b2 = a.contains("A");
	System.out.println(b2);
	
	boolean b3 = a.matches("(.*)n");
	boolean b4 = a.matches("A(.*)");
	boolean b5 = a.matches("(.*)tom(.*)");
	
	System.out.println(b3);
	System.out.println(b4);
	System.out.println(b5);

	}

}

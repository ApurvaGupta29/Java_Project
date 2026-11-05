package module3;

public class String_Function1 {

	public static void main(String[] args) {
		String a = "Automation ";
		System.out.println(a.substring(2, 4));//start and end index (last -1) so 2 ans 3 index
		System.out.println(a.substring(4)); //from 4th index till last it gives output
		System.out.println(a.substring(2));
		System.out.println(a.trim()); //trim extra space of start and end of the index not from middle
	}

}

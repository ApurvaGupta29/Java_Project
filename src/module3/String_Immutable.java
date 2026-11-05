package module3;

import java.util.Arrays;

public class String_Immutable {

	public static void main(String[] args) {
		String a = "Automation ";
	String a_New=	a.concat("Testing ");
		System.out.println(a_New);
				
String b = "My name is Apurva Gupta";
String [] split1 = b.split(" ",5);
System.out.println(Arrays.toString(split1));
	}

}

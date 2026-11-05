package module3;

public class String_function2 {

	public static void main(String[] args) {
String a = "Automation";
a.replace('A', 'a');
String b = a.replace('A', 'a');
System.out.println(b);
String c = "java is my fav langugae";
System.out.println(c.replace("java","JavaScript"));
String e =a.replaceAll("[a-z]","."); //all small letter replace with .

System.out.println(e);



	}

}

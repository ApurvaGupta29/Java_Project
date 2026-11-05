package module3;

public class Reverse_String {

	public static void main(String[] args) {
String input = "Automation";
String output = "";
for(int i=input.length()-1;i>=0;i--) {
	output += input.charAt(i);
	
}
System.out.println(output);
	}

}

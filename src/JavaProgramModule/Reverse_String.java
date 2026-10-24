package JavaProgramModule;

public class Reverse_String {

	public static void main(String[] args) {
		String Original = "progr";
		String rev = "";

		System.out.println(Original.charAt(2) + "=====" + Original.length());

		for (int i = Original.length() - 1; i >= 0; i--) {
			rev += Original.charAt(i);

		}

//       
//        for(int i = 0;i<=Original.length()-1;i++)
//        {
//        	rev += Original.charAt(i);
//        }
		System.out.println("reverse string :   " + rev);
	}
}

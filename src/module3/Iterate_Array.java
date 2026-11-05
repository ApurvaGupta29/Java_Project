package module3;

import java.util.Arrays;

public class Iterate_Array {

	public static void main(String[] args) {
		String a = "auto";
	char[] c1=	a.toCharArray();
	System.out.println(c1);
	//iterate array
	for(int i =0;i<a.length();i++) {
		//System.out.println(a.charAt(i));   
		System.out.println(c1[i]);
	}
System.out.println(Arrays.toString(c1)); //give in presentational format
	}

}

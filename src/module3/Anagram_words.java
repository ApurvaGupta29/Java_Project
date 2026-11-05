package module3;

import java.util.Arrays;

public class Anagram_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//friend=firend
		//act=cat saw= was low=owl
		String a = "saw";
		String b = "was";
		if(a.length()!=b.length())
		{
			System.out.println("This can never be anagram");
		}
		else {
	char c1[]=a.toCharArray();
	char c2[]=b.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1, c2)) {
		System.out.println("This is Anagram");
	}
	else {
		System.out.println("This is not an Anagram");
	}
		
	
		
	}
	}
}

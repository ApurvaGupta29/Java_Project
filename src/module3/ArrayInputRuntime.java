package module3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputRuntime {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int [] value = new int[s1.nextInt()];
		
	//	System.out.println("Please enter value");
//	value[0] =	s1.nextInt();
//	value[1]=s1.nextInt();
//	value[2]=s1.nextInt(); //cmd +/
//	value[3]=s1.nextInt();
		for(int i =0;i<value.length;i++)
		{
			System.out.println("Please enter value " +i);
			
			value[i] =s1.nextInt();
			
		}
	System.out.println(Arrays.toString(value));
	}

}

package module3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayEqual1 {

	public static void main(String[] args) {
		int arr1[] = new int[3];
		arr1[0] = 12;
		arr1[1] = 13;
		arr1[2] = 14;
		int arr2[] = new int[arr1.length];
		arr2[0] = 12;
		arr2[1] = 13;
		arr2[2] = 14;
		 
	boolean b1 =	Arrays.equals(arr1, arr2);
	System.out.print(b1);

	}
}

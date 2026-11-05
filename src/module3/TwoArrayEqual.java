package module3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayEqual {

	public static void main(String[] args) {
		int arr1[] = new int[3];
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("enter value for 1st array->  ");
			arr1[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		int arr2[] = new int[3];
		Scanner s2 = new Scanner(System.in);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("enter value for 2nd array->  ");
			arr2[i] = s2.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		
		if(arr1==arr2) {
			System.out.println("Both are equal array");
		}
		else {
			System.out.println("Array not equal");
		}
		

//		arr1[0] = 12;
//		arr1[1] = 13;
//		arr1[2] = 14;
//		int arr2[] = new int[arr1.length];
//		arr2[0] = 12;
//		arr2[1] = 13;
//		arr2[2] = 14;
//		for(int i =0;i<arr1.length;i++) {
//			
//		if(arr1[i]==arr2[i]) {
//			System.out.println("both array are equal");
//		}
//		else {
//			System.out.println("Array not equal");
//		}
//	}
	}
}

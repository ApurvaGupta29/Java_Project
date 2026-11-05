package module3;

import java.util.Arrays;

public class CopyOneArr_ReverseOrder {

	public static void main(String[] args) {
		int first[] = new int[3];
		first[0]=12;
		first[1]=14;
		first[2]=23;
		System.out.println("Original Array-> ");
		System.out.println(Arrays.toString(first));
		int second[] = new int[first.length];
		for(int i =0,j=first.length-1;i<first.length;i++,j--) {
			second[j]=first[i];
		}
System.out.println(Arrays.toString(second));
	}

}

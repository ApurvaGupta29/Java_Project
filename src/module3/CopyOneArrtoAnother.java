package module3;

import java.util.Arrays;

public class CopyOneArrtoAnother {

	public static void main(String[] args) {
	int first[] = new int[3];
	first[0]=12;
	first[1]=14;
	first[2]=23;
	System.out.println("Original Array-> ");
	System.out.println(Arrays.toString(first));
	int second[] = new int[first.length];
for(int i =0;i<first.length;i++) {
	second[i]=first[i];
	
}
System.out.println("copied Array-> ");
System.out.println(Arrays.toString(second));
	}

}

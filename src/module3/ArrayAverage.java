package module3;

import java.util.Arrays;

public class ArrayAverage {

	public static void main(String[] args) {
		double num[]=new double[4];
		num[0]=12;
		num[1]=23;
		num[2]=12;
		num[3]=23;
		double sum=0;
		for(int i =0;i<num.length;i++) {
			sum=sum+num[i];
		}
		
		System.out.println(sum);
		double average= sum/num.length;
		System.out.println(average);

	}

}

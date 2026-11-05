package JavaProgramModule;

public class largestNum {

	public static void main(String[] args) {
		// largest number of an array
		int[] numbers = { 12, 45, 2, 41, 31, 10, 8, 6, 4 };
		
		int highest=0;

		for (int i = 0; i < numbers.length; i++) {
			int current = numbers[i];
			
			if (current > highest) {
				highest = current;
			}
		}
		System.out.println(highest);
	}

}

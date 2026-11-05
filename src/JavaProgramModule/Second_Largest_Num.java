package JavaProgramModule;

public class Second_Largest_Num {

	public static void main(String[] args) {
		int[] numbers = { 100, 45, 67,32, 67, 89, 54,-54 };
		int highest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		System.out.println(second);
		for (int i = 0; i < numbers.length; i++) {
			int current = numbers[i];
			
			if(current>highest) {
				second=highest;
				highest=current;
			}
			else if(current>second && current !=highest) {
				second=current;
				
			}
		}
		System.out.println(second);
	}

}

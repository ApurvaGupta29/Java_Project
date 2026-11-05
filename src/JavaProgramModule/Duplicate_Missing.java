package JavaProgramModule;

public class Duplicate_Missing {

	public static void main(String[] args) {
		
				int[] numbers = {1, 2, 3, 3, 5, 6, 8};
				int n = 8;                                   // numbers should be 1 to 8

				for (int i = 1; i <= n; i++) {               // call each number 1 to 8
					int count = 0;

					for (int j = 0; j < numbers.length; j++) {   // check every locker
						if (numbers[j] == i) {
							count++;
						}
					}

					if (count == 0) {
						System.out.println("Missing: " + i);
					} else if (count > 1) {
						System.out.println("Duplicate: " + i);
					}
				}
	}
}
	
		    
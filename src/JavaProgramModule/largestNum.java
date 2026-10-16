package JavaProgramModule;

public class largestNum {

	public static void main(String[] args) {
		// largest number of an array
		int[] arr = { 12, 45, 2, 41, 31, 10, 8, 6, 4 };
		// System.out.println(arr.length);
		int largeNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			if (arr[i] > largeNum) {
				largeNum = arr[i];
			}
		}
		System.out.println(largeNum);
	}

}

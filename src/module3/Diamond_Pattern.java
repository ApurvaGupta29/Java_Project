package module3;

public class Diamond_Pattern {

	public static void main(String[] args) {
		int n = 5;

		// Top half: same as the pyramid
		for (int i = 1; i <= n; i++) {
		    for (int s = 1; s <= n - i; s++) System.out.print(" ");
		    for (int j = 1; j <= i; j++) System.out.print("* ");
		    System.out.println();
		}

		// Bottom half: pyramid upside down, starting from n-1
		for (int i = n - 1; i >= 1; i--) {
		    for (int s = 1; s <= n - i; s++) System.out.print(" ");
		    for (int j = 1; j <= i; j++) System.out.print("* ");
		    System.out.println();
		}
			

	}


}

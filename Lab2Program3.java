import java.util.Scanner;

public class Lab2Program3 {
    public static void main (String[] args) {
        int n = 0;

    	System.out.print("Enter number: ");

		Scanner jint = new Scanner(System.in);
		n = jint.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= n - i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
}
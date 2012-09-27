import java.util.Scanner;

public class Lab2Program3 {
    public static void main (String[] args) {
    	int n = 0;

		System.out.print("Enter number: ");

		Scanner jint = new Scanner(System.in);
		n = jint.nextInt();

		int i = 0, j; //Counters

		for (i = -n; i < 0; i++) {
			int k = 1; //Counter

			for (j = -i; j > 0; j--) {
				System.out.print(k + " ");
				k++;
			}

			System.out.println();
		}
	}
}
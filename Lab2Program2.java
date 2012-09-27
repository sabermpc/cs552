import java.util.Scanner;

public class Lab2Program2 {
    public static void main (String[] args) {
		int n1, n2;

		Scanner jint = new Scanner(System.in);

		System.out.println("Enter positive integer 1:");
		n1 = jint.nextInt();
		System.out.println("Enter positive integer 2:");
		n2 = jint.nextInt();

		int d = 0;
		int flag1 = -1, flag2 = -1;
		int i = 0; //Counters

		if (n1 > n2) {
			for (d = n2; d - 1 > 0; d--) {
				flag1 = n1 % d;
				flag2 = n2 % d;
				if ((flag1 == 0) && (flag2 == 0)) break;
			}
		} else {
			for (d = n1; d - 1 > 0; d--) {
				flag1 = n1 % d;
				flag2 = n2 % d;
				if ((flag1 == 0) && (flag2 == 0)) break;
			}
		}

		System.out.println("Input 1: " + n1);
		System.out.println("Input 2: " + n2);
		System.out.println("Greatest Common Divisor: " + d);
	}
}
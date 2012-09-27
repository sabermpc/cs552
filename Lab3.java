import java.util.Scanner;

public class Lab3 {
    public static void main (String[] args) {
		Scanner jin = new Scanner(System.in);
		String n1, n2;

		System.out.println("Please enter a positive number:");
		n1 = jin.nextLine();
		System.out.println("Please enter a second positive number");
		n2 = jin.nextLine();
		//System.out.println(n1 + " " + n2);

		int lastRef = 8;
		char[] num1 = new char[lastRef];
		int[] num2 = new int[lastRef];
		int[] result = new int[lastRef];

		int length1 = n1.length();
		int length2 = n2.length();

		for (int i = lastRef; i > 0; i--) {
			n1.getChars(0, n1.length(), num1, lastRef - n1.length());
		}
		System.out.println(num1 + "\n" + n1.charAt(n1.length() - 1));
	}
}
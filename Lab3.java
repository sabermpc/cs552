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

        int lastRef;
        if (n1.length() > n2.length()) lastRef = n1.length() + 1;
        else lastRef = n2.length() + 1;
        
        int[] num1 = new int[lastRef];
        int[] num2 = new int[lastRef];
        int[] result = new int[lastRef];

        int ref1 = n1.length() - 1;
        int ref2 = n2.length() - 1;

        int carry = 0;

        for (int i = lastRef, j = 0, k = 0; i > 0; i--) {
            if (j <= ref1) {
                num1[i - 1] = n1.charAt(ref1 - j) - '0';
                j++;
            } else num1[i - 1] = 0;

            if (k <= ref2) {
                num2[i - 1] = n2.charAt(ref2 - k) - '0';
                k++;
            } else num2[i - 1] = 0;

            if (carry == 1) {
                result[i - 1] = num1[i - 1] + num2[i - 1] + 1;
                if (result[i - 1] >= 10) {
                    result[i - 1] = result[i - 1] - 10;
                    carry = 1;
                }
                else carry = 0;
            } else {
                result[i - 1] = num1[i - 1] + num2[i - 1];
                if (result[i - 1] >= 10) {
                    result[i - 1] = result[i - 1] - 10;
                    carry = 1;
                } else carry = 0;
            }
        }

        int flag = 0;

        for (int z = 0; z < lastRef; z++) {
            if ((num1[z] > 0) || (flag == 1)) {
                System.out.print(num1[z]);
                flag = 1;
            } else System.out.print(" ");
        }

        System.out.println();

        flag = 0;

        for (int z = 0; z < lastRef; z++) {
            if ((num2[z] > 0) || (flag == 1)) {
                System.out.print(num2[z]);
                flag = 1;
            } else System.out.print(" ");
        }

        System.out.println();
        for (int z = 0; z < lastRef; z++) {
            System.out.print("-");
        }
        System.out.println();

        flag = 0;

        for (int z = 0; z < lastRef; z++) {
            if ((result[z] > 0) || (flag == 1)) {
                System.out.print(result[z]);
                flag = 1;
            } else System.out.print(" ");
        }

        System.out.println();
    }
}
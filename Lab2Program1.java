import java.util.Scanner;

public class Lab2Program1 {
    public static void main(String[] args) {
        int userInt = -1;
        int max = 0, min = 0, total = 0;
        double average = 0.0;
        int i = 0, pos = 0, neg = 0; //counters

        while (userInt != 0) {
            System.out.print("Input: ");

            Scanner jint = new Scanner(System.in);
            userInt = jint.nextInt();

//            while (userInt != 0) {
                i++;

                //Checking for maximum.
                if (userInt > max) max = userInt;

                //Checking for minimum.
                if (userInt < min) min = userInt;

                //Totaling up numbers.
                total = total + userInt;

                //Average of the numbers.
                average = total / 7;
                if ((i % 7) == 0) {
                    average = 0;
                    max = 0;
                    min = 1000;
                    total = 0;
                }
//    		}
        }
    }
}
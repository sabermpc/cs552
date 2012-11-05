import java.util.Scanner;

public class Lab2Program1 {
    public static void main(String[] args) {
        int  i = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, neg = 0, pos = 0, total = 0, userInt = -1;
        double average = 0.0;

        while (userInt != 0) {
            System.out.print("Input number or '0' to terminate: ");

            Scanner jint = new Scanner(System.in);
            userInt = jint.nextInt();

            if (userInt == 0) break;

            //Count of numbers entered.
            i++;

            //Checking for positive or negative.
            if (userInt > 0) pos++;
            else neg++;

            //Checking for maximum.
            if (userInt > max) max = userInt;

            //Checking for minimum.
            if (userInt < min) min = userInt;

            //Totaling up numbers.
            total = total + userInt;

            //Average of the numbers.
            average = (float)total / i;
        }

        System.out.println("The sum of the numbers: " + total);
        System.out.println("The average of the numbers: " + average);
        System.out.println("The highest number: " + max);
        System.out.println("The lowest number: " + min);
        System.out.println("Count of positive numbers: " + pos);
        System.out.println("Count of negative numbers: " + neg);
        System.out.println("Count of all numbers: " + i);
    }
}
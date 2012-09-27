import java.util.Scanner;

public class Lab2Program1 {
    public static void main(String[] args) {
        int userInt = -1;
        int max = 0, min = 1000, total = 0;
        double average = 0.0, i = 0.0;
        int pos = 0, neg = 0; //counters

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
            average = total / i + 0.0;
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
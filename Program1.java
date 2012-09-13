import java.lang.Integer;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.print("Input: ");
    	
    	Scanner jint = new Scanner(System.in);
    	int number = jint.nextInt();
    	    	
   		int third = number % 10;
   		int second = (number / 10) % 10;
   		int first = number / 100;
   		int sum = first + second + third;
   		
   		System.out.println("Output: " + number + " Sum of digits is " + sum);
	}
}
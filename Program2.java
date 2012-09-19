import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.print("First and Last Name? ");

        Scanner jin = new Scanner(System.in);
        String str = jin.nextLine();

        if (str.trim().equals("")) {
        	System.out.println("I'm sorry, I didn't get your name.");
        } else {
        	System.out.println(str);
        	System.out.println(str.substring(str.indexOf(" ") + 1) + ", " + str.substring(0, str.lastIndexOf(" ")));
        }
	}
}
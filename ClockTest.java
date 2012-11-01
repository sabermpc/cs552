import java.util.Scanner;

public class ClockTest {
	public static void main(String[] args) {
    	System.out.print("Enter command: ");
		Scanner s = new Scanner(System.in);

		Clock c = new Clock(03, 33, 13);
//		Clock c = new Clock(03, 33, 32, pm);

		while (s.hasNextLine()) {
			String str = s.nextLine();

			Scanner scanString = new Scanner(str);
			String command = scanString.next();

			if (command.equals("sec")) {
					if (!scanString.hasNextInt()) {
						System.out.println("WARNING - an invalid entry was made.");
					}
					int inVal = scanString.nextInt();
					c.addSeconds(inVal);
			} else if (command.equals("min")) System.out.println();
			else if (command.equals("hr")) System.out.println();
			else if (command.equals("pm")) System.out.println();
			else if (command.equals("exit")) break;
			else System.out.println("Invalid command");

			System.out.print("Enter command: ");
		}
	}
}
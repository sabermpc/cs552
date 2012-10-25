import java.util.Scanner;

public class StatsPackTest {
    public static void main(String[] args) {
		System.out.print("Enter command: ");
		Scanner s = new Scanner(System.in);

		StatsPack stat = new StatsPack();
		while (s.hasNextLine()) {
			String str = s.nextLine();
			
			Scanner scanString = new Scanner(str);
			String command = scanString.next();
			
			if (command.equals("add")) {
				while (scanString.hasNextLine()) {
					if (!scanString.hasNextInt()) {
						System.out.println("Invalid entry for 'add' command.");
						break;
					}
					int inVal = scanString.nextInt();
					stat.addValue(inVal);
				}
			} else if (command.equals("num")) System.out.println(stat.numVals());
			else if (command.equals("tot")) System.out.println(stat.total());
			else if (command.equals("avg")) System.out.println(stat.average());
			else if (command.equals("low")) System.out.println(stat.lowest());
			else if (command.equals("high")) System.out.println(stat.highest());
			else if (command.equals("pos")) System.out.println(stat.numPositive());
			else if (command.equals("neg")) System.out.println(stat.numNegative());
			else if (command.equals("zero")) System.out.println(stat.numZero());
			else if (command.equals("reset")) stat.reset();
			else if (command.equals("exit")) break;
			else System.out.println("Invalid command");
			
			System.out.print("Enter command: ");
		}
	}
}
import java.util.*; // This is kind of like a #include in C++

public class Sample2
{
    public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = in. nextLine();
		
		System.out.println("How many hours did you work?");
		int hours = in.nextInt();
		
		System.out.println("What is your hourly pay rate?");
		double rate = in.nextDouble();
		
		double pay = hours * rate;
		
		System.out.println(name + " has made " + pay + " dollars.");
	}
}
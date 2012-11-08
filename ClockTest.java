import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
    	Clock b = new Clock(23, 30, 30);
		Clock c = new Clock(11, 30, 30, true);
//    	b.addSeconds(30);
//		c.addSeconds(30);
//		b.addSeconds(3600);
//		c.addSeconds(3600);
//    	b.addMinutes(50);
//		c.addMinutes(50);
//		b.addMinutes(120);
//		c.addMinutes(120);
//    	b.addHours(3);
//		c.addHours(3);
//		b.addHours(48);
//		c.addHours(48);
//    	b.set(-12, 59, 59, true);
    	b.addSeconds(3600);
//    	b.addMinutes(59);
//    	b.addHours(-3);
		c.set(23, 50, 30);

		System.out.println(b);
		System.out.println(c);
		System.out.print(b.getHours24() + "/" + b.getHours12() + " : " + b.getMinutes() + " : " + b.getSeconds() + " : ");
		if (b.isPM()) System.out.print("PM");
		else System.out.println("AM");
		System.out.print(c.getHours24() + "/" + c.getHours12() + " : " + c.getMinutes() + " : " + c.getSeconds() + " : ");
		if (c.isPM()) System.out.print("PM");
		else System.out.println("AM");
		System.out.println();
		if (b.equals(c)) System.out.println("These clocks are equal!!");
	}
}
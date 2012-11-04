import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
		Clock b = new Clock(11, 30, 30);
		Clock c = new Clock(11, 30, 30, false);
//		c.addSeconds(30);
//		c.addSeconds(30);
//		b.addSeconds(30);
//		b.addSeconds(30);
//		c.addMinutes(50);
//		c.addMinutes(50);
//		b.addMinutes(50);
//		b.addMinutes(50);
//		c.addHours(13);
//		c.addHours(13);
//		b.addHours(13);
//		b.addHours(13);
//		c.set(1, 59, 59);
//		b.set(1, 59, 59);

		System.out.println(b);
		System.out.println(c);
		System.out.println(c.equals(b));
/*		System.out.println(c.getHours12());
		System.out.println(c.getHours24());
		System.out.println(c.getMinutes());
		System.out.println(c.getSeconds());
		System.out.println(c.isPM());
*/	}
}
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        int l = 3, w = 5;
        String c = "orange";

        Scanner s = new Scanner(System.in);
        Rectangle rect = new Rectangle(l, w, c);
        
        System.out.println("Enter a # for length.");
        l = s.nextInt();
        System.out.println("Enter a # for width.");
        w = s.nextInt();
        System.out.println("Enter a color.");
        c = s.next();
        
        rect.setLength(l);
        rect.setWidth(w);
        rect.setColor(c);
        
        System.out.println("\nLength: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Color: " + rect.getColor());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
    }
}
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        int l, w;
        String c;

        Rectangle rect = new Rectangle();
        Scanner s = new Scanner(System.in);
        
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
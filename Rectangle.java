public class Rectangle {
    private int length = 0;
    private int width = 0;
    private String color = "white";

    public Rectangle (int l, int w, String c) {
        length = l;
        width = w;
        color = c;
    }
    public void setLength(int l) {
        length = l;
    }
    public void setWidth(int w) {
        width = w;
    }
    public void setColor(String c) {
        color = c;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }
    public int getPerimeter() {
        int perimeter = 0;

        perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
    public int getArea() {
        int area = 0;

        area = length * width;
        return area;
    }
}
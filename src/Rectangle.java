import java.util.Scanner;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return width*2 + length*2;
    }

    public String setWidth() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new width: ");
        double text = keyboard.nextDouble();
        double temp = width;
        width = text;
        return "Previous width> " + temp +
                "\n";
    }
    public String setLength() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new length: ");
        double text = keyboard.nextDouble();
        double temp = length;
        length = text;
        return "Previous length> " + temp +
                "\n";
    }

    public String toString() {
        return "A rectangle with width " + width + " and length " + length + ", which is a subclass of " + super.toString();
    }

}

import java.util.Scanner;
import java.math.*;
public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 1;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super.color = color;
        super.filled = filled;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return (Math.PI*2)*radius;
    }
    public String setRadius() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new radius: ");
        double text = keyboard.nextDouble();
        double temp = radius;
        radius = text;
        return "Previous radius> " + temp +
                "\n";
    }

    public String toString() {
        return "A circle with radius " +  radius + ", which is a subclass of " + super.toString();
    }
}

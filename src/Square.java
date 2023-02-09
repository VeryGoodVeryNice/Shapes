import java.util.Scanner;

public class Square extends Rectangle{

    public Square(double side) {
        super.length = side;
        super.width = side;
    }
    public String setWidth() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new width: ");
        double text = keyboard.nextDouble();
        double temp = width;
        width = text;
        length = text;
        return "Previous width> " + temp +
                "\n";
    }
    public String setLength() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new length: ");
        double text = keyboard.nextDouble();
        double temp = length;
        length = text;
        width = text;
        return "Previous length> " + temp +
                "\n";
    }
    public String toString() {
        return "A square with side " + length + ", which is a subclass of " + super.toString();
    }

}

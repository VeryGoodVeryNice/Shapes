import java.util.Scanner;
public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {
        color = "green";
        filled = true;
    }
    public String getColor() {
        return color;
    }
    public String getFilled() {
        String a = " ";
        if (filled == true)
            a = "filled";
        if (filled == false)
            a = "not filled";
        return a;
    }
    public String setColor() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new color: ");
        String text = keyboard.nextLine();
        String temp = color;
        color = text;
        return "Previous color> " + temp +
                "\n";
    }
    public String setFilled() {
        if (filled == true)
            filled = false;
        else
            filled = true;

        String a = " ";
        if (filled == true)
            a = "filled";
        if (filled == false)
            a = "not filled";
        return "Shape is now " + a;

    }

    public String toString() {
        String a = " ";
        if (filled == true)
            a = "filled";
        if (filled == false)
            a = "not filled";
        return "a shape with color " + color + " that is " + a + ".";
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape("red",false);

        Circle c1 = new Circle(8,"yellow",true);
        System.out.println(c1);
    }
}

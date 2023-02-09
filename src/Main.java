public class Main {
    public static void main(String[] args) {
       Shape s1 = new Shape();
       Rectangle sq = new Square(10);
       Shape c = new Circle(2,"yellow,", false);
       Rectangle r = new Rectangle(6,8);

       System.out.println(sq.setLength());
       System.out.println(sq.setColor());
       System.out.println(sq.setFilled());
       System.out.println(sq);
       //
       System.out.println(" ");
       //
       System.out.println(sq.getArea() + " - " + sq.getPerimeter());
    }
}

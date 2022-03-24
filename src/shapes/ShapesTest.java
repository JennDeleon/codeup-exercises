package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Quadrilateral myShape = new Rectangle(4, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getLength());
        System.out.println(myShape.getPerimeter());


        myShape = new Square(6);
        System.out.println(((Square) myShape).getSide());
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        ((Square) box2).setSize(6);

        System.out.println("Perimeter of box1: " + box1.getPerimeter());
        System.out.println("Area of box1: " + box1.getArea());
        System.out.println("Perimeter of box2: " + box2.getPerimeter());
        System.out.println("Area of box2: " + box2.getArea());
        System.out.println("Perimeter of box2: " + box2.getPerimeter());
        System.out.println("Area of box2: " + box2.getArea());

    }
}

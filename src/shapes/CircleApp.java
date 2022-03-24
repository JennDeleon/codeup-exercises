package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        while (true) {
            circleRadius(input);
            boolean moreCircles = input.yesNo("More circles? type yes or no ");
            if(!moreCircles) {
                break;
            }
        }
        input.close();
    }

    private static void circleRadius(Input input) {
        double radius = input.getDouble("Enter number: ");
        Circle circle = new Circle(radius);
        Circle.setNumCircles(Circle.getNumCircles() + 1);
        System.out.printf("The area of circle with radius %.2f is %.2f\n", radius, circle.getArea());
        System.out.printf("And the circumference of circle with radius %.2f is %.2f\n", radius, circle.getCircumference());
    }
}
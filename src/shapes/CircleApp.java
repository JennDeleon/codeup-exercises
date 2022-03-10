package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        // loop until user says no more circles
        while (true) {
            doACircle(input);

            boolean moreCircles = input.yesNo("More circles? y/n ");
            if(!moreCircles) {
                break;
            }
        }

        System.out.println("# circles created: " + Circle.getNumCircles());
    }

    private static void doACircle(Input input) {
        Circle.setNumCircles(Circle.getNumCircles() + 1);
    }
}
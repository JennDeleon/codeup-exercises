package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    public void setSize(double size) {
        super.setLength(size);
        super.setWidth(size);
    }
}

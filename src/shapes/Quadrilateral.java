package shapes;

public abstract class Quadrilateral extends Shapes implements Measurable {
    protected double length, width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
//        is this doing anything??
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
package task05;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}

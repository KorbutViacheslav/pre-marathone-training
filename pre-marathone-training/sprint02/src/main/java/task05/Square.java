package task05;

public class Square extends Figure {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return 4 * width;
    }
}

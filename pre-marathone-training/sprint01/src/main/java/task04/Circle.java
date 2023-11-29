package task04;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Without parameters.");
    }

    public void draw(String colour) {
        System.out.println(colour);
    }

    public void draw(float scale) {
        System.out.println(scale);
    }

    public void draw(String colour, float scale) {
        System.out.println(colour + " and " + scale);
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.draw();
        circle.draw("Red");
        circle.draw(15f);
        circle.draw("Red", 15f);
    }
}

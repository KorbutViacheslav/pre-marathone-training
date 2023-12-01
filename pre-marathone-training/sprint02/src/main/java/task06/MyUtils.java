package task06;

import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {
    public static List<Shape> maxAreas(List<Shape> shapeList) {
        /**
         * @implNote First solution to the problem.
         */
/*        List<Shape> circles = shapeList.stream().filter(Circle.class::isInstance).toList();
        double cM = circles.stream().mapToDouble(Shape::getArea).max().orElse(0);

        List<Shape> result = new ArrayList<>(circles.stream().filter(shape -> shape.getArea() == cM).toList());

        List<Shape> rectangle = shapeList.stream().filter(Rectangle.class::isInstance).toList();
        double rM = rectangle.stream().mapToDouble(Shape::getArea).max().orElse(0);
        result.addAll(rectangle.stream().filter(shape -> shape.getArea() == rM).toList());
        return result;*/
        /**
         * @implNote Best solution to my mind.
         */
        double cM = shapeList.stream()
                .filter(Circle.class::isInstance)
                .mapToDouble(Shape::getArea)
                .max()
                .orElse(0);
        double rM = shapeList.stream()
                .filter(Rectangle.class::isInstance)
                .mapToDouble(Shape::getArea)
                .max()
                .orElse(0);
        return shapeList.stream()
                .filter(shape -> shape.getArea() == cM || shape.getArea() == rM)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Shape> list = List.of(new Circle(2),
                new Circle(1),
                new Circle(0.5),
                new Rectangle(2, 3),
                new Rectangle(3, 2),
                new Rectangle(1, 2));
        maxAreas(list).forEach(System.out::println);
    }
}

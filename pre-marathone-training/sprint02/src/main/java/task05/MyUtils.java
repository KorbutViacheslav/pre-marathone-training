package task05;

import java.util.List;
import java.util.Objects;

public class MyUtils {
    public static double sumPerimeter(List<Figure> figures) {
        if (figures.isEmpty()) {
            return 0;
        }
        return figures.stream()
                .filter(Objects::nonNull)
                .mapToDouble(Figure::getPerimeter).sum();
    }

    public static void main(String[] args) {
        List<Figure> figures = List.of(
                new Square(2),
                new Square(3),
                new Rectangle(4, 5),
                new Rectangle(1, 2)
        );
        System.out.println(sumPerimeter(figures));
    }
}

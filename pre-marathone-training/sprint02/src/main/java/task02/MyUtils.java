package task02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    public static Map<String, Double> averageRating(List<Coffee> coffeeList) {
        return coffeeList.stream()
                .collect(Collectors.groupingBy(Coffee::getName, Collectors.averagingDouble(Coffee::getRating)));
    }

    public static void main(String[] args) {
        List<Coffee> coffees = List.of(
                new Espresso("Espresso", 8),
                new Cappuccino("Cappuccino", 10),
                new Espresso("Espresso", 10),
                new Cappuccino("Cappuccino", 6),
                new Coffee("Coffee", 6)
        );
        System.out.println(averageRating(coffees));
    }
}

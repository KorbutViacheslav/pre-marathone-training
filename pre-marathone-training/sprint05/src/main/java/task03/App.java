package task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class App {
    static BinaryOperator<String> greetingOperator = "Hello " + parameter1 + " " + parameter2 + "!!!";

    public static <T> List<T> createGreetings(List<T> list, BinaryOperator<String> binaryOperator) {
        return new ArrayList<>();
    }
}
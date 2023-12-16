package task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class App {
    private static final BinaryOperator<String> greetingOperator = (param1, param2) -> {
        return "Hello " + param1 + " " + param2 + "!!!";
    };

    public static List<String> createGreetings(List<Person> list, BinaryOperator<String> binaryOperator) {
        List<String> resultList = new ArrayList<>();
        for (Person p : list) {
            resultList.add(binaryOperator.apply(p.name, p.surname));
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Adam", "Walker"),
                new Person("John", "Dou"),
                new Person("Rob", "Williams"));
        createGreetings(personList,greetingOperator).forEach(System.out::println);
    }
}
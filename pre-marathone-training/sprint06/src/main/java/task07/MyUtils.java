package task07;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {
    public static void main(String[] args) {
        List<Integer> result = duplicateElements(Stream.of(3, 2, 1, 1, 12, 3, 8, 2, 4, 2)).toList();

        System.out.println(result);
    }

    public static Stream<Integer> duplicateElements(Stream<Integer> stream) {
        return null;
    }
}

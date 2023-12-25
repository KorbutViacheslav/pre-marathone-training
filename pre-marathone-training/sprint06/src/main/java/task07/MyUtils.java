package task07;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {
    public static void main(String[] args) {
        List<Integer> result = duplicateElements(Stream.of(3, 2, 1, 1, 12, 3, 8, 2, 4, 2))
                .toList();
        result.forEach(System.out::print);
    }

    public static Stream<Integer> duplicateElements(Stream<Integer> stream) {
        List<Integer> s = stream.toList();
        return s.stream().filter(i -> Collections.frequency(s, i) > 1).collect(Collectors.toSet()).stream();
    }
}

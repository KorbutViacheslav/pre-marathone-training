package task04.task06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyUtils {
    public static void main(String[] args) {
        List<Stream<String>> givenList = Arrays.asList(
                Stream.of("093 987 65 43", "(050)1234567", "12-345"),
                Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28"),
                Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45"));
        Map<String, Stream<String>> result = phoneNumbers(givenList);
        result.forEach((key, value) -> {
            System.out.print(key + " : ");
            System.out.println(value.collect(Collectors.joining(" , ")));
        });

    }

    public static Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {
        return list.stream()
                .flatMap(s -> s)
                .filter(s -> (s != null) && (!s.isEmpty()))
                .map(s -> s.replaceAll("[^\\d]", ""))
                .map(s -> s.length() == 7 ? "loc".concat(s) : s.length() < 7 ? "err".concat(s) : s)
                .distinct()
                .collect(Collectors.groupingBy(s -> s.substring(0, 3)))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().stream().map(s -> s.substring(3))
                                .sorted()));
    }
}

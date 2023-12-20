package task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {
    public static Stream<String> nameList(Map<String, Stream<String>> map) {
        return map.values().stream()
                .flatMap(i -> i)
                .filter(s -> s != null && !s.isBlank())
                .map(item -> item.replaceAll("\\s+", ""))
                .map(item -> item.substring(0, 1).toUpperCase() + item.substring(1).toLowerCase())
                .distinct()
                .sorted();
    }

    public static void main(String[] args) {
        // Приклад використання
        Map<String, Stream<String>> projectParticipants = Map.of(
                "Desktop", Stream.of(" iVan", "PeTro ", " Ira "),
                "Web", Stream.of("STepan", "ira ", " Andriy ", "an na"),
                "Spring", Stream.of("Ivan", "Anna")
        );

        List<String> sortedParticipants = nameList(projectParticipants)
                .collect(Collectors.toList());

        System.out.println(sortedParticipants);
    }
}

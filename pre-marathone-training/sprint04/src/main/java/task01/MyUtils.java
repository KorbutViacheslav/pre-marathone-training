package task01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    public static void main(String[] args) {
        Map<String, String> phoneName = new HashMap<>();
        phoneName.put("0967654321", "Petro");
        phoneName.put("0677654321", "Petro");
        phoneName.put("0501234567", "Ivan");
        phoneName.put("0970011223", "Stepan");
        phoneName.put("0631234567", "Ivan");
        System.out.println(phoneName);
        System.out.println(createNotebook(phoneName));

    }

    public static Map<String, List<String>> createNotebook(Map<String, String> map) {
/*        Map<String, List<String>> currentMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getValue();
            String phone = entry.getKey();
            if (!currentMap.containsKey(name)) {
                List<String> phoneNumber = new ArrayList<>();
                phoneNumber.add(phone);
                currentMap.put(name, phoneNumber);
            } else {
                currentMap.get(name).add(phone);
            }
        }
        return currentMap;*/
        return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));
    }
}

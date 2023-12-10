package task01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    public static void main(String[] args) {
        //{0967654321=Petro, 0677654321=Petro, 0501234567=Ivan, 0970011223=Stepan, 0631234567=Ivan}
        Map<String, String> phoneName = new HashMap();
        phoneName.put("0967654321", "Petro");
        phoneName.put("0677654321", "Petro");
        phoneName.put("0501234567", "Ivan");
        phoneName.put("0970011223", "Stepan");
        phoneName.put("0631234567", "Ivan");
        System.out.println(phoneName);
        System.out.println(createNotebook(phoneName));

    }

    public static Map<String, String> createNotebook(Map<String, String> map) {
        Map<String,String> currentMap = new HashMap<>(map);
        Collectors.groupingBy(map.av)
        return new HashMap(map);
    }
}

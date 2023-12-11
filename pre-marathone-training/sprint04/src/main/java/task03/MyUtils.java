package task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MyUtils {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aa", "bb", "aa", "cc"));
        Map<Integer, String> map = Map.of(
                1, "cc",
                2, "bb",
                3, "cc",
                4, "aa",
                5, "cc");
        System.out.println(listMapCompare(list, map));
    }

    public static boolean listMapCompare(List<String> list, Map<Integer, String> map) {
        /** Rough solution */
/*        List<String> result = new ArrayList<>();
        for (String l : list) {
            if (map.containsValue(l)) {
                result.add(l);
            } else {
                return false;
            }
        }
        return true;*/
        /** Best solution */
        List<String> result = list.stream()
                .filter(map::containsValue).toList();

        return result.size() == list.size();
    }
}

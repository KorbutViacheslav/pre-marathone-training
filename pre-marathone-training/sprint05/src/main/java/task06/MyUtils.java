package task06;

import java.util.List;
import java.util.function.Predicate;

public class MyUtils {
    public static void main(String[] args) {

    }

    public static int findMaxByCondition(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).toList().get(0);
    }
}

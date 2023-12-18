package task06;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class MyUtils {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 0, -1, -3);
        User user = new User(integerList);

        Predicate<Integer> pred = us -> us > 3;
        BiFunction<List<Integer>, Predicate<Integer>, Integer> biFunction = (list, predicate) -> findMaxByCondition(list, predicate);
        System.out.println(User.getMaxValueByCondition(biFunction, pred));
        Predicate<Integer> lastPred = s -> s == 6;
        System.out.println(User.getFilterdValue(lastPred));

    }

    public static int findMaxByCondition(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).max(Integer::compareTo).get();
    }
}

package task06;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

class User {
    public static List<Integer> values;

    public User(List<Integer> values) {
        User.values = values;
    }

    public static int getFilterdValue(Predicate<Integer> predicate) {
        return getMaxValueByCondition(MyUtils::findMaxByCondition, predicate);
    }

    public static int getMaxValueByCondition(BiFunction<List<Integer>, Predicate<Integer>, Integer> num, Predicate<Integer> predicate) {
        return num.apply(values, predicate);
    }
}

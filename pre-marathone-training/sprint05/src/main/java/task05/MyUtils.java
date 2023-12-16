package task05;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class MyUtils {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> integer > 0;
        Predicate<Integer> predicate2 = integer -> integer != 5;
        Predicate<Integer> predicate3 = integer -> integer < 7;
        Set<Predicate<Integer>> predicateSet = Set.of(predicate,predicate2,predicate3);
        Set<Integer> integerSet = Set.of(-1, 1, 2, 3, 4, 5, 6, 7);
        integerSet.stream().filter(getPredicateFromSet(predicateSet)).toList().forEach(System.out::println);

    }

    public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> set) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }
        };
        for (Predicate<Integer> pred : set) {
            predicate.and(pred);
        }
        return predicate;
    }
}

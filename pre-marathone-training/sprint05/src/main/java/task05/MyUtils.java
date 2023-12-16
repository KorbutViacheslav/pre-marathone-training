package task05;

import java.util.Set;
import java.util.function.Predicate;

public class MyUtils {
    public static void main(String[] args) {
        //Created new three Predicate
        Predicate<Integer> predicate = integer -> integer > 0;
        Predicate<Integer> predicate2 = integer -> integer != 5;
        Predicate<Integer> predicate3 = integer -> integer < 7;

        //Added all Predicate to Set
        Set<Predicate<Integer>> predicateSet = Set.of(predicate, predicate2, predicate3);

        //Created Set of Integers
        Set<Integer> integerSet = Set.of(-1, 1, 2, 3, 4, 5, 6, 7);

        //Get List of Integers after filter getPredicateFromSet()
        integerSet.stream().filter(getPredicateFromSet(predicateSet)).toList().forEach(System.out::println);
    }

    //Method from union several of Predicate in one
    public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> set) {
        Predicate<Integer> predicate = integer -> true;
        for (Predicate<Integer> pred : set) {
            predicate = predicate.and(pred);
        }
        return predicate;
    }
}

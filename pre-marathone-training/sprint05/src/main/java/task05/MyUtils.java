package task05;

import java.util.Set;
import java.util.function.Predicate;

public class MyUtils {
    public static void main(String[] args) {

    }
    public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> set){
        Predicate<Integer> predicate = null;
        for(Predicate<Integer> pred:set){
            predicate.and(pred);
        }
        return predicate;
    }
}

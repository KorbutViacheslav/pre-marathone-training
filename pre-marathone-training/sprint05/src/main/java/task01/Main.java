package task01;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> integer > 0;
        Integer[] integers = {1, 4, 0, -2, -6, 5};
        System.out.println(getCount(integers, predicate));
    }

    public static int getCount(Integer[] array, Predicate<Integer> predicate) {
        return (int) Arrays.stream(array).filter(predicate).count();
    }
}

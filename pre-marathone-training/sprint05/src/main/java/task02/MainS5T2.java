package task02;

import java.util.Arrays;
import java.util.function.Consumer;

public class MainS5T2 {

    /**
     * Best solution
     */
    private static final Consumer<double[]> betterConsumer = aDouble ->
            Arrays.setAll(aDouble, i -> aDouble[i] > 2 ? aDouble[i] * 0.8 : aDouble[i] * 0.9);

    /**
     * Rough solution
     */
    private static final Consumer<double[]> consumer = aDouble -> {
        for (int i = 0; i < aDouble.length; i++) {
            if (aDouble[i] > 2) {
                aDouble[i] *= 0.8;
            } else {
                aDouble[i] *= 0.9;
            }
        }
    };

    public static void main(String[] args) {

        double[] doubles = {10.0, 1.0, 2.7, 1.8};

        System.out.println("Arrays of doubles after consumer:");
        Arrays.stream(getChanged(doubles, betterConsumer)).forEach(System.out::println);

        System.out.println("Initial array do not changed:");
        Arrays.stream(doubles).forEach(System.out::println);

        /** Check for null */
        double[] nullArray = null;
        Arrays.stream(getChanged(nullArray, consumer)).forEach(System.out::println);

    }

    public static double[] getChanged(double[] array, Consumer<double[]> consumer) {
        if (array == null) {
            throw new NullPointerException("Array is null!");
        }
        double[] result = Arrays.copyOf(array, array.length);
        consumer.accept(result);
        return result;
    }
}

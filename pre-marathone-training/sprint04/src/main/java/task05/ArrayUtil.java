package task05;

class ArrayUtil {
    public static void main(String[] args) {
        /**Print to display: 3.0 */
        Array<Integer> set1 = new Array<>(new Integer[]{1, 2, 4, 5});
        double averageValue1 = ArrayUtil.averageValue(set1);
        System.out.println(averageValue1);

        /** Print to display: 3.0 */
        Array<Double> set2 = new Array<>(new Double[]{1.0, 3.0, 5.0});
        double averageValue2 = ArrayUtil.averageValue(set2);
        System.out.println(averageValue2);
    }

    public static <T extends Number> double averageValue(Array<T> array) {
        T[] elements = array.getArray();
        double sum = 0.0;
        for (T element : elements) {
            sum += element.doubleValue();
        }
        return sum / array.length();
    }
}

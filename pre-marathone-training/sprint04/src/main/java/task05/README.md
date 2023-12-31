# Task05: Generic.

Suppose we have the next generic class:

````java
public class Array<T> {
    private T[] array;
    public Array(T[] array) {this.array = array;}
    public T[] getArray() {return array;}
    public int length() {return array.length;}
}
````

In the class ArrayUtil write static method named "averageValue(...)" that takes an object of Array type as input, and
returns the average value its elements.

The given method should returns value of double type and take any array, whose elements extends Number type.

Examples of usage:
````java
        /**Print to display: 3.0 */
        Array<Integer> set1 = new Array<>(new Integer[]{1, 2, 4, 5});
        double averageValue1 = ArrayUtil.averageValue(set1);
        System.out.println(averageValue1);

        /** Print to display: 3.0 */
        Array<Double> set2 = new Array<>(new Double[]{1.0, 3.0, 5.0});
        double averageValue2 = ArrayUtil.averageValue(set2);
        System.out.println(averageValue2);
````
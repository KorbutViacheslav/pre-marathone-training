# Task05

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

![screenshot](https://github.com/bbogdasha/java-online-marathon/blob/master/sprint04/task05/screenshot/task05_2.png)
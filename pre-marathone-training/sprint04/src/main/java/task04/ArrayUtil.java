package task04;

public class ArrayUtil<E> {
    public static <E> E setAndReturn(E[] array, E entity, int position) {
        array[position] = entity;
        return array[position];
    }

    public static void main(String[] args) {
        //Print to dis[lay: 52
        Integer[] numbers = new Integer[3];
        int numberFromSecondPosition =
                ArrayUtil.<Integer>setAndReturn(numbers, 52, 1);
        System.out.println(numberFromSecondPosition);

        //Print to display: Hello
        String[] words = new String[3];
        String wordFromSecondPosition =
                ArrayUtil.<String>setAndReturn(words, "Hello", 1);
        System.out.println(wordFromSecondPosition);
    }
}

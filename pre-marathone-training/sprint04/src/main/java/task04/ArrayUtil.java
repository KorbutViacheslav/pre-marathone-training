package task04;

public class ArrayUtil<E> {
    public E setAndReturn(E[] array, E entity, int position) {
        E[] ar = array;
        ar[position] = entity;
        return (E) ar;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[3];
        int numberFromSecondPosition = (int) ArrayUtil.setAndReturn(numbers, 52, 1);
        System.out.println(numberFromSecondPosition);
        String[] words = new String[3];
        String wordFromSecondPosition;
    }
}

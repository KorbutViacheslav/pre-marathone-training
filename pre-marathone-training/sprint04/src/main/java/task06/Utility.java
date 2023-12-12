package task06;

import java.util.Arrays;
import java.util.Comparator;

public class Utility {
    public static <T extends Person> void sortPeople(T[] people, Comparator<? super T> comparator) {
        Arrays.sort(people, comparator);
    }

    public static void main(String[] args) {
        Person[] people = {new Person("Sam", 18),
                new Employee("Adam", 20, 1000),
                new Developer("Bob", 17, 800, Level.JUNIOR),
                new Developer("Bob", 16, 800, Level.JUNIOR)};
        for (Person p : people) {
            System.out.println(p.toString());
        }
        sortPeople(people, new PersonComparator());
        System.out.println();
        for (Person p : people) {
            System.out.println(p.toString());
        }


    }
}

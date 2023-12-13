package task06;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null || o2 == null) {
            throw new NoSuchElementException("Person absent!");
        }
        int nameComparison = o1.name.compareTo(o2.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(o1.age, o2.age);

    }
}

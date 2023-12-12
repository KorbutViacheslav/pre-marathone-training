package task06;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.name.compareTo(o2.name) == 0) {
            return o1.age - o2.age;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}

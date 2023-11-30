package task03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {
    public static List<Person> maxDuration(List<Person> people) {
        List<Student> s = new ArrayList<>();
        int sD = 0;
        List<Worker> w = new ArrayList<>();
        int pD = 0;
        for (Person p : people) {
            if (p instanceof Student) {
                if (((Student) p).getStudyYears() >= sD) {
                    sD = ((Student) p).getStudyYears();
                    s.add((Student) p);
                }
            } else if ((p instanceof Worker)) {
                if (((Worker) p).getExperienceYears() >= pD) {
                    pD = ((Worker) p).getExperienceYears();
                    w.add((Worker) p);
                }
            }
        }
        return Stream.concat(s.stream(), w.stream()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Person person = new Person("Ivan");
        Worker worker1 = new Worker("Andriy", "Developer", 12);
        Worker worker2 = new Worker("Ira", "Manager", 8);
        Student student1 = new Student("Stepan", "College", 4);
        Student student2 = new Student("Ihor", "University", 4);

        List<Person> people = List.of(person, worker1, worker2, student1, student2);

        maxDuration(people).forEach(System.out::println);

    }
}

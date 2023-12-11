package task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyUtils {
    public static void main(String[] args) {
        List<Student> l1 = List.of(new Student(1, "Ivan"),
                new Student(2, "Petro"),
                new Student(3, "Stepan"));
        List<Student> l2 = List.of(new Student(1, "Ivan"),
                new Student(3, "Stepan"),
                new Student(3, "Andriy"));
        commonStudents(l1, l2).forEach(System.out::print);

    }

    public static List<Student> commonStudents(List<Student> l1, List<Student> l2) {
        //Rough solution
/*        List<Student> students = new ArrayList<>(l1);
        students.addAll(l2);
        List<Student> unique = new ArrayList<>();
        List<Student> result = new ArrayList<>();
        for (Student student:students){
            if(!unique.contains(student)){
                unique.add(student);
            }else {
                result.add(student);
            }
        }
        return result;*/
        //Best solution
        List<Student> students = new ArrayList<>(l1);
        students.retainAll(l2);
        return students;
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

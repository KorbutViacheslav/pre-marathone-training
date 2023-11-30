package task03;

public class Student extends Person {
    private String studyPlace;
    private int studyYears;

    public String getStudyPlace() {
        return studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    @Override
    public String toString() {
        return "Student{name=" + getName() +
                ", studyPlace=" + studyPlace +
                ", studyYears=" + studyYears +
                '}';
    }
}

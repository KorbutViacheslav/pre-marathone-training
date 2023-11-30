package task03;

public class Worker extends Person {
    private String workPosition;
    private int experienceYears;

    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Worker[name=" + getName() +
                ", workPosition=" + workPosition + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}

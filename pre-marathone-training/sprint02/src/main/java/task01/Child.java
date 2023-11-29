package task01;

public class Child extends Person {
    private String childIDNumber;

    public Child(int age, String healthInfo, String name, String childIDNumber) {
        super(age, healthInfo, name);
        this.childIDNumber = childIDNumber;
    }

    @Override
    public String getHealthStatus() {
        return super.getHealthStatus() + " childIDNumber:" + childIDNumber;
    }
}

package task01;

public abstract class Person {
    protected int age;
    protected String healthInfo;
    protected String name;

    public Person(int age, String healthInfo, String name) {
        this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
    }

    public String getHealthStatus() {
        return name + " healthInfo:" + healthInfo;
    }

}

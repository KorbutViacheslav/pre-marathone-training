package task01;

public class Adult extends Person {
    private String passportNumber;

    public Adult(int age, String healthInfo, String name, String passportNumber) {
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    }

    @Override
    public String getHealthStatus() {
        return super.getHealthStatus() + " passportNumber: " + passportNumber;
    }
}

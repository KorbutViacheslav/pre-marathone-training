package task06;

import java.util.Comparator;

public class DeveloperComparator implements Comparator<Developer> {

    @Override
    public int compare(Developer o1, Developer o2) {
        int employeeComparison = new EmployeeComparator().compare(o1, o2);
        if (employeeComparison != 0) {
            return employeeComparison;
        }
        return o1.getLevel().compareTo(o2.getLevel());
    }
}

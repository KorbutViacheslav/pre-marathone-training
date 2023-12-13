package task06;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int personComparison = new PersonComparator().compare(o1, o2);
        if (personComparison != 0) {
            return personComparison;
        }
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}

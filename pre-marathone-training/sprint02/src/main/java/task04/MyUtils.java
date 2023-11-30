package task04;

import java.math.BigDecimal;
import java.util.*;

public class MyUtils {
    public static List<Employee> largestEmployees(List<Employee> employees) {
        Map<String, Employee> uniqueEmployees = new HashMap<>();

        for (Employee employee : employees) {
            String key = employee.getName();
            if (uniqueEmployees.containsKey(key)) {
                Employee existingEmployee = uniqueEmployees.get(key);
                if (employee.getExperience() > existingEmployee.getExperience() ||
                        (employee.getExperience() == existingEmployee.getExperience() &&
                                employee.getBasePayment().compareTo(existingEmployee.getBasePayment()) > 0)) {
                    uniqueEmployees.put(key, employee);
                }
            } else {
                uniqueEmployees.put(key, employee);
            }
        }

        return new ArrayList<>(uniqueEmployees.values());
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ivan", 10, new BigDecimal("3000.00")),
                new Manager("Petro", 9, new BigDecimal("3000.00"), 1.5),
                new Employee("Stepan", 8, new BigDecimal("4000.00")),
                new Employee("Andriy", 7, new BigDecimal("3500.00")),
                new Employee("Ihor", 5, new BigDecimal("4500.00")),
                new Manager("Vasyl", 8, new BigDecimal("2000.00"), 2.0)
        );
        List<Employee> result = largestEmployees(employees);
        result.forEach(System.out::println);
    }
}

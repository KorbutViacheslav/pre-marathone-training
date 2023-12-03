package task04;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;

public class MyUtils {
    public static List<Employee> largestEmployees(List<Employee> employees) {
        int maxExperienceEmployee = employees.stream()
                .filter(Predicate.not(Manager.class::isInstance))
                .mapToInt(Employee::getExperience)
                .max()
                .orElse(0);
        int maxExperienceManager = employees.stream()
                .filter(Manager.class::isInstance)
                .mapToInt(Employee::getExperience)
                .max()
                .orElse(0);
        BigDecimal maxSalaryEmployee = employees.stream()
                .filter(Predicate.not(Manager.class::isInstance))
                .map(Employee.class::cast)
                .map(Employee::getBasePayment)
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
        BigDecimal maxSalaryManager = employees.stream()
                .filter(Manager.class::isInstance)
                .map(Employee::getBasePayment)
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
        return employees.stream()
                .filter(employee -> employee.getExperience() == maxExperienceManager
                        || employee.getExperience() == maxExperienceEmployee
                        || employee.getBasePayment().equals(maxSalaryManager)
                        || employee.getBasePayment().equals(maxSalaryEmployee))
                .toList();

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
        largestEmployees(employees).forEach(System.out::println);

    }
}

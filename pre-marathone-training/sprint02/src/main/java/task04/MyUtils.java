package task04;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MyUtils {
    public static List<Employee> largestEmployees(List<Employee> workers) {
        return null;
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

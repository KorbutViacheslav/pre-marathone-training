package task03;

public class Employee {
    private String fullName;
    private int salary;

    public Employee() {
    }

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    static class Main {
        public static void main(String[] args) {
            Employee employee = new Employee("Oleksandr", 2000);
            System.out.println(employee.getFullName() + " " + employee.getSalary());
        }
    }
}

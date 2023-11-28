package task02;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("Max", 1000);
        Employee em2 = new Employee("Slava", 800);

        Employee[] employees = {em1, em2};

        StringBuilder sb = new StringBuilder();

        for (Employee employee : employees) {
            sb.append("Name: ")
                    .append(employee.getFullName())
                    .append("; Salary: ")
                    .append(employee.getSalary())
                    .append("\n");
        }
        String employeesInfo = sb.toString();

        System.out.println(employeesInfo);
    }
}

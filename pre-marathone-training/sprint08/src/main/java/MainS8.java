import java.sql.SQLException;

public class MainS8 {
    public static void main(String[] args) throws SQLException {

        MyUtils myUtils = new MyUtils();

        myUtils.createConnection();
        myUtils.createStatement();

        myUtils.createSchema("test08");

        myUtils.useSchema();

        myUtils.createTableRoles();
        //myUtils.insertTableRoles("Developer");

        myUtils.createTableDirections();
        //myUtils.insertTableDirections("Piton");

        myUtils.createTableProjects();
        //myUtils.insertTableProjects("PitonAPI","Piton");
        //myUtils.insertTableProjects("JavaEE","Java");

        myUtils.createTableEmployee();
        //myUtils.insertTableEmployee("Slava","Developer","JavaEE");
        //myUtils.insertTableEmployee("Denis","Developer","PitonAPI");

        System.out.println(myUtils.getRoleId("Developer")
                + ", " + myUtils.getDirectionId("Java")
                + ", " + myUtils.getProjectId("JavaAPI")
                + ", " + myUtils.getEmployeeId("Max"));
        System.out.println("-Roles-");
        myUtils.getAllRoles().forEach(System.out::println);
        System.out.println("-Directions-");
        myUtils.getAllDirection().forEach(System.out::println);
        System.out.println("-Projects-");
        myUtils.getAllProjects().forEach(System.out::println);
        System.out.println("-Employees-");
        myUtils.getAllEmployee().forEach(System.out::println);
        System.out.println("-Developers-");
        myUtils.getAllDevelopers().forEach(System.out::println);
        System.out.println("-JavaDevelopers-");
        myUtils.getAllJavaDevelopers().forEach(System.out::println);
    }
}

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
        //myUtils.insertTableDirections("Java");

        myUtils.createTableProjects();
        //myUtils.insertTableProjects("JavaAPI","Java");

        myUtils.createTableEmployee();
        //myUtils.insertTableEmployee("Max","Developer","JavaAPI");

        System.out.println(myUtils.getRoleId("Developer")
                + ", " + myUtils.getDirectionId("Java")
                + ", " + myUtils.getProjectId("JavaAPI")
                + ", " + myUtils.getEmployeeId("Max"));
        myUtils.getAllRoles().forEach(System.out::println);
        myUtils.getAllDirection().forEach(System.out::println);
        myUtils.getAllProjects().forEach(System.out::println);
        myUtils.getAllEmployee().forEach(System.out::println);
        myUtils.getAllDevelopers().forEach(System.out::println);
        myUtils.getAllJavaDevelopers().forEach(System.out::println);
    }
}

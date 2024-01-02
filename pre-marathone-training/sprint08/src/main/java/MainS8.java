import java.sql.SQLException;

public class MainS8 {
    public static void main(String[] args) throws SQLException {
        MyUtils myUtils = new MyUtils();
        myUtils.createConnection();
        myUtils.createStatement();
        myUtils.createSchema("test08");

        myUtils.useSchema();
        myUtils.createTableRoles();
        myUtils.createTableDirections();
        myUtils.createTableProjects();
        myUtils.createTableEmployee();
    }
}

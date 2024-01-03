import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    Connection connection;
    Statement statement;
    String schemaName;
    private static final String name = "postgres";
    private static final String password = "postgres";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";

    /**
     * Methods for connection and creating schema.
     *
     * @throws SQLException
     */

    public Connection createConnection() throws SQLException {
        connection = DriverManager.getConnection(url, name, password);
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public Statement createStatement() throws SQLException {
        statement = createConnection().createStatement();
        return statement;
    }

    public void closeStatement() throws SQLException {
        statement.close();
    }

    public void createSchema(String schemaName) throws SQLException {
        this.schemaName = schemaName;
        String request = "CREATE SCHEMA IF NOT EXISTS " + schemaName + ";";
        statement.execute(request);
    }

    public void dropSchema() throws SQLException {
        String request = "DROP SCHEMA " + this.schemaName + ";";
        statement.execute(request);
    }

    public void useSchema() throws SQLException {
        String request = "SET search_path TO " + this.schemaName + ";";
        statement.execute(request);
    }

    /**
     * Methods for creating tables
     *
     * @throws SQLException
     */
    public void createTableRoles() throws SQLException {
        String request = " CREATE TABLE IF NOT EXISTS roles(id SERIAL PRIMARY KEY, role_name VARCHAR NOT NULL); ";
        statement.execute(request);
    }

    public void createTableDirections() throws SQLException {
        String request = "CREATE TABLE IF NOT EXISTS directions(id SERIAL PRIMARY KEY, direction_name VARCHAR NOT NULL);";
        statement.execute(request);
    }

    public void createTableProjects() throws SQLException {
        String request = "CREATE TABLE IF NOT EXISTS projects(id SERIAL PRIMARY KEY,project_name VARCHAR NOT NULL,direction_id INT REFERENCES directions(id));";
        statement.execute(request);
    }

    public void createTableEmployee() throws SQLException {
        String request = "CREATE TABLE IF NOT EXISTS employee(id SERIAL PRIMARY KEY,first_name VARCHAR NOT NULL,role_id INT REFERENCES roles (id),project_id INT REFERENCES projects(id));";
        statement.execute(request);
    }

    public void dropTable(String tableName) throws SQLException {
        String request = "DROP TABLE " + tableName + ";";
        statement.execute(request);
    }

    /**
     * Methods for insert data to tables
     *
     * @throws SQLException
     */
    public void insertTableRoles(String roleName) throws SQLException {
        String request = "INSERT INTO roles (role_name) VALUES ('" + roleName + "');";
        statement.executeUpdate(request);
    }

    public void insertTableDirections(String directionName) throws SQLException {
        String request = "INSERT INTO directions (direction_name) VALUES ('" + directionName + "');";
        statement.executeUpdate(request);
    }

    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        String request = "INSERT INTO projects (project_name,direction_id) VALUES ('" + projectName + "',(SELECT(id) FROM directions WHERE direction_name LIKE '" + directionName + "'));";
        statement.executeUpdate(request);
    }

    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        String requestRoleName = "SELECT(id) FROM roles WHERE role_name LIKE '" + roleName + "';";

        ResultSet resultSetRoleName = statement.executeQuery(requestRoleName);
        int roleId = 0;
        while (resultSetRoleName.next()) {
            roleId = resultSetRoleName.getInt("id");
        }
        String requestProjectName = "SELECT(id) FROM projects WHERE project_name LIKE '" + projectName + "';";

        ResultSet resultSetProjectName = statement.executeQuery(requestProjectName);
        int projectId = 0;
        while (resultSetProjectName.next()) {
            projectId = resultSetProjectName.getInt("id");
        }
        String request = "INSERT INTO employee (first_name,role_id, project_id) VALUES ('" + firstName + "',('" + roleId + "'),('" + projectId + "'));";
        statement.executeUpdate(request);
    }

    /**
     * Methods to obtaining data from tables
     *
     * @throws SQLException
     */
    //Get Role, Direction, Projects and Employee id
    public int getRoleId(String roleName) throws SQLException {
        String requestRoleName = "SELECT(id) FROM roles WHERE role_name LIKE '" + roleName + "';";

        ResultSet resultSetRoleName = statement.executeQuery(requestRoleName);

        int roleId = 0;
        while (resultSetRoleName.next()) {
            roleId = resultSetRoleName.getInt("id");
        }
        return roleId;
    }

    public int getDirectionId(String directionName) throws SQLException {
        String requestDirectionName = "SELECT(id) FROM directions WHERE direction_name LIKE '" + directionName + "';";

        ResultSet resultSetDirectionName = statement.executeQuery(requestDirectionName);

        int directionId = 0;
        while (resultSetDirectionName.next()) {
            directionId = resultSetDirectionName.getInt("id");
        }
        return directionId;
    }

    public int getProjectId(String projectName) throws SQLException {
        String requestProjectName = "SELECT(id) FROM projects WHERE project_name LIKE '" + projectName + "';";

        ResultSet resultSetProjectName = statement.executeQuery(requestProjectName);
        int projectId = 0;
        while (resultSetProjectName.next()) {
            projectId = resultSetProjectName.getInt("id");
        }
        return projectId;
    }

    public int getEmployeeId(String firstName) throws SQLException {
        String requestEmployeeName = "SELECT(id) FROM employee WHERE first_name LIKE '" + firstName + "';";

        ResultSet resultSetEmployeeName = statement.executeQuery(requestEmployeeName);

        int employeeId = 0;
        while (resultSetEmployeeName.next()) {
            employeeId = resultSetEmployeeName.getInt("id");
        }
        return employeeId;
    }

    //Get all Role, Direction, Projects and Employee
    public List getAllRoles() throws SQLException {
        List<String> rolesList = new ArrayList<>();
        String requestRole = "SELECT(role_name) FROM roles;";

        ResultSet resultSetRole = statement.executeQuery(requestRole);

        while (resultSetRole.next()) {
            rolesList.add(resultSetRole.getString("role_name"));
        }
        return rolesList;
    }

    public List getAllDirection() throws SQLException {
        List<String> directionList = new ArrayList<>();
        String requestDirection = "SELECT(direction_name) FROM directions;";

        ResultSet resultSetDirection = statement.executeQuery(requestDirection);

        while (resultSetDirection.next()) {
            directionList.add(resultSetDirection.getString("direction_name"));
        }
        return directionList;
    }

    public List getAllProjects() throws SQLException {
        return null;
    }

    public List getAllEmployee() throws SQLException {
        return null;
    }

    public List getAllDevelopers() throws SQLException {
        return null;
    }

    public List getAllJavaProjects() throws SQLException {
        return null;
    }

    public List getAllJavaDevelopers() throws SQLException {
        return null;
    }
}

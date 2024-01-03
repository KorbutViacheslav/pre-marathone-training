import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        String request = "CREATE SCHEMA " + schemaName + ";";
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
        String request = " CREATE TABLE roles(id SERIAL PRIMARY KEY, role_name VARCHAR NOT NULL); ";
        statement.execute(request);
    }

    public void createTableDirections() throws SQLException {
        String request = "CREATE TABLE directions(id SERIAL PRIMARY KEY, direction_name VARCHAR NOT NULL);";
        statement.execute(request);
    }

    public void createTableProjects() throws SQLException {
        String request = "CREATE TABLE projects(id SERIAL PRIMARY KEY,project_name VARCHAR NOT NULL,direction_id INT REFERENCES directions(id));";
        statement.execute(request);
    }

    public void createTableEmployee() throws SQLException {
        String request = "CREATE TABLE employee(id SERIAL PRIMARY KEY,first_name VARCHAR NOT NULL,role_id INT REFERENCES roles (id),project_id INT REFERENCES projects(id));";
        statement.execute(request);
    }

    public void dropTable(String tableName) throws SQLException {
        String request = "DROP TABLE " + tableName + ";";
        statement.execute(request);
    }
}

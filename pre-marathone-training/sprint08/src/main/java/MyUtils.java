import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyUtils {
    Connection connection;
    Statement statement;

    public Connection createConnection() throws SQLException {
        String name = "postgres";
        String password = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
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

    }

    public void dropSchema() throws SQLException {

    }

    public void useSchema() throws SQLException {

    }

    /**
     * Methods for creating tables
     *
     * @throws SQLException
     */
    public void createTableRoles() throws SQLException {

    }

    public void createTableDirections() throws SQLException {

    }

    public void createTableProjects() throws SQLException {

    }

    public void createTableEmployee() throws SQLException {

    }

    public void dropTable(String tableName) throws SQLException {

    }
}

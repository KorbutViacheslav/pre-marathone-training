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
        String request = "DROP SCHEMA " + schemaName + ";";
        statement.execute(request);
    }

    public void useSchema() throws SQLException {
        String request = "SET SCHEMA " + schemaName + ";";
        statement.execute(request);
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

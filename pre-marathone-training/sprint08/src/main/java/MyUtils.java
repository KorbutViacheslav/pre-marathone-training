import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyUtils {
    public Connection createConnection() throws SQLException {
        String name = "postgres";
        String password = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        return DriverManager.getConnection(url, name, password);
    }

    public void closeConnection() throws SQLException {

    }

    public Statement createStatement() throws SQLException {
        return createConnection().createStatement();
    }

    public void closeStatement() throws SQLException {

    }

    public void createSchema(String schemaName) throws SQLException {

    }

    public void dropSchema() throws SQLException {

    }

    public void useSchema() throws SQLException {

    }
}

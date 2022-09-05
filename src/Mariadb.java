import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements Database {
    public Connection  connectDb() {
        Connection con = null;
        try {
            con = tryconnectDb();
        } catch (SQLException e) {
            System.out.println("Hiba a kapcsolódás sikertelen");
        }
        return con;
    }
    public Connection tryconnectDb() throws SQLException {
        Connection con = null;
        String url = "jdb:mariadb://localhost:3366/adaba";
        String user = "adaba";
        String pass = "almafa12";
        con = DriverManager.getConnection(url, user, pass);

        return con;
    } 
public void closeDb(Connection con) {


}
}

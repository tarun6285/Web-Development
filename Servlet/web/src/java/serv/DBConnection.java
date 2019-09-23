
package serv;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db8", "root", "");

        } catch (Exception e) {
            System.out.println("excption in getConnection:" + e);
        }
        return conn;
    }
}

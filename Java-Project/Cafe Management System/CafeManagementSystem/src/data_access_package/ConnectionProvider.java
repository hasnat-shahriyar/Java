// ConnectionProvider.java
package data_access_package;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false", "root", "x4.NUSRaa32tYGn");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
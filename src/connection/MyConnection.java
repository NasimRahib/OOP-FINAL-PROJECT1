package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_management", "root", "4205");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}

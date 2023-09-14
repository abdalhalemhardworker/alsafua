package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConfig {

    private static Connection conn;

    private static void init_connection() {
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/al_safua", "abdalhalem", "Abdoo123$$");
        } catch (SQLException ex) {
            Logger.getLogger(DBConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection get_connection() {
        if (conn == null) {
            init_connection();
            return conn;
        }
        return conn;
    }

    public void close_connection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

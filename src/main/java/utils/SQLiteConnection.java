package utils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Fakhri MF
 */
public class SQLiteConnection {
    public static Connection connect(String fileDb) {
        Connection con = null;
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\src\\main\\db\\" + fileDb;
            System.out.println(url);
            con = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kesalahan Pada Database\n" + System.getProperty("user.dir") + "\\src\\main\\db\\" + fileDb);
        }
        return con;
    }
    
}

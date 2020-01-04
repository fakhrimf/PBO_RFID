package utils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    public static Connection connect(String fileDB) {
        Connection con = null;
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\src\\main\\db\\" + fileDB;
            System.out.println(url);
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kesalahan pada Database\n" + System.getProperty("user.dir") + "\\src\\main\\db\\" + fileDB);
        }
        return con;
    }
}

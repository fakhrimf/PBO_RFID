package PBO_RFID;

import controllers.LoginController;
import utils.SQLiteConnection;

import java.sql.Connection;

/**
 *
 * @author Fakhri MF
 */
public class Main {
    public static void main(String[] args) {
        new LoginController();
        Connection connection;
        connection = SQLiteConnection.connect("db_rfid.db");
    }

}

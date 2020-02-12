/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_RFID;

import controllers.LoginController;
import utils.SQLiteConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fakhri MF
 */
public class Main {
    public static void main(String[] args) {
        new LoginController();
        new SQLiteConnection();
    }

}

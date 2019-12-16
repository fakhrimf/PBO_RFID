package PBO_RFID;

import controllers.LoginController;

/**
 *
 * @author Fakhri MF
 */
public class Main {
    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        loginController.showLoginForm();
    }

}

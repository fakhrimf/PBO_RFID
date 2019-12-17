package controllers;

import views.LoginForm;

/**
 * @author Fakhri MF
 */
public class LoginController {
    public LoginController() {
        showLoginForm();
    }

    private void showLoginForm() {
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }
}

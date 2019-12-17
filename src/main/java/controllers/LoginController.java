/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.LoginForm;

/**
 *
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

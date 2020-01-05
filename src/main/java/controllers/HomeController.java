package controllers;

import views.HomeForm;

public class HomeController {
    public HomeController() {
        showHomeForm();
    }

    private void showHomeForm() {
        java.awt.EventQueue.invokeLater(() -> new HomeForm().setVisible(true));
    }
}

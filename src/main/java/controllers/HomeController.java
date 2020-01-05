package controllers;

import views.dark.HomeForm;

public class HomeController {
    public HomeController() {
        showHomeForm();
    }

    private void showHomeForm() {
        java.awt.EventQueue.invokeLater(() -> new HomeForm().setVisible(true));
    }
}

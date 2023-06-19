package com.hse.java.payrate.view.navigation;

import com.hse.java.payrate.PayRateApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;

public class NavigationConfig {
    public static final String LOGIN_SCREEN = "Login.fxml";
    public static final String SIGN_UP_SCREEN = "Registration.fxml";
    public static final String MAIN_SCREEN = "Main.fxml";
    public static final String COMPANY_SCREEN = "company_screen.fxml";

    public static final String COMPANY_REQUISITES = "company_requisites.fxml";

    public static final String CALCULATOR = "calc.fxml";
    public static final String PEOPLE_SCREEN = "people_screen.fxml";
    public static final String EDIT_PEOPLE = "edit_people.fxml";

    public static final String SETTINGS = "sett.fxml";
    public static Class<PayRateApplication> applicationClass = PayRateApplication.class;


    public static Scene getScene(String destination) {
        FXMLLoader fxmlLoader = new FXMLLoader(applicationClass.getResource(destination));
        try {
            return new Scene(fxmlLoader.load(), 1280, 720);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

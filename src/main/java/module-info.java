module com.hse.java.payrate {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.hse.java.payrate to javafx.fxml;
    exports com.hse.java.payrate;
    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires com.google.auth;

    exports com.hse.java.payrate.view.login;
    opens com.hse.java.payrate.view.login to javafx.fxml;
    exports com.hse.java.payrate.view.navigation;
    opens com.hse.java.payrate.view.navigation to javafx.fxml;
    exports com.hse.java.payrate.view.sign_up to javafx.fxml;
    opens com.hse.java.payrate.view.sign_up to javafx.fxml;
    opens com.hse.java.payrate.data;
    exports com.hse.java.payrate.data.model to firebase.admin;
    opens com.hse.java.payrate.data.model to firebase.admin;
    exports com.hse.java.payrate.view.main_screen_controllers;
    opens com.hse.java.payrate.view.main_screen_controllers to javafx.fxml;
    exports com.hse.java.payrate.view.calculator;
    opens com.hse.java.payrate.view.calculator to javafx.fxml;
    exports com.hse.java.payrate.view.company_controllers to javafx.fxml;
    opens com.hse.java.payrate.view.company_controllers;
    exports com.hse.java.payrate.view.settings_controller to javafx.fxml;
    opens com.hse.java.payrate.view.settings_controller;
    opens com.hse.java.payrate.view.people_controllers;
    exports com.hse.java.payrate.view.people_controllers to javafx.fxml;
}
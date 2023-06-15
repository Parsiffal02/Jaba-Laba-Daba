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
}
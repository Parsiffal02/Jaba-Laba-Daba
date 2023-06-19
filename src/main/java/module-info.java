module com.hse.java.payrate {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.hse.java.payrate to javafx.fxml;
    exports com.hse.java.payrate;
    exports com.hse.java.payrate.login;
    opens com.hse.java.payrate.login to javafx.fxml;
    exports com.hse.java.payrate.navigation;
    opens com.hse.java.payrate.navigation to javafx.fxml;
    exports com.hse.java.payrate.sign_up to javafx.fxml;
    opens com.hse.java.payrate.sign_up to javafx.fxml;
}
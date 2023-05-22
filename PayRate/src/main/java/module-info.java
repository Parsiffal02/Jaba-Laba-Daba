module com.hse.java.payrate {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.hse.java.payrate to javafx.fxml;
    exports com.hse.java.payrate;
}
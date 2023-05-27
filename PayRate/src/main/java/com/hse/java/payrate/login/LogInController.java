package com.hse.java.payrate.login;

import com.hse.java.payrate.navigation.NavigationConfig;
import com.hse.java.payrate.navigation.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LogInController {
    @FXML
    private TextField loginTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button logInButton;

    @FXML
    Label forgotPasswordLabel;

    @FXML
    Label logInResultLabel;

    @FXML
    Label signUpLabel;

    @FXML
    private void logIn() {
        logInButton.setOnAction(event -> {
            if (loginTextField.getText().isEmpty()) {
                logInResultLabel.setText("Введите логин");
            } else if (passwordTextField.getText().isEmpty()) {
                logInResultLabel.setText("Введите пароль");
            } else {
                logInResultLabel.setText("");
            }
        });
    }

    @FXML
    void signUp() throws IOException {
        SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.SIGN_UP_SCREEN));
    }


}
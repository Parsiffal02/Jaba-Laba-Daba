package com.hse.java.payrate.view.login;

import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInController {
    @FXML
    public Button logInButton;

    @FXML
    public TextField loginTextField;

    @FXML
    public TextField passwordTextField;

    @FXML
    Label forgotPasswordLabel;

    @FXML
    Label logInResultLabel;

    @FXML
    Label signUpLabel;

    @FXML
    public void logIn() throws IOException {
        if (loginTextField.getText().isEmpty()) {
            logInResultLabel.setText("Введите логин");
        } else if (passwordTextField.getText().isEmpty()) {
            logInResultLabel.setText("Введите пароль");
        } else {
            logInResultLabel.setText("");
            SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.MAIN_SCREEN));
        }
    }
    @FXML
    void signUp() throws IOException {
        SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.SIGN_UP_SCREEN));
    }
}
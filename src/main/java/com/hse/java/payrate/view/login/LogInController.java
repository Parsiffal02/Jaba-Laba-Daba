package com.hse.java.payrate.view.login;

import com.hse.java.payrate.data.Database;
import com.hse.java.payrate.data.SignInCallBack;
import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    Label logInResultLabel = new Label();

    @FXML
    Label signUpLabel;

    @FXML
    public void logIn() {
        if (loginTextField.getText().isEmpty()) {
            Platform.runLater(() -> {
                logInResultLabel.setText("Введите логин");
            });
        } else if (passwordTextField.getText().isEmpty()) {
            Platform.runLater(() -> {
                logInResultLabel.setText("Введите пароль");
            });
        } else {
            Database.signIn(loginTextField.getText(), passwordTextField.getText(), message -> {
                Platform.runLater(() -> {
                    logInResultLabel.setText(message);
                    if (message.isEmpty()) {
                        SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.MAIN_SCREEN));
                    }
                });
            });
        }
    }

    @FXML
    void signUp() {
        SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.SIGN_UP_SCREEN));
    }
}
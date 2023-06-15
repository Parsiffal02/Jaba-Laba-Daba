package com.hse.java.payrate.view.sign_up;


import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignUpController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Label signUpResultLabel;

    @FXML
    private void navigationBack() {
        SceneManager.popScene();
    }

    @FXML
    private void signUp() throws IOException {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String password = passwordTextField.getText();
        if (name.isEmpty()) {
            signUpResultLabel.setText("Заполните ФИО");
            return;
        }
        if (email.isEmpty()) {
            signUpResultLabel.setText("Введите почту");
            return;
        }
        if (password.isEmpty()) {
            signUpResultLabel.setText("Введите пароль");
            return;
        }
        if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.MAIN_SCREEN));
        }
    }
}

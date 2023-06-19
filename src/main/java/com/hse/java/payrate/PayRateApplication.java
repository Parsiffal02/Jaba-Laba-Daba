package com.hse.java.payrate;

import com.hse.java.payrate.data.Database;
import com.hse.java.payrate.data.FirebaseConfig;
import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PayRateApplication extends Application {
    @Override
    public void init() {
        FirebaseConfig.initialize();
    }

    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.primaryStage = stage;
        SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.LOGIN_SCREEN));
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.hse.java.payrate;

import com.hse.java.payrate.navigation.NavigationConfig;
import com.hse.java.payrate.navigation.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class PayRateApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.primaryStage = stage;
        SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.LOGIN_SCREEN));
    }

    public static void main(String[] args) {
        launch();
    }
}
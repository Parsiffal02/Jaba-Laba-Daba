package com.hse.java.payrate.view.main_screen_controllers;

import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SidePannelsController {
        @FXML
        private Button Company;
        @FXML
        private Button People;
        @FXML
        private Button Calculator;
        @FXML
        private Button Settings;
        @FXML
        private Button Reports;

        @FXML
        void Select(ActionEvent event) {
        }

        @FXML
        void initialize() {

            Company.setOnAction(Event -> {
                SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.COMPANY_SCREEN));
            });
            People.setOnAction(Event -> {
                SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.PEOPLE_SCREEN));
            });
            Calculator.setOnAction(Event -> {
                SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.CALCULATOR));
            });

        }

        @FXML
        void exit() {
            SceneManager.popScene();
        }
    }
package com.hse.java.payrate.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

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
                Company.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("C:\\Users\\Masha\\IdeaProjects\\09.06\\src\\main\\resources\\com\\hse\\java\\payrate\\company\\company_screen.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });

        }
    }
package com.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;



public class settingsController {

    @FXML
    private Button addOrg;
    @FXML
    private Button exitAcc;

    @FXML
    private Button back;


    @FXML
    void initialize() {

        back.setOnAction(event -> {
            back.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("MainScreen.fxml"));
            try {
                loader.load();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
            });

       addOrg.setOnAction(event -> {});
       exitAcc.setOnAction(event -> {});
           }

    }
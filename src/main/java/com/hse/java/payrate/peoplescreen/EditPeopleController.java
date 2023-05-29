package com.hse.java.payrate.peoplescreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditPeopleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources2;

    @FXML
    private URL location2;

    @FXML
    private ResourceBundle resources3;

    @FXML
    private URL location3;
    @FXML
    private TextField INN;

    @FXML
    private TextField SNILS;

    @FXML
    private TextField Avance;

    @FXML
    private TextField Cash;

    @FXML
    private TextField DateOfBirth;

    @FXML
    private TextField PassportSeriya;

    @FXML
    private TextField PassportNumber;

    @FXML
    private TextField DopInfo;

    @FXML
    private TextField Address;

    @FXML
    private TextField ProfSoyuz;

    @FXML
    private TextField Employed;

    @FXML
    private TextField Fired;

    @FXML
    private TextField WorkerSurname;

    @FXML
    private TextField WorkerName;

    @FXML
    private TextField WorkerFathersName;

    @FXML
    private TextField WorkerSex;

    @FXML
    private TextField Citizenship;

    @FXML
    private TextField Document;

    @FXML
    private CheckBox Moonlighter;

    @FXML
    private Button OK;

    @FXML
    private Button Cancel;

    @FXML
    private Button Exit;

    @FXML
    void Select(ActionEvent event) {

        String inn2 = INN.getText().trim();
        String snils = SNILS.getText().trim();
        String avance = Avance.getText().trim();
        String cash = Cash.getText().trim();
        String date_of_birth = DateOfBirth.getText().trim();
        String passport_seriya = PassportSeriya.getText().trim();
        String passport_number = PassportNumber.getText().trim();
        String dop_info = DopInfo.getText().trim();
        String address = Address.getText().trim();
        String profsouz = ProfSoyuz.getText().trim();
        String employed = Employed.getText().trim();
        String fired = Fired.getText().trim();
        String worker_surname = WorkerSurname.getText().trim();
        String worker_name = WorkerName.getText().trim();
        String worker_sex = WorkerSex.getText().trim();
        String citizenship = Citizenship.getText().trim();
        String document = Document.getText().trim();

        OK.setOnAction(Event -> {
        });
        Cancel.setOnAction(Event -> {
        });
        Exit.setOnAction(Event -> {
        });
    }

    private void moonlighter() {
        int ml;
        if (Moonlighter.isSelected()) {
            ml = 1;
        }
    }

}

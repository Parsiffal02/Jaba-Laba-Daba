package com.hse.java.payrate.calculator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcController implements Initializable {

    @FXML
    private ComboBox<String> premia_choice;
    @FXML
    private ComboBox<String> employee_choice;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TextField hol_hour_field;

    @FXML
    private TextField hour_field;

    @FXML
    private CheckBox nalog_choice1;

    @FXML
    private ComboBox<String> nalog_prof_choice;

    @FXML
    private ComboBox<String> premia;

    @FXML
    private ComboBox<String> emploee_choice;

    @FXML
    private ComboBox<String> company_choice;

    @FXML
    private CheckBox nalog_soc_choice1;

    @FXML
    private Button sum_button;

    @FXML
    private TextField work_hour_field;

    @FXML
    private TextField zp_field;

    @FXML
    private TextField salary_field;

    @FXML
    private Label salary_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void initialize() {
        sum_button.setOnAction(event -> {
            salary_label.setText("Зарплата криво считается");
            double zp = Double.parseDouble(zp_field.getText());
            double hf = Double.parseDouble(hour_field.getText());
            double whf = Double.parseDouble(work_hour_field.getText());
            double hhf = Double.parseDouble(hol_hour_field.getText());
            double premia_choice1 = Double.parseDouble(premia_choice.getValue());
            double nalog_prof_choice1 = Double.parseDouble(nalog_prof_choice.getValue());
            double nalog_choice = 0;
            double salary = 0;

            if (nalog_choice1.isSelected()) {
                nalog_choice = 1.13;
                salary = (((zp / hf * whf - hhf) + ((zp / hf * whf - hhf) * (premia_choice1 / 100))) - ((zp / hf * whf - hhf) + ((zp / hf * whf - hhf) * (premia_choice1 / 100)) * (premia_choice1 / 100)) * (nalog_prof_choice1 + nalog_choice));
            }
            double nalog_soc_choice = 0;
            if (nalog_soc_choice1.isSelected()) {
                nalog_soc_choice = 1.3;
                salary = (((zp / hf * whf - hhf) + ((zp / hf * whf - hhf) * (premia_choice1 / 100))) - ((zp / hf * whf - hhf) + ((zp / hf * whf - hhf) * (premia_choice1 / 100)) * (premia_choice1 / 100)) * (nalog_prof_choice1 + nalog_soc_choice));
            }
            if (nalog_choice1.isSelected() && nalog_soc_choice1.isSelected()) {
                nalog_choice = 1.13;
                nalog_soc_choice = 1.3;
                salary = (((zp / hf * whf - hhf) + ((zp / hf * whf - hhf) * (premia_choice1 / 100))) - ((zp / hf * whf - hhf) + ((zp / hf * whf - hhf) * (premia_choice1 / 100)) * (premia_choice1 / 100)) * (nalog_prof_choice1 + nalog_soc_choice + nalog_choice));
            }
            if (salary == 0) {
                salary_label.setText("Зарплата криво считается ");
            } else {
                salary_label.setText("Зарплата: " + salary);
            }

        });

    }
    public void Select(ActionEvent actionEvent) {
    }
}



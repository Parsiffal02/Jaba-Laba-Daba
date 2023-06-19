package com.hse.java.payrate.view.calculator;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcController {

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
    private Label salary_lable;

    @FXML
    void initialize() {

        ObservableList<String> premiaChoiceList = FXCollections.observableArrayList("0", "5", "10", "15", "20", "25", "30");
        premia_choice.setItems(premiaChoiceList);

        ObservableList<String> nalogProfChoiceList = FXCollections.observableArrayList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40");
        nalog_prof_choice.setItems(nalogProfChoiceList);

        ObservableList<String> employeeChoiceList = FXCollections.observableArrayList("Штатный", "Внештатный");
        employee_choice.setItems(employeeChoiceList);

        ObservableList<String> companyChoiceList = FXCollections.observableArrayList("ООО «Ромашка»", "ИП Иванов И.И.", "ООО «Рога и копыта»", "ИП Петров П.П.", "ООО «Альфа»", "ИП Сидоров С.С.");
        company_choice.setItems(companyChoiceList);

        Platform.runLater(() -> {
            sum_button.setOnAction(event -> {
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
                salary_lable.setText("Зарплата: " + salary);
            });
        });
    }
    public void Select(ActionEvent actionEvent) {
    }

    public void exit() {
        SceneManager.popScene();
    }
}



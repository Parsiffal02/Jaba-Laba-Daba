package com.hse.java.payrate.calculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcController implements Initializable {

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
    private CheckBox nalog_choice;

    @FXML
    private ComboBox<?> nalog_prof_choice;

    @FXML
    private ComboBox<String> premia;

    @FXML
    private ComboBox<?> emploee_choice;

    @FXML
    private ComboBox<?> company_choice;

    @FXML
    private CheckBox nalog_soc_choice;

    @FXML
    private Button sum_button;

    @FXML
    private TextField work_hour_field;

    @FXML
    private TextField zp_field;

    @FXML
    void Select(ActionEvent event) {

        String  zp = zp_field.getText().trim();
        String  hf = hour_field.getText().trim();
        String  whf = work_hour_field.getText().trim();
        String  hhf = hol_hour_field.getText().trim();
        double nalog_choice  ;
        int zp1 = Integer.parseInt(zp.trim());
        int hf1 = Integer.parseInt(hf.trim());
        int whf1 = Integer.parseInt(whf.trim());
        int hhf1 = Integer.parseInt(hhf.trim());

        nalog_choice = 1.13;
        sum_button.setOnAction(Event -> {



        });


    }
    @FXML
    private void nalog() {
        double nc;
        if (nalog_choice.isSelected()) {
            nc = 1.13;
        }
    }
    @FXML
    private void nalog_soc_choice() {
        double nsc;
        if (nalog_choice.isSelected()) {
            nsc = 1.3;
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ObservableList<String> list = FXCollections.observableArrayList("5%" ,"10%", "15%","20%","25%","30%","35%", "40%","45%","50%","55%","60%","65%","70%","75%","80%","85%","90%","95%","100%");
        premia.setItems(list);
    }/*String p = premia.getSelectionModel().getSelectedItem().toString();*/
}
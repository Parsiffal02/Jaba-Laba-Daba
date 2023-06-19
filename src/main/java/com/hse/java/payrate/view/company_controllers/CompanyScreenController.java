package com.hse.java.payrate.view.company_controllers;


import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
public class CompanyScreenController {
    @FXML
    private TextField CompanyName;

    @FXML
    private TextField OGRN;

    @FXML
    private TextField KPP;

    @FXML
    private TextField INN;

    @FXML
    private TextField OKPO;

    @FXML
    private TextField IFNS;

    @FXML
    private TextField PFR;

    @FXML
    private TextField FSS;

    @FXML
    private TextField CodP;

    @FXML
    private TextField AvanceDay;

    @FXML
    private TextField CashDay;

    @FXML
    private TextField BossSurname;

    @FXML
    private TextField BossName;

    @FXML
    private TextField BossPosition;

    @FXML
    private TextField BossFathersName;

    @FXML
    private Button Requisites;

    @FXML
    private Button OK;

    @FXML
    private Button Cancel;
    @FXML
    private Button Exit;
    @FXML
    private TextField dataWrite;

    private ObservableList<String> company_data;
    @FXML
    private ListView<String> dataList;

    @FXML
    void Select(ActionEvent event) {

        String company_name = CompanyName.getText().trim();
        String ogrn = OGRN.getText().trim();
        String kpp = KPP.getText().trim();
        String inn = INN.getText().trim();
        String okpo = OKPO.getText().trim();
        String ifns = IFNS.getText().trim();
        String pfr = PFR.getText().trim();
        String cod_P = CodP.getText().trim();
        String fss = FSS.getText().trim();
        String avance_day = AvanceDay.getText().trim();
        String cash_day = CashDay.getText().trim();
        String boss_position = BossPosition.getText().trim();
        String boss_surname = BossSurname.getText().trim();
        String boss_name = BossName.getText().trim();
        String boss_fathersname = BossFathersName.getText().trim();
    }

    @FXML
    void initialize() {

        Requisites.setOnAction(Event -> {
            SceneManager.pushScene(NavigationConfig.getScene(NavigationConfig.COMPANY_REQUISITES));
        });
        Exit.setOnAction(Event -> {
            SceneManager.popScene();
        });

    }
    }
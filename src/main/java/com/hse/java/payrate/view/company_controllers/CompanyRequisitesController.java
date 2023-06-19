package com.hse.java.payrate.view.company_controllers;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class CompanyRequisitesController {
    @FXML
    private TextField CompanyFullName;

    @FXML
    private TextField RegisteredAddress;

    @FXML
    private TextField Bank;

    @FXML
    private TextField BIK;

    @FXML
    private TextField PaymentAccount;

    @FXML
    private TextField CorrespondentAccount;

    @FXML
    private TextField MailAddress;

    @FXML
    private TextField PhoneNumber;

    @FXML
    private TextField Email;

    @FXML
    private TextField BossSurname;

    @FXML
    private TextField BossName;

    @FXML
    private TextField BossFathersName;

    @FXML
    private Button OK;

    @FXML
    private Button Cancel;

    @FXML
    private Button Exit;

    @FXML
    void initialize() {
      /*  String company_full_name = CompanyFullName.getText().trim();
        String registered_address = RegisteredAddress.getText().trim();
        String bank = Bank.getText().trim();
        String bik = BIK.getText().trim();
        String payment_account = PaymentAccount.getText().trim();
        String correspondent_account = CorrespondentAccount.getText().trim();
        String mail_adress = MailAddress.getText().trim();
        String phone_number = PhoneNumber.getText().trim();
        String email = Email.getText().trim();
        String boss_surname = BossSurname.getText().trim();
        String boss_name = BossName.getText().trim();
        String boss_fathersname = BossFathersName.getText().trim();*/

        OK.setOnAction(Event -> {
            SceneManager.popScene();
        });
        Cancel.setOnAction(Event -> {
            SceneManager.popScene();
        });
    }
}

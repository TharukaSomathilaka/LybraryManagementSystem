
package controllers.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {
   LoginController loginController = new LoginController();

    @FXML
    private Label Lable_1;

    @FXML
    private Label Lable_2;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private Label lblIncorrect;

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtUserName.clear();
        txtPassword.clear();

    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {
          boolean b = loginController.checkUserNameandPassword(txtUserName.getText(), txtPassword.getText());


    }

@FXML
void lblIncorrectOnAction() {
    lblIncorrect.setText("Username or Password is incorrect.!!!");

}




}

//
//if (loginController.checkUserNameandPassword(txtUserName.getText(), txtPassword.getText())){
//Stage stage = new Stage();
//            try {
//                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/main_dashboard_page.fxml"))));
//        stage.show();
//                ((Stage) btnLogin.getScene().getWindow()).close();
//            } catch (IOException e) {
//        throw new RuntimeException(e);
//            }
//                    }
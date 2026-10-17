package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class IssueBookPageController {

    @FXML
    private Button btnAddBook;

    @FXML
    private Button btnAddMember;

    @FXML
    private Button btnBorrowingHistory;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnIssueBook;

    @FXML
    private Button btnIssueBooks;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnManageMembers;

    @FXML
    private Button btnReturnBooks;

    @FXML
    private TextField txtDueDate;

    @FXML
    private TextField txtIssueDate;

    @FXML
    private TextField txtSelectBook;

    @FXML
    private TextField txtSelectMember;

    @FXML
    void btnAddBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnAddMemberOnAction(ActionEvent event) {

    }

    @FXML
    void btnBorrowingHistoryOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/View/main_dashboard_page.fxml")
            );

            Stage stage = (Stage) btnDashboard.getScene().getWindow();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void btnIssueBookOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/View/main_dashboard_page.fxml")
            );

            Stage stage = (Stage) btnDashboard.getScene().getWindow();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void btnIssueBooksOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnManageMembersOnAction(ActionEvent event) {

    }

    @FXML
    void txtDueDateOnAction(ActionEvent event) {

    }

    @FXML
    void txtIssueDateOnAction(ActionEvent event) {

    }

    @FXML
    void txtSelectBookOnAction(ActionEvent event) {

    }

    @FXML
    void txtSelectMemberOnAction(ActionEvent event) {

    }

}

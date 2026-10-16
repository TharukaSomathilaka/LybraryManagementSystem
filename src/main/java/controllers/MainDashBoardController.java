package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainDashBoardController {

    @FXML
    private Button btnAddBook;

    @FXML
    private Button btnAddMember;

    @FXML
    private Button btnBorrowingHistory;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnIssueBooks;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnManageMembers;

    @FXML
    private Button btnReturnBooks;

    @FXML
    private Label lblCurrentlyBorrowedBooks;

    @FXML
    private Label lblOverDueBooks;

    @FXML
    private Label lblTotalBooks;

    @FXML
    private Label lblTotalMembers;

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
    void btnDashboardOnAction(ActionEvent event) {

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
    void lblCurrentlyBorrowedBooksOnAction(MouseEvent event) {

    }

    @FXML
    void lblOverDueBooksOnAction(MouseEvent event) {

    }

    @FXML
    void lblTotalBooksOnAction(MouseEvent event) {

    }

    @FXML
    void lblTotalMembersOnAction(MouseEvent event) {

    }

    @FXML
    public void initialize() {

        // Sample values
        lblTotalBooks.setText("1250");
        lblTotalMembers.setText("320");
        lblCurrentlyBorrowedBooks.setText("86");
        lblOverDueBooks.setText("12");
    }

}

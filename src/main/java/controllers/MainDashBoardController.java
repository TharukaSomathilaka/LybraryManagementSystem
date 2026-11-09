package controllers;

import com.sun.javafx.stage.EmbeddedWindow;
import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainDashBoardController {
    Connection connection = DBConnection.getConnection();

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
            try {
                Parent root = FXMLLoader.load(
                        getClass().getResource("/View/add_book_page.fxml")
                );

                Stage stage = (Stage) btnAddBook.getScene().getWindow();

                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }



    }

    @FXML
    void btnAddMemberOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/add_member_page.fxml"));
            Stage stage = (Stage) btnAddBook.getScene().getWindow();


            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnBorrowingHistoryOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/View/borrowing_history_page.fxml")
            );
            Stage stage = (Stage) btnAddBook.getScene().getWindow();


            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void btnIssueBooksOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/issue_book_page.fxml"));
            Stage stage = (Stage) btnIssueBooks.getScene().getWindow();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnManageMembersOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/manage_members_page.fxml"));
            Stage stage = (Stage) btnDashboard.getScene().getWindow();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void lblCurrentlyBorrowedBooksOnAction(MouseEvent event) {

    }

    @FXML
    void lblOverDueBooksOnAction(MouseEvent event) {

    }

    @FXML
    void lblTotalBooksOnAction() {
//


    }

    @FXML
    void lblTotalMembersOnAction(MouseEvent event) {

    }
    private void loadTotalBooks() {

        try {
            String sql = "SELECT SUM(quantity) AS total FROM book";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int totalBooks = resultSet.getInt("total");

                lblTotalBooks.setText(String.valueOf(totalBooks));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void loadTotalMembers() {

        try {
            String sql = "SELECT SUM(member_id) AS total FROM member";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int totalMembers = resultSet.getInt("total");

                lblTotalMembers.setText(String.valueOf(totalMembers));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        refreshDashboard();
        loadTotalBooks();
        loadTotalMembers();

    }
    public void refreshDashboard() {

        // Get the total number of book copies from LibraryData
        //lblTotalBooks.setText(String.valueOf(LibraryData.getTotalBooks()));

        // Temporary sample values
        //lblTotalMembers.setText("0");
        //lblCurrentlyBorrowedBooks.setText("0");
        //lblOverDueBooks.setText("0");
    }

}

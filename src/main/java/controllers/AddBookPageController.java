
package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddBookPageController {

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
    private Button btnIssueBooks;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnManageMembers;

    @FXML
    private Button btnReturnBooks;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtBookIdIsbn;

    @FXML
    private TextField txtBookTitle;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtPublishedYear;

    @FXML
    private TextField txtQuantity;


    @FXML
    void btnAddBookOnAction(ActionEvent event) {

        String isbn = txtBookIdIsbn.getText();
        String title = txtBookTitle.getText();
        String author = txtAuthor.getText();
        String category = txtCategory.getText();

        if (isbn.isEmpty() || title.isEmpty() ||
                author.isEmpty() || category.isEmpty() ||
                txtPublishedYear.getText().isEmpty() ||
                txtQuantity.getText().isEmpty()) {

            showMessage("Please fill in all fields.");
            return;
        }

        try {
            int year = Integer.parseInt(txtPublishedYear.getText());
            int quantity = Integer.parseInt(txtQuantity.getText());

            if (quantity <= 0) {
                showMessage("Quantity must be greater than zero.");
                return;
            }

            Book book = new Book(
                    isbn, title, author, category, year, quantity
            );

            LibraryData.books.add(book);

            showMessage("Book added successfully!");

            btnClearOnAction(event);

        } catch (NumberFormatException e) {
            showMessage("Please enter a valid year and quantity.");
        }
    }


    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtBookIdIsbn.clear();
        txtBookTitle.clear();
        txtAuthor.clear();
        txtCategory.clear();
        txtPublishedYear.clear();
        txtQuantity.clear();
    }


    @FXML
    void btnAddMemberOnAction(ActionEvent event) {
    }

    @FXML
    void btnBorrowingHistoryOnAction(ActionEvent event) {
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/View/main_dashboard_page.fxml")
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
    void btnIssueBooksOnAction(ActionEvent event) {
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {
    }

    @FXML
    void btnManageMembersOnAction(ActionEvent event) {
    }

    @FXML
    void btnReturnBooksOnAction(ActionEvent event) {
    }

    @FXML
    void txtAuthorOnAction(ActionEvent event) {
    }

    @FXML
    void txtBookIdIsbnOnAction(ActionEvent event) {
    }

    @FXML
    void txtBookTitleOnAction(ActionEvent event) {
    }

    @FXML
    void txtCategoryOnAction(ActionEvent event) {
    }

    @FXML
    void txtPublishedYearOnAction(ActionEvent event) {
    }

    @FXML
    void txtQuantityOnAction(ActionEvent event) {
    }


    private void showMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

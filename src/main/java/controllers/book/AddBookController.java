
package controllers.book;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBookController {

    public void addBook(String bookId,
                        String title,
                        String author,
                        String category,
                        int year,
                        int quantity) {

        String SQL = "INSERT INTO book(book_id, book_title, author, category, published_year, quantity) VALUES (?,?,?,?,?,?)";

        try {
            Connection connection = DBConnection.getConnection();

            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL);

            preparedStatement.setString(1, bookId);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setString(4, category);
            preparedStatement.setInt(5, year);
            preparedStatement.setInt(6, quantity);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

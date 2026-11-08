package controllers.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBookController {
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library_management_system",
                    "root",
                    "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void addBook(){
        String SQL = "INSERT INTO book(book_id, book_title, author, category, published_year, quantity) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Love");
            preparedStatement.setString(3,"Manoj");
            preparedStatement.setString(4,"fiction");
            preparedStatement.setInt(5,2026);
            preparedStatement.setInt(6,100);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

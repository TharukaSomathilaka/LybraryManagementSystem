package controllers.login;

import db.DBConnection;

import java.sql.*;

public class LoginController {

    Connection connection = DBConnection.getConnection();
    public boolean checkUserNameandPassword(String userName, String password){
        String SQL = "SELECT * FROM user";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String dbUserName = resultSet.getString("username");
                String dbPassword = resultSet.getString("password");
                if (userName.equals(dbUserName) && password.equals(dbPassword)){
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       return false;
    }


    public void testConnection(){

        System.out.println(connection);
    }
}

package controllers.login;

import java.sql.*;

public class LoginController {
    //LoginPageController loginPageController = new LoginPageController();
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_management_system_v1",
                    "root",
                    "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean checkUserNameandPassword(String userName, String password){
        String SQL = "SELECT * FROM users";
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


//    public boolean checkUserNameandPassword(String name, String password) {
//        if(name.equals("tharuka") && password.equals("1234")){
//        return true;
//    }
//        //loginPageController.lblIncorrectOnAction();
//    return false;
//
//    }
    public void testConnection(){
        System.out.println(connection);
    }
}

//private boolean checkUserNameandPassword(String name, String password) {
//    if(name.equals("tharuka") && password.equals("1234")){
//        return true;
//    }
//    lblIncorrectOnAction();
//    return false;
//}
package controllers.login;

public class LoginController {
    //LoginPageController loginPageController = new LoginPageController();


    public boolean checkUserNameandPassword(String name, String password) {
        if(name.equals("tharuka") && password.equals("1234")){
        return true;
    }
        //loginPageController.lblIncorrectOnAction();
    return false;

    }
}

//private boolean checkUserNameandPassword(String name, String password) {
//    if(name.equals("tharuka") && password.equals("1234")){
//        return true;
//    }
//    lblIncorrectOnAction();
//    return false;
//}
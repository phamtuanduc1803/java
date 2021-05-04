package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import login.loginModel;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        loginModel lg=new loginModel(primaryStage);
        lg.start(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

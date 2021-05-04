package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class loginModel extends Application {
    private static Stage primaryStage;


        public loginModel(Stage primaryStage){
            this.primaryStage=primaryStage;
        }

        public void setPrimaryStage(Stage primaryStage){

            this.primaryStage=primaryStage;
        }

        public static Stage getPrimaryStage(){

            return primaryStage;
        }

    @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            primaryStage.setTitle("Đăng nhập");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
}



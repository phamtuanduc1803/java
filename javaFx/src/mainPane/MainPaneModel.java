package mainPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class MainPaneModel extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainpane.fxml"));
        primaryStage.setTitle("Phan mem quan cua hang");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}

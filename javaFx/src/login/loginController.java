package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import mainPane.MainPaneModel;

public class loginController{
    @FXML
    private Button btDangnhap;
    @FXML
    private Button btDangki;
    @FXML
    private TextField tenDangnhap;
    @FXML
    private PasswordField matKhau;

    public String getTendangnhap(){

        return tenDangnhap.getText();
    }

    public String getMatkhau(){

        return matKhau.getText();
    }

    public Button getBtDangnhap(){
        return this.btDangnhap;
    }

    public Button getBtDangki(){
        return this.btDangki;
    }
    public void dangnhap(ActionEvent event) throws Exception {
        System.out.println(getTendangnhap());
        loginModel.getPrimaryStage().close();
        MainPaneModel mainPaneModel=new MainPaneModel();
        mainPaneModel.start(loginModel.getPrimaryStage());
    }
}

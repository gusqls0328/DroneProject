package exam03;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button btnOK;
    @FXML
    private Button btnCancel; // 자동적으로 객체가 주입이 됨

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 이벤트 처리를 할거임
        btnOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("btnOK를 처리합니다");
            }
        });

        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("btnCancel을 처리합니다");
            }
        });
    }



}

package exam02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start()");
        primaryStage.setTitle("나의 JavaFX Window");


        //AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("Main.fxml")); // 현재클래스를 기준으로 상대경로를 찾는 방법

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        AnchorPane anchorPane = (AnchorPane) fxmlLoader.load(); // 이것을 쓰면 Controller 객체를 얻을 수 있음
        //fxmlLoader.getController();

        Scene scene = new Scene(anchorPane);
        //Scene scene = new Scene(new AnchorPane());
        primaryStage.setScene(scene);

        primaryStage.setMaximized(true); //꽉찬화면, 사이즈는 가장 마지막에 주라 안그러면 잘안나타날수도 있음

        //primaryStage.setWidth(1000);
        //primaryStage.setHeight(700);
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop()");
    }

    public static void main(String[] args) {
        launch(args);
        // 이게 실행되면 바로 start가 실행이 됨

    }


}

package exam03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
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


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        BorderPane pane = (BorderPane) fxmlLoader.load(); // 이것을 쓰면 Controller 객체를 얻을 수 있음


        Scene scene = new Scene(pane);
        //Scene scene = new Scene(new AnchorPane());
        primaryStage.setScene(scene);

        //primaryStage.setMaximized(true); //꽉찬화면, 사이즈는 가장 마지막에 주라 안그러면 잘안나타날수도 있음

        primaryStage.setWidth(1000);
        primaryStage.setHeight(700);
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

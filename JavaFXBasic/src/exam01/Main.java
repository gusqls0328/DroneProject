package exam01;

import javafx.application.Application;
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

        Scene scene = new Scene(new AnchorPane());
        primaryStage.setScene(scene);

        //primaryStage.setMaximized(true); 꽉찬화면

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

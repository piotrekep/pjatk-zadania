import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root = new StackPane();
        Label label = new Label("Hello World!");

        root.getChildren().add(label);

        Scene scene = new Scene(root, 250, 50);

        primaryStage.setTitle("GUI Wykład 11");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

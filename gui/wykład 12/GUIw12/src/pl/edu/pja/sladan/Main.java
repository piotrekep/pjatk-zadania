package pl.edu.pja.sladan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();

        Label label = new Label("JavaFX");
        Button button = new Button("Przycisk");
        TextArea textArea = new TextArea("TextArea");

//        textArea.setStyle("-fx-background-color: yellow");

        gridPane.add(label, 0, 0);
        gridPane.add(button, 0, 1);
        gridPane.add(textArea, 0, 2);

        primaryStage.setTitle("GUI wykład 12");
        Scene scene = new Scene(gridPane, 300, 300);

        scene.getStylesheets().add("style.css");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

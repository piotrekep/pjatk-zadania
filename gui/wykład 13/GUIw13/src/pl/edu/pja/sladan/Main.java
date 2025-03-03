package pl.edu.pja.sladan;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();

//        Rectangle rect = new Rectangle(50, 100, 200, 100);
//
//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), rect);
//        fadeTransition.setFromValue(1.0);
//        fadeTransition.setToValue(0.2);
////        fadeTransition.setCycleCount(Animation.INDEFINITE);
//        fadeTransition.setAutoReverse(true);
//
////        fadeTransition.play();
//
//        FillTransition fillTransition = new FillTransition(Duration.seconds(1), rect, Color.YELLOW, Color.RED);
////        fillTransition.setCycleCount(Animation.INDEFINITE);
//        fillTransition.setAutoReverse(true);
////        fillTransition.play();
//
//        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(1), rect);
//        scaleTransition.setToX(0.1);
//        scaleTransition.setToY(0.2);
////        scaleTransition.setCycleCount(Animation.INDEFINITE);
//        scaleTransition.setAutoReverse(true);
////        scaleTransition.play();
//
//        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(1), rect);
//        rotateTransition.setFromAngle(0);
//        rotateTransition.setToAngle(170);
////        rotateTransition.setCycleCount(Animation.INDEFINITE);
//        rotateTransition.setAutoReverse(true);
////        rotateTransition.play();
//
//        PathTransition pathTransition = new PathTransition(Duration.seconds(2), rect);
//
//        Path path = new Path();
//        path.getElements().add(new MoveTo(0, 0));
//        path.getElements().add(new LineTo(300, 300));
//
//        pathTransition.setNode(rect);
//        pathTransition.setPath(path);

//        pathTransition.setCycleCount(Animation.INDEFINITE);
//        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//        pathTransition.setAutoReverse(true);
//        pathTransition.play();

//        SequentialTransition sequentialTransition = new SequentialTransition();
//        sequentialTransition.getChildren().addAll(fadeTransition, fillTransition, scaleTransition, rotateTransition, pathTransition);
//        sequentialTransition.setCycleCount(Animation.INDEFINITE);
//        sequentialTransition.setAutoReverse(true);
//        sequentialTransition.play();

//        ParallelTransition parallelTransition = new ParallelTransition();
//        parallelTransition.getChildren().addAll(fadeTransition, fillTransition, scaleTransition, rotateTransition, pathTransition);
//        parallelTransition.setCycleCount(Animation.INDEFINITE);
//        parallelTransition.setAutoReverse(true);
//        parallelTransition.play();


//        group.getChildren().add(rect);

        String content = "GUI wykład 13";
        Text text = new Text(100, 100, "");

        Animation animation = new Transition() {
            {
                setCycleDuration(Duration.seconds(3));
            }

            @Override
            protected void interpolate(double v) {
                text.setText(content.substring(0, Math.round(content.length() * (float)v)));
            }
        };

        animation.play();

        group.getChildren().add(text);

        Scene scene = new Scene(group, 300, 300);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

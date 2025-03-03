package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    Label tekst;

    public void sayHello(MouseEvent mouseEvent) {
        tekst.setText("Hello!");
    }

}

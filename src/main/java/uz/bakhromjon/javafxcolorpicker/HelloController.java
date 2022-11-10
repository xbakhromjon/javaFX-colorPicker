package uz.bakhromjon.javafxcolorpicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class HelloController {
    @FXML
    private AnchorPane pane;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    protected void changeColor(ActionEvent event) {
        Color color = colorPicker.getValue();
        pane.setBackground(new Background(new BackgroundFill(color, null, null)));
    }
}
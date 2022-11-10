module uz.bakhromjon.javafxcolorpicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxcolorpicker to javafx.fxml;
    exports uz.bakhromjon.javafxcolorpicker;
}
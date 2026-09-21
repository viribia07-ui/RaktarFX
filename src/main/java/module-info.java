module com.example.raktarfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.raktarfx to javafx.fxml;
    exports com.example.raktarfx;
}
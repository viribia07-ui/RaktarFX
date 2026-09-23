module com.example.raktarjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.raktarjavafx to javafx.fxml;
    exports com.example.raktarjavafx;
}
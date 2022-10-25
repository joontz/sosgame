module com.example.sosgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.sosgame to javafx.fxml;
    exports com.example.sosgame;
}
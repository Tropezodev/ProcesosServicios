module com.example.a2_procesoenjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;

    opens com.example.a2_procesosenjava to javafx.fxml;
    exports com.example.a2_procesosenjava;
}
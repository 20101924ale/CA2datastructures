module com.example.parisroutefinder {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires java.desktop;

    opens com.example.parisroutefinder to javafx.fxml;
    exports com.example.parisroutefinder;
}
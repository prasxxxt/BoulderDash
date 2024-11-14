module org.example.boulderdash {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.boulderdash to javafx.fxml;
    exports org.example.boulderdash;
}
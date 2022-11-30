module com.example.fxapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fxapp to javafx.fxml;
    exports com.example.fxapp;
}
module com.example.chatserver {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.example.chatcommon;


    opens com.example.chatclient.chatserver to javafx.fxml;
    exports com.example.chatclient.chatserver;
}
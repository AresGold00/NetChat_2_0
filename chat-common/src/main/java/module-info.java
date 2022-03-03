module com.example.chatcommon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatclient.chatcommon to javafx.fxml;
    exports com.example.chatclient.chatcommon;
    exports ru.geekbrains.january_chat.props;
}
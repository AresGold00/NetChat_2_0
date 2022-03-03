module com.example.chatclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.example.chatcommon;


    opens ru.geekbrains.january_chat.chat_client to javafx.fxml;
    exports ru.geekbrains.january_chat.chat_client;
}
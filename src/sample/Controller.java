package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea MyTextArea;
    @FXML
    TextField MyTextField;


    public void Send(ActionEvent actionEvent) {
        MyTextArea.appendText(MyTextField.getText()+"\n");
        //подскажите как прописать, чтобы текст был ограничен по длине строки
        // и переносился на следующую строчку
        MyTextField.clear();


    }
}

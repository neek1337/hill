package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.FileNotFoundException;

public class Controller {
    public Button btn;
    public TextArea textField;

    public void click(ActionEvent actionEvent) throws FileNotFoundException {
        String[] local = textField.getText().split("\n");
        textField.setText(Logic.main(local[0], local[1]));
    }
}

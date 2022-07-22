package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btTest;

    public void onBtTestAction() {
        System.out.println("Click");
        //Alerts.showAlert("Alert Title", "Alert Header", "Hello", Alert.AlertType.INFORMATION);
        //Alerts.showAlert("Alert Title", "Alert Header", "Hello", Alert.AlertType.ERROR);
        Alerts.showAlert("Alert Title", null, "Hello Alert", Alert.AlertType.ERROR);
    }

}

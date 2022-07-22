package gui;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> personComboBox;

    private ObservableList<Person> observableList;

    @FXML
    private Button btAll;

    @FXML
    public void onComboBoxPersonAction() {
        Person person = personComboBox.getSelectionModel().getSelectedItem();
        System.out.println(person);

    }

    @FXML
    public void onBtAllAction() {
        for (Person person : personComboBox.getItems()) {
            System.out.println(person);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Henrique",1,  "henrique@gmail.com"));
        personList.add(new Person("Rhuan",2,  "rhuan@gmail.com"));
        personList.add(new Person("Fernanda",3,  "fernanda@gmail.com"));
        personList.add(new Person("Glaucia",4,  "glaucia@gmail.com"));

        observableList = FXCollections.observableArrayList(personList);
        personComboBox.setItems(observableList);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        personComboBox.setCellFactory(factory);
        personComboBox.setButtonCell(factory.call(null));

    }
}

package TabbedApp.controllers;

import TabbedApp.entity.User;
import TabbedApp.unirestapi.UnirestLoad;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class UsersTabController implements Initializable {

    @FXML private TableView tableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        new Thread(){
            @Override
            public void run() {
                List<User> users = UnirestLoad.getUsers();
                ObservableList<User> obsUsers = FXCollections.observableArrayList(users);
                tableView.setItems(obsUsers);

            }
        }.start();

    }
}

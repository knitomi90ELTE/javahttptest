package TabbedApp.controllers;

import TabbedApp.api.LoadData;
import TabbedApp.api.LoadDataCallback;
import TabbedApp.entity.User;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class UsersTabController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        new Thread(){
            @Override
            public void run() {

                LoadData<User> loadUserData = new LoadData<>();
                loadUserData.loadAllData(new LoadDataCallback<User>() {
                    @Override
                    public void onSuccess(ArrayList<User> data) {

                        System.out.println(data.getClass());
                        Thread.currentThread().interrupt();

                    }

                    @Override
                    public void onError(String message) {
                        Thread.currentThread().interrupt();
                    }
                }, User.class);


            }
        }.start();

    }
}

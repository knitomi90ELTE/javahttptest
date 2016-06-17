package TabbedApp;

import TabbedApp.api.ApiClient;
import TabbedApp.api.LoadData;
import TabbedApp.api.LoadDataCallback;
import TabbedApp.api.ResponseObject;
import TabbedApp.entity.User;
import TabbedApp.helper.ChangeContent;
import javafx.application.Application;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

public class TabbedApp extends Application{

    private static TabbedApp instance;
    private ChangeContent changeContent;

    public TabbedApp() {
        instance = this;
    }

    public static TabbedApp getInstance() {
        return instance;
    }

    public ChangeContent getChangeContent() {
        return changeContent;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        changeContent = new ChangeContent(instance, primaryStage);
        changeContent.replaceSceneContent("/view/Main.fxml");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        /*LoadData ld = new LoadData<User>();
        ld.loadAllData(new LoadDataCallback<User>() {
            @Override
            public void onSuccess(ArrayList data) {
                for(Object u : data){
                    System.out.println(u.toString());
                }
            }

            @Override
            public void onError(String message) {

            }
        }, User.class);*/
    }

}

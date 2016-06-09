package TabbedApp;

import TabbedApp.api.ApiClient;
import TabbedApp.api.ResponseObject;
import TabbedApp.helper.ChangeContent;
import javafx.application.Application;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TabbedApp /*extends Application*/{

    /*private static TabbedApp instance;
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
    }*/

    public static void main(String[] args) {
        //launch(args);
        ApiClient.instance("http://84.236.114.224/").getUsers().enqueue(new Callback<ResponseObject>() {
            @Override
            public void onResponse(Call<ResponseObject> call, Response<ResponseObject> response) {
                System.out.println(response.body().toString());
            }

            @Override
            public void onFailure(Call<ResponseObject> call, Throwable throwable) {
                System.out.println("error");
            }
        });
    }

}

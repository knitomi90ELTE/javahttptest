package TabbedApp.api;

import TabbedApp.entity.Guitar;
import TabbedApp.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class LoadData<T> {

    private final String API_URL = "http://192.168.0.254/";
    private final Gson GSON = new Gson();

    public void loadAllData(final LoadDataCallback<T> callback, Class<T> c) {

        Callback<ResponseObject> responseCallback = new Callback<ResponseObject>() {
            @Override
            public void onResponse(Call<ResponseObject> call, Response<ResponseObject> response) {
                System.out.println(response.body().getData().isJsonArray());
                Type t = new TypeToken<ArrayList<T>>(){}.getType();
                ArrayList<T> data = GSON.fromJson(response.body().getData().toString(), t);
                callback.onSuccess(data);
            }

            @Override
            public void onFailure(Call<ResponseObject> call, Throwable throwable) {
                callback.onError(throwable.getMessage());
            }
        };

        if(c == User.class){
            ApiClient.instance(API_URL).getUsers().enqueue(responseCallback);
        } else if (c == Guitar.class){
            ApiClient.instance(API_URL).getGuitars().enqueue(responseCallback);
        } else {

        }
    }



}

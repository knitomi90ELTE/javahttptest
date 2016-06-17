package TabbedApp.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Api api;

    public static Api instance(String apiUrl) {

        if (api == null) {
            final GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            OkHttpClient client = new OkHttpClient();
            Retrofit restAdapter = new Retrofit.Builder()
                    .baseUrl(apiUrl)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            api = restAdapter.create(Api.class);
        }
        return api;
    }

    public static void reset() {
        api = null;
    }

}

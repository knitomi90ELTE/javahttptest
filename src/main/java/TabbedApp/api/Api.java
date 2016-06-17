package TabbedApp.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String AUTH = "api.php?authkey=QWERASDFYXCV&";

    @GET(AUTH + "action=getUsers")
    Call<ResponseObject> getUsers();

    @GET(AUTH + "action=getGuitars")
    Call<ResponseObject> getGuitars();



}

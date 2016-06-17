package TabbedApp.api;

import java.util.ArrayList;

public interface LoadDataCallback<T> {

    void onSuccess(ArrayList<T> data);
    void onError(String message);

}

package TabbedApp.api;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

//@Parcel
public class ResponseObject<T> {

    @SerializedName("success")
    Boolean success;

    @SerializedName("data")
    JsonElement data;

    public ResponseObject() {
    }

    public Boolean isSuccess() {
        return success;
    }

    public JsonElement getData() {
        return data;
    }

}

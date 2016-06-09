import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Http {

    private static String REQUEST_URL = "http://84.236.114.224/api.php?";
    private static HttpClient client;

    public static void init() {
        Header header = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        List<Header> headers = new ArrayList<>();
        headers.add(header);
        client = HttpClients.custom().setDefaultHeaders(headers).build();
    }

    public static JSONObject doGet(HashMap<String, String> params) {
        try {
            HttpUriRequest request = RequestBuilder.get().setUri(generateURL(params)).build();
            HttpResponse response = client.execute(request);
            String jsonString = EntityUtils.toString(response.getEntity(), "UTF-8");
            JSONObject obj = new JSONObject(jsonString);
            return obj;
        } catch (IOException e) {
            return null;
        }
    }

    public static Object doPost(String params) {
        return null;
    }

    private static String generateURL(HashMap<String, String> params) {
        Iterator it = params.entrySet().iterator();
        String url = new String(REQUEST_URL);
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            url += "?" + pair.getKey() + "=" + pair.getValue();
            it.remove();
        }
        return url;
    }

}

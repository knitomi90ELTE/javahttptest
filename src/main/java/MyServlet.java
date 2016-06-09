import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MyServlet {

    public static void main(String[] args) throws IOException, ParseException {
        String REQUEST_URL = "";
        Header header = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        List<Header> headers = new ArrayList<>();
        headers.add(header);
        HttpClient client = HttpClients.custom().setDefaultHeaders(headers).build();
        HttpUriRequest request = RequestBuilder.get().setUri(REQUEST_URL).build();
        HttpResponse response = client.execute(request);
        String jsonString = EntityUtils.toString(response.getEntity(), "UTF-8");
        JSONObject obj = new JSONObject(jsonString);
        boolean success = obj.getBoolean("success");
        JSONArray arr = obj.getJSONArray("data");

    }

}

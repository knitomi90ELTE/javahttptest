package TabbedApp.unirestapi;

import TabbedApp.entity.Guitar;
import TabbedApp.entity.User;
import TabbedApp.helper.Debug;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UnirestLoad {

    private static String AUTHKEY = "authkey=QWERASDFYXCV";
    private static String URL = "http://192.168.0.254/api.php";

    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        try {
            HttpResponse<JsonNode> response = Unirest.get(URL + "?" + AUTHKEY + "&" + "action=getUsers").asJson();
            boolean success = response.getBody().getObject().getBoolean("success");
            Debug.debug("success: " + success);
            JSONArray data = response.getBody().getObject().getJSONArray("data");
            SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
            for(int i = 0; i < data.length(); i++) {
                JSONObject u = data.getJSONObject(i);
                java.util.Date d = format.parse(u.getString("birth_date"));
                users.add(new User(u.getInt("id"), u.getString("first_name"), u.getString("last_name"), new Date(d.getTime())));
            }
            Unirest.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return users;
        }
    }

    public static List<Guitar> getGuitars() {
        List<Guitar> guitars = new ArrayList<>();
        try {
            HttpResponse<JsonNode> response = Unirest.get(URL + "?" + AUTHKEY + "&" + "action=getGuitars").asJson();
            boolean success = response.getBody().getObject().getBoolean("success");
            Debug.debug("success: " + success);
            JSONArray data = response.getBody().getObject().getJSONArray("data");
            for(int i = 0; i < data.length(); i++) {
                JSONObject g = data.getJSONObject(i);
                guitars.add(new Guitar(g.getInt("id"), g.getString("brand"), g.getString("type"), g.getInt("year")));
            }
            Unirest.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return guitars;
        }
    }



}

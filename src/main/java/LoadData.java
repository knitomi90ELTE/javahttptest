import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class LoadData {

    public static ArrayList<User> loadUsers(){
        ArrayList<User> users = new ArrayList<>();
        HashMap<String, String> loadUsersParams = new HashMap<>();
        loadUsersParams.put("action", "getUsers");
        JSONObject response = Http.doGet(loadUsersParams);
        boolean success = response.getBoolean("success");
        JSONArray arr = response.getJSONArray("data");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < arr.length(); i++) {
            JSONObject jsonUser = arr.getJSONObject(i);
            try{
                java.util.Date parsed = format.parse(jsonUser.getString("birth_date"));
                User user = new User(
                        jsonUser.getInt("id"),
                        jsonUser.getString("first_name"),
                        jsonUser.getString("last_name"),
                        new Date(parsed.getTime())
                );
                System.out.println(user.toString());
            } catch (ParseException e) {
                System.out.println("parse exception");
                continue;
            }
        }
        return users;
    }

    public static ArrayList<Guitar> loadGuitars(){
        ArrayList<Guitar> guitars = new ArrayList<>();

        return guitars;
    }

}

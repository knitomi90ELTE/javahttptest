package TabbedApp.http;

public class LoadData {
    /*
    public static ArrayList<User> loadUsers() {
        ArrayList<User> users = new ArrayList<>();
        HashMap<String, String> loadUsersParams = new HashMap<>();
        loadUsersParams.put("action", "getUsers");
        JSONObject response = Http.doGet(loadUsersParams);
        boolean success = response.getBoolean("success");
        if (!success) return null;
        JSONArray arr = response.getJSONArray("data");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < arr.length(); i++) {
            JSONObject jsonUser = arr.getJSONObject(i);
            try {
                java.util.Date parsed = format.parse(jsonUser.getString("birth_date"));
                User user = new User(
                        jsonUser.getInt("id"),
                        jsonUser.getString("first_name"),
                        jsonUser.getString("last_name"),
                        new Date(parsed.getTime())
                );
                //System.out.println(user.toString());
            } catch (ParseException e) {
                System.out.println("parse exception");
                continue;
            }
        }
        return users;
    }

    public static ArrayList<Guitar> loadGuitars() {
        ArrayList<Guitar> guitars = new ArrayList<>();
        HashMap<String, String> loadGuitarsParams = new HashMap<>();
        loadGuitarsParams.put("action", "getGuitars");
        JSONObject response = Http.doGet(loadGuitarsParams);
        boolean success = response.getBoolean("success");
        if (!success) return null;
        JSONArray arr = response.getJSONArray("data");
        for (int i = 0; i < arr.length(); i++) {
            JSONObject jsonGuitar = arr.getJSONObject(i);
            Guitar guitar = new Guitar(
                    jsonGuitar.getInt("id"),
                    jsonGuitar.getString("brand"),
                    jsonGuitar.getString("type"),
                    jsonGuitar.getInt("year")
            );
            //System.out.println(guitar.toString());
        }
        return guitars;
    }*/

}

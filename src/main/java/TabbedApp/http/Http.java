package TabbedApp.http;

public class Http {
    /*
    private static String REQUEST_URL = "http://84.236.114.224/api.php?";
    private static String AUTHKEY = "QWERASDFYXCV";//for testing
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
        url += "authkey=" + AUTHKEY;
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            url += "&" + pair.getKey() + "=" + pair.getValue();
            it.remove();
        }
        return url;
    }*/

}

package TabbedApp.helper;

public class Debug {

    private static final boolean DEBUG = true;

    public static void debug(String message) {
        if(DEBUG) System.out.println("DEBUG: " + message);
    }

}

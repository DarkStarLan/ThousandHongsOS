package Main;

public class Path {
    public static String GetFileNameWithoutType(String Load) {
        int pos = Load.lastIndexOf('.');
        if (pos == -1) return "";
        int slash_pos = Load.lastIndexOf('/');
        return Load.substring(slash_pos == -1 ? 0 : slash_pos + 1, pos);
    }
    public static String GetFileNameWithType(String Load) {
        int slash_pos = Load.lastIndexOf('/');
        return Load.substring(slash_pos == -1 ? 0 : slash_pos + 1);
    }
}

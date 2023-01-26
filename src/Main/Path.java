package Main;

public class Path {
    public static String GetFileName(String Load) {
        int pos = Load.lastIndexOf('.');
        if (pos == -1) return "";
        int slash_pos = Load.lastIndexOf('/');
        return Load.substring(slash_pos == -1 ? 0 : slash_pos, pos);
    }
}

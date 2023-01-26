public class Path {
    public static String GetFileName(String Load) {
        int pos = Load.lastIndexOf('.');
        return (pos == -1 ? "" : Load.substring(0, pos));
    }
}

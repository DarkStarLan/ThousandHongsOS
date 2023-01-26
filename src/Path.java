public class Path {
    public static String GetFileName(String Load) {
        int pos = Load.lastIndexOf('.');
        if(pos == -1) return "";
        String fileName = Load.substring(pos, Load.length() - pos);
        return fileName;
    }
}

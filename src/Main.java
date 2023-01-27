import Main.Path;

public class Main {
    public static void main(String[] args) {
        String str = "D:/HelloWorld/abc.html";
        System.out.println(Path.GetFileNameWithoutType(str));
        System.out.println(Path.GetFileNameWithType(str));
        System.out.println("Hello world!");
    }
}
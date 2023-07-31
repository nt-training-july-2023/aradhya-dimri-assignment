package IO;
import java.io.File;

public class directory {

    public static void files(String Path) {
        File directory = new File(Path);

      
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid path or directory does not exist.");
        }
    }

    public static void main(String[] args) {
        
        String Path = "C:\\Users\\aradh\\OneDrive\\Documents";

        files(Path);
    }
}

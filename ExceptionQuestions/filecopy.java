package BasicJava3;
import java.io.*;

public class filecopy {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the source file name: ");
        String sourceFileName = null;
        System.out.print("Enter the destination file name: ");
        String destinationFileName = null;

        try {
            sourceFileName = consoleReader.readLine();
            destinationFileName = consoleReader.readLine();
        } catch (IOException e) {
            System.err.println("Error while reading file names: " + e.getMessage());
            System.exit(1);
        }

        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error while reading or writing the file: " + e.getMessage());
        }
    }
}
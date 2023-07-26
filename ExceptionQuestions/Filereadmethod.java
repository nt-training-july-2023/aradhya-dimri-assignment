package BasicJava3;

import java.io.*;

public class Filereadmethod {

    public static void readFile(String fileName) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = inputStream.read(buffer)) != -1) {
               
                String content = new String(buffer, 0, bytesRead);
                System.out.print(content);
            }
        } catch (IOException e) {
            System.err.println("Error while reading the file: " + e.getMessage());
        } finally {
            
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                System.err.println("Error while closing the file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the file name: ");
        String fileName = null;

        try {
            fileName = consoleReader.readLine();
        } catch (IOException e) {
            System.err.println("Error while reading file name: " + e.getMessage());
            System.exit(1);
        }

        readFile(fileName);
    }
}
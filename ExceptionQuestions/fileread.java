

package practice;
import java.io.*;
import java.util.Scanner;

public class fileread {
    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            Scanner sc = new Scanner(file);
            System.out.println("File Content:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Permission issue: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = inputScanner.nextLine();

        inputScanner.close();

        readFile(fileName);
    }
}

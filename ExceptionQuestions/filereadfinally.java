package practice;
import java.io.*;
import java.util.Scanner;

public class filereadfinally{
    public static void readFile(String fileName) {
        Scanner sc = null;
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            sc = new Scanner(file);
            System.out.println("File Content:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
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

package practice;
import java.io.*;
import java.util.Scanner;

public class filecopy {
    public static void filecopy(String source, String destination) {
        try {
            Scanner sc = new Scanner(new File(source));
            FileWriter fw = new FileWriter(new File(destination));
            while (sc.hasNextLine()) {
                fw.write(sc.nextLine());
            }
            fw.close();
            sc.close();
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String source = input.nextLine();

        System.out.print("Enter the destination file name: ");
        String destination = input.nextLine();

        input.close();

        filecopy(source, destination);
    }
}

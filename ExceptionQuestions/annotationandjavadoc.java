package BasicJava3;

import java.util.Scanner;

public class annotationandjavadoc {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length of the rectangle: ");
                    double len = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double area = len * width;
                    System.out.println("Area of Rectangle: " + area);
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double r = scanner.nextDouble();
                    double cArea = Math.PI *r * r;
                    System.out.println("Area of Circle: " + cArea);
                    break;
                case 3:
                    System.out.print("Enter base length of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of the triangle: ");
                    double height = scanner.nextDouble();
                    double tArea = 0.5 * base * height;
                    System.out.println("Area of Triangle: " + tArea);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
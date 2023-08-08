package Assignment1;

import java.util.Scanner;

public class traingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base:");
		int b;
		b = sc.nextInt();
		System.out.println("Enter Height:");
		int h;
		h = sc.nextInt();

		System.out.println("Result Area:");

		System.out.println(0.5 * b * h);
	}

}

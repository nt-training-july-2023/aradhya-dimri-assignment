package Assignment1;

import java.util.Scanner;

public class sumofn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num");
		int n;
		n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; ++i) {
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
	}
}
